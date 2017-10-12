/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Funcionario;

/**
 *
 * @author Armano
 */
public class TabelaFuncionario extends AbstractTableModel{
    private static final int NR_Colunas = 8;
    private static final String[] colunasNomes = {"Nome do funcionario", "ID    ", "Apelido ", "Nacionalidade", "categoria","Genero", "Data nascimento","Data Registo"};
    private static List<Funcionario> list;
    private static Class<?>[] colunaTipos =  {String.class, String.class, String.class, String.class,String.class, String.class, String.class, String.class,String.class};

   public TabelaFuncionario(List<Funcionario> list) {
        TabelaFuncionario.list = list;
    }

    public static Funcionario getUsuarioAt(int index) {
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
        Funcionario f = list.get(rowIndex);
        switch (columnIndex) {
            case 1:
                return f.getIdfuncionario();
            case 0:
                return f.getNome();
            case 2:
                return f.getApelido();
            case 3:
                return f.getNacionalidade();
            case 4:
                return f.getCategoria();
            case 5:
                return f.getGenero();
            case 6:
                return f.getDataNascimento();
            case 7:
                return f.getDataRegisto();
           
                
                
        }
        return null;
    }
    
}
