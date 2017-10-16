package tabela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Funcionario;


/**
 *
 * @author Agostinho
 */
public class TabelaFuncionario extends AbstractTableModel{

    private static final int NR_Colunas = 6;
    private static final String[] colunasNomes = {"id Funcionario", "nome", "Apelido", "nacionalidade", "genero", "funcao"};
    private static List<Funcionario> list;
    private static Class<?>[] colunaTipos =  {String.class, String.class, String.class, String.class, String.class, String.class};
    
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
        Funcionario Func = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return Func.getIdfuncionario();
            case 1:
                return Func.getNome();               
            case 2:
                return Func.getApelido();
            case 3:
                return Func.getNacionalidade();
            case 4:
                return Func.getGenero();
            case 5:
                return Func.getFuncao();
        }
        return null;
    }

}
