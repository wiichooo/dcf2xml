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
public class TablaModeloItem extends AbstractTableModel {

    private List<Item> items = new ArrayList<Item>();

    public void agregarItem(Item item) {
        items.add(item);
        fireTableDataChanged();
    }

    public void eliminarItem(int rowIndex) {
        items.remove(rowIndex);
        fireTableDataChanged();
    }

    public void limpiarItem() {
        items.clear();
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
                return "Label";
            case 1:
                return "Name";
            case 2:
                return "Start";
            case 3:
                return "Len";
            case 4: 
                return "DataType";
            case 5: 
                return "ItemType";
            case 6: 
                return "Occ";
            case 7:
                return "Decimal";
            case 8:
                return "DecChar";
            case 9:
                return "ZeroFill";
                
                   
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return items.get(rowIndex).getItemLabel();
            case 1:
                return items.get(rowIndex).getItemName();
            case 2:
                return items.get(rowIndex).getStart();
            case 3:
                return items.get(rowIndex).getLen();
            case 4:
                return items.get(rowIndex).getDataType();
            case 5: 
                return  items.get(rowIndex).getItemType();
            case 6:
                return items.get(rowIndex).getOcc();
            case 7:
                return items.get(rowIndex).getDec();
            case 8:
                return items.get(rowIndex).getDecChar();
            case 9:
                return items.get(rowIndex).getZeroFill();
                     
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
        Item item = items.get(rowIndex);
        switch (columnIndex) {
            case 0:
                item.setItemLabel((String) value);
            case 1:
                item.setItemName((String) value);
            case 2:
                item.setStart((String) value);
            case 3:
                item.setLen((String) value);
            case 4:
                item.setDataType((String) value);
            case 5:
                 item.setItemType((String) value);
            case 6:
                item.setOcc((String) value);
            case 7:
                item.setDec((String) value);
            case 8:
                item.setDecChar((String) value);
            case 9:
                item.setZeroFill((String) value);

                
                

        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
