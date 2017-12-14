/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author mynor
 */
public class Item {

    private String itemLabel; 
    private String itemName;  
    private String start;  
    private String len;  
    private String dataType; 
    private String itemType;
    private String occ;  
    private String dec; 
    private String decChar; 
    private String zeroFill; 

    public Item(String itemLabel, String itemName, String start, String len, String dataType,String itemType, String occ, String dec, String decChar, String zeroFill) {


        this.itemLabel = itemLabel; //itlab
        this.itemName = itemName;  //itnam
        this.start = start;  //sta
        this.len = len;  //le
        this.dataType = dataType;  //dat
        this.itemType=itemType;
        this.occ = occ;  //oc
        this.dec = dec;  //dec
        this.decChar = decChar; //decc
        this.zeroFill = zeroFill; //zef
    }

 

    public String getItemLabel() {
        return itemLabel;
    }

    public void setItemLabel(String itemLabel) {
        this.itemLabel = itemLabel;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLen() {
        return len;
    }

    public void setLen(String len) {
        this.len = len;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    
      public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getDecChar() {
        return decChar;
    }

    public void setDecChar(String decChar) {
        this.decChar = decChar;
    }

    public String getZeroFill() {
        return zeroFill;
    }

    public void setZeroFill(String zeroFill) {
        this.zeroFill = zeroFill;
    }

 
}
