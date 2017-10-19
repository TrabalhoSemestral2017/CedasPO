package tabela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Aluguer;


/**
 *
 * @author 
 */
public class TabelaAluguer extends AbstractTableModel{

    private static final int NR_Colunas = 4;
    private static final String[] colunasNomes = {"id_aluguer", "id_cliente", "data", "prazo"};
    private static List<Aluguer> list;
    private static Class<?>[] colunaTipos =  {String.class, String.class, String.class, String.class};
    
    public TabelaAluguer(List<Aluguer> list) {
        TabelaAluguer.list = list;
    }

    public static Aluguer getUsuarioAt(int index) {
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
        Aluguer ve = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ve.getIdaluguer();
            case 1:
                return ve.getCliente();               
            case 2:
                return ve.getData();
            case 3:
                return ve.getPrazoContrato();
            case 4:
                return ve.getResidencia();
            case 5:
                return ve.getUtilizador();
        }
        return null;
    }

}
