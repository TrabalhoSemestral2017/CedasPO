package tabela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;


/**
 *
 * @author Agostinho
 */
public class TabelaCliente extends AbstractTableModel{

    private static final int NR_Colunas = 11;
    private static final String[] colunasNomes = {"id Cliente", "nome", "Apelido","genero", "nacionalidade","residencia","tipo de doc","numero","validade","contacto","contactoEmerg"};
    private static List<Cliente> list;
    private static Class<?>[] colunaTipos =  {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    
    public TabelaCliente(List<Cliente> list) {
        TabelaCliente.list = list;
    }

    public static Cliente getUsuarioAt(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return NR_Colunas;
    }

    @Override
    public String getColumnName(int column) {
        return colunasNomes[column];
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        return colunaTipos[coluna];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getIdCliente();
            case 1:
                return cliente.getNome();               
            case 2:
                return cliente.getApelido();
                 case 3:
                return cliente.getGenero();
            case 4:
                return cliente.getNacionalidade();
            case 5:
                
                return cliente.getResidencia();
                 case 6:
                return cliente.getTipoDecumentoIdent();
                 case 7:
                return cliente.getNomero();
                 case 8:
                return cliente.getValidade();
                 case 9:
                return cliente.getContacto();
                 case 10:
                return cliente.getContactoEmerg();
        }
        return null;
    }

}
