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
public class TablaModeloValueSet extends AbstractTableModel {

    private List<ValueSet> valueset = new ArrayList<ValueSet>();

    public void agregarValueSet(ValueSet valuset) {
        valueset.add(valuset);
        fireTableDataChanged();
    }

    public void eliminarValueSet(int rowIndex) {
        valueset.remove(rowIndex);
        fireTableDataChanged();
    }

    public void limpiarValueSet() {
        valueset.clear();
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
                return "ValueSetLabel";
            case 1:
                return "ValueSetName";
            case 2:
                return "ValueLabel";
            case 3:
                return "Special";
            case 4: 
                return "Value";                                 
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return valueset.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return valueset.get(rowIndex).getLabel();
            case 1:
                return valueset.get(rowIndex).getName();
            case 2:
                return valueset.get(rowIndex).getValueLabel();
            case 3:
                return valueset.get(rowIndex).getValueName();
            case 4:
                return valueset.get(rowIndex).getValue();                    
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
        ValueSet valuset = valueset.get(rowIndex);
        switch (columnIndex) {
            case 0:
                valuset.setLabel((String) value);
            case 1:
                valuset.setName((String) value);
            case 2:
                valuset.setValueLabel((String) value);
            case 3:
                valuset.setValueName((String) value);
            case 4:
                valuset.setValue((String) value);

        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
