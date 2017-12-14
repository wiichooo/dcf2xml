/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author mynor
 */
public class Record {

    private String Label; 
    private String Name;  
    private String RecordTypeValue;  
    private String Required;  
    private String MaxRecords; 
    private String RecordLen;

    public Record(String Label, String Name, String RecordTypeValue, String Required, 
            String MaxRecords,String RecordLen) {


        this.Label = Label; 
        this.Name = Name; 
        this.RecordTypeValue = RecordTypeValue;  
        this.Required = Required;  
        this.MaxRecords = MaxRecords;  
        this.RecordLen=RecordLen;
    }

 

    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getRecordTypeValue() {
        return RecordTypeValue;
    }

    public void setRecordTypeValue(String RecordTypeValue) {
        this.RecordTypeValue = RecordTypeValue;
    }

    public String getRequired() {
        return Required;
    }

    public void setRequired(String Required) {
        this.Required = Required;
    }

    public String getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(String MaxRecords) {
        this.MaxRecords = MaxRecords;
    }

    
      public String getRecordLen() {
        return RecordLen;
    }

    public void setRecordLen(String RecordLen) {
        this.RecordLen = RecordLen;
    }
}
