package Tabelas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Cliente;

/**
 *
 * @author Agostinho
 */
public class TabelaCliente extends AbstractTableModel{

    private ArrayList<Cliente> linhas;
    private String[] colunas = {"nome", "apelido", "tipo de documento", 
                                "numero do documento", "validade", "nacionalidade",
                                "morada", "email", "telefone"};

    public TabelaCliente(ArrayList<Cliente> linhas, String[] colunas) {
       linhas  = new ArrayList<Cliente>();
        this.setLinhas(linhas);
        this.setColunas(colunas);
    }

    public TabelaCliente(List<Cliente> list) {
        this.setLinhas(linhas);
    }
    
    
    public void setColunas(String [] colunas){
        this.colunas = colunas;
        fireTableStructureChanged();
    }

   
    public ArrayList<Cliente> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Cliente> linhas) {
        this.linhas = linhas;
        this.fireTableDataChanged();
    }

    public void addCliente(Cliente cliente){
        linhas.add(cliente);
        fireTableRowsInserted(linhas.size()-1, linhas.size()-1);
    }
    
    
    public String[] getColunas() {
        return colunas;
    }

   
    public void actualizar(int linha, Cliente cliente){
        linhas.set(linha, cliente);
        fireTableRowsUpdated(linha, linha);
    }

    public void setListaDeCliente(ArrayList<Cliente> cliente){
        linhas = cliente;
        fireTableDataChanged();
    }
    
    public Cliente getCliente(int linha){
        return linhas.get(linha);
    }
    
    public void remover(int linha){
        linhas.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
     @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
     @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = linhas.getClass(rowIndex);
        switch(columnIndex){
            case 0: return cliente.getCodCliente();
            case 1: return cliente.getNome();
            case 2: return cliente.getApelido();
            case 3: return cliente.getTipoDocIdentif();
            case 4: return cliente.getNumeroDoc();
             case 5: return cliente.getDataValidade();
            case 6: return cliente.getNacionalidade();
            case 7: return cliente.getMorada();
            case 8: return cliente.getEmail();
            case 9: return cliente.getTelefone();
            
        }
        return null;
    }

}
