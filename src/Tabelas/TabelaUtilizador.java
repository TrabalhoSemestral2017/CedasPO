/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import model.Utilizador;

/**
 *
 * @author Armano
 */
public class TabelaUtilizador  extends AbstractTableModel{
    private static final int NR_Colunas = 6;
    private static final String[] colunasNomes = {"Nome" ," funcionario", "ID    ", "Apelido ", "categoria","Data Registo"};
    private static List<Utilizador> list;
    private static Class<?>[] colunaTipos =  { String.class, String.class, String.class,String.class, String.class,String.class};

   public TabelaUtilizador(List<Utilizador> list) {
        TabelaUtilizador.list = list;
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
        Utilizador f = list.get(rowIndex);
        switch (columnIndex) {
            case 1:
                return f.getIdutilizador();
            case 2:
                return f.getUsername();
            case 3:
                return f.getPassword();
            case 4:
                return f.getCategoria();
            case 5:
                return f.getData();
            case 0:
                return f.getFuncionario();
            
          
        }
        return null;
    }
    
    
}
