/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Funcionario;
import model.Residencia;
import model.Utilizador;
import org.hibernate.Session;
import util.HibernateUtil;


/**
 *
 * @author Armano
 */
public class TabelaResidencia extends AbstractTableModel{
    
    private static final int NR_Colunas = 10;
    private static final String[] colunasNomes = {"Nome ", "ID ","Bloco","Tipo","Disponibilidade","Estado","ValorArendamento","valorReabilitacao","Localizacao","Data Registo"};
    private static List<Residencia> list = new ArrayList<>();
    private static Class<?>[] colunaTipos = { String.class, String.class, String.class,String.class, String.class, String.class, String.class,String.class, String.class,String.class};

    
    public TabelaResidencia() {
    }

     public Residencia mouseclick(int posicao){
        return list.get(posicao);
     }

    public static Residencia getUsuarioAt(int index) {
        return list.get(index);
    }

    
 public TabelaResidencia(java.util.List<Residencia> list) {
       
        TabelaResidencia.list = list;
    
    }
  
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Residencia r = list.get(rowIndex);
        switch (columnIndex) {
            case 1:
                return r.getIdResidencia();
            case 0:
                return r.getNome();
            case 2:
                return r.getBloco();
            case 3:
                return r.getTipo();
            case 5:
                return r.getEstado();
            case 4:
                return r.getEstadoOucupado();
            case 6:
                return r.getValorArendamento();
            case 7:
                return r.getValorReabilitacaoMax();
             case 8:
                return r.getLocalizacao();
            case 9:
                return r.getDataRegisto();
                
                
        }
        return null;
    }
   public void lerTabela(){
       list.clear();
       Session  sessao=HibernateUtil.getSessionFactory().openSession();
      sessao.beginTransaction();
      list.addAll(sessao.createQuery("SELECT r FROM Residencia r ").list());
       fireTableRowsInserted(list.size()-1, list.size()-1);
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
}
