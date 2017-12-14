/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author mynor
 */
public class ValueSet {

    private String Label; 
    private String Name;  
    private String ValueLabel;  
    private String ValueName;  
    private String Value;

    public ValueSet(String Label, String Name, String ValueLabel, String ValueName, 
            String Value) {


        this.Label = Label; 
        this.Name = Name; 
        this.ValueLabel = ValueLabel;  
        this.ValueName = ValueName;  
        this.Value = Value; 
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

    public String getValueLabel() {
        return ValueLabel;
    }

    public void setValueLabel(String ValueLabel) {
        this.ValueLabel = ValueLabel;
    }

    public String getValueName() {
        return ValueName;
    }

    public void setValueName(String ValueName) {
        this.ValueName = ValueName;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }
}
