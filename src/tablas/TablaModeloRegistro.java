/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mynor
 */
public class TablaModeloRegistro extends AbstractTableModel {

    private List<Registro> regs = new ArrayList<Registro>();

    public void agregarRegistro(Registro registro) {
        regs.add(registro);
        fireTableDataChanged();
    }

    public void eliminarRegistro(int rowIndex) {
        regs.remove(rowIndex);
        fireTableDataChanged();
    }

    public void limpiarRegistro() {
        regs.clear();
        fireTableDataChanged();
    }

    @Override
     // Devuelve el nombre de cada columna. Este texto aparecer� en la
        // cabecera de la tabla.
    public String getColumnName(int columnIndex) {
//        return columnNames[columnIndex];
        
        switch (columnIndex)
        {
        
            case 0:
                return "No.";
            case 1:
                return "Valor Digitado";
            case 2:
                return "Posición Columna";
            case 3:
                return "Posición Fila";             
                   
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return regs.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return regs.get(rowIndex).getno();
            case 1:
                return regs.get(rowIndex).getvalor();
            case 2:
                return regs.get(rowIndex).getcolumna();
            case 3:
                return regs.get(rowIndex).getfila();                     
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
//        return getValueAt(0, columnIndex).getClass();
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Registro registro = regs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                registro.setno((String) value);
            case 1:
                registro.setvalor((String) value);
            case 2:
                registro.setcolumna((String) value);
            case 3:
                registro.setfila((String) value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
