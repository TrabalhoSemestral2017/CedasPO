/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import model.Utilizador;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Armano
 */
public class TabelaUsuario  extends AbstractTableModel{
    private static final int NR_Colunas = 5;
    private static final String[] colunasNomes = {"Nome" , "ID   ",  "categoria","Data Registo"};
    private static List<Utilizador> list;
    private static Class<?>[] colunaTipos =  {  String.class, String.class, String.class,String.class};

   public TabelaUsuario(List<Utilizador> list) {
        TabelaUsuario.list = list;
    }

    public static Utilizador getUsuarioAt(int index) {
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

//    @Override
//    public String getColumnName(int column) {
//        return colunasNomes[column];
//    }

//    @Override
//    public Class<?> getColumnClass(int coluna) {
//        return colunaTipos[coluna];
//    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Utilizador f = list.get(rowIndex);
        switch (columnIndex) {
            case 1:
                return f.getIdutilizador();
            case 0:
                return f.getUsername();
            case 2:
                return f.getPassword();
            case 3:
                return f.getCategoria();
            case 4:
                return f.getData();
           
          
        }
        return null;
    }
    
     public void lerTabela(){
       list.clear();
       Session  sessao=HibernateUtil.getSessionFactory().openSession();
      sessao.beginTransaction();
      list.addAll(sessao.createQuery("SELECT f FROM  Utilizador f").list());
       fireTableRowsInserted(list.size()-1, list.size()-1);
   }   
}
