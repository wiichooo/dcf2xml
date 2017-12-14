/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author mynor
 */
public class Registro {

    private String no; 
    private String valor;  
    private String columna;  
    private String fila; 

    public Registro(String no, String valor, String columna, String fila) {


        this.no = no; //itlab
        this.valor = valor;  //itnam
        this.columna = columna;  //sta
        this.fila = fila;  //le

    }

 

    public String getno() {
        return no;
    }

    public void setno(String no) {
        this.no = no;
    }

    public String getvalor() {
        return valor;
    }

    public void setvalor(String valor) {
        this.valor = valor;
    }

    public String getcolumna() {
        return columna;
    }

    public void setcolumna(String columna) {
        this.columna = columna;
    }

    public String getfila() {
        return fila;
    }

    public void setfila(String fila) {
        this.fila = fila;
    }

    
}
