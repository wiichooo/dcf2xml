/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author mynor
 */
public class TablaModeloRecord extends AbstractTableModel {

    private List<Record> records = new ArrayList<Record>();
    
    public void agregarRecord(Record record) {
        records.add(record);
        fireTableDataChanged();
    }

    public void eliminarRecord(int rowIndex) {
        records.remove(rowIndex);
        fireTableDataChanged();
    }

    public void limpiarRecord() {
        records.clear();
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
                return "RecordTypeValue";
            case 3:
                return "Required";
            case 4: 
                return "MaxRecords"; 
            case 5: 
                return "RecordLen"; 
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return records.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return records.get(rowIndex).getLabel();
            case 1:
                return records.get(rowIndex).getName();
            case 2:
                return records.get(rowIndex).getRecordTypeValue();
            case 3:
                return records.get(rowIndex).getRequired();
            case 4:
                return records.get(rowIndex).getMaxRecords();
            case 5: 
                return records.get(rowIndex).getRecordLen();                    
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
        Record record = records.get(rowIndex);
        switch (columnIndex) {
            case 0:
                record.setLabel((String) value);              
            case 1:
                record.setName((String) value);
            case 2:
                record.setRecordTypeValue((String) value);
            case 3:
                record.setRequired((String) value);
            case 4:
                record.setMaxRecords((String) value);
            case 5:
                record.setRecordLen((String) value);                     

        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    

}
