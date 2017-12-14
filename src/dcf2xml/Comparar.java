/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dcf2xml;

import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import pruebaxml.Info;
import pruebaxml.LeerXml;
import pruebaxml.PruebaXML;

/**
 *
 * @author Luis
 */
public class Comparar {
    String xml = "";
    public Comparar(String xml, String a, String b){
        String[] A = a.split("\n");
        String[] B = b.split("\n");
        this.xml = xml;
        Comparacion(A,B);
    }

    private void Comparacion(String[] A, String[] B) {
        String salida = "";
        int dif = 0;
        boolean iguales = true;
        if(A.length == B.length){
            for(int x = 0; x < A.length; x++){
                if(!A[x].equals(B[x])){
                    dif += 1;
                    salida += dif + "\nDiferencia en la linea: " + (x+1) + "\n";
                    int col = getCol(A[x],B[x]);
                    salida += "Diferencia en la colum: " + (col+1) + "\n";
                    salida += "OutA: " + buscarVar(A[x], String.valueOf(A[x].charAt(0)), (col+1)) + "\n";
                    salida += "OutB: " + buscarVar(B[x], String.valueOf(B[x].charAt(0)), (col+1)) + "\n\n";
                    iguales = false;
                }
            }
            if(iguales)
                System.out.println("Archivos iguales");
        }else{
            System.err.println("¡Los archivos no tienen la misma cantidad de records!");
        }
        new PruebaXML().writeFile("C:\\PAQUETES\\DIF.txt", salida);
    }

    private int getCol(String string, String string0) {
        String dif = "";
        if(string.length() >= string0.length()) {
            for(int c = 0; c < string.length(); c++){
                if(!String.valueOf(string.charAt(c)).equals(String.valueOf(string0.charAt(c)))){
                    dif += String.valueOf(c);
                    return c;
                }
            }
        }
        return 0;
    }
    
    private String buscarVar(String contenido, String rec, int columna){
        Node aux = new Info(xml, "").getNodeRecord(rec);
        System.out.println(aux.getAttributes().getNamedItem("Label").getNodeValue());
        String salida = "";
        LeerXml lector = new LeerXml();
        ArrayList lista = lector.getNodosHijos(aux);
        Iterator ihijos = lista.iterator();
        
        Node hijo = null;
        int start;
        int len;
        String Nombre;
        String Label;
        String Valor;
        while(ihijos.hasNext()){
            hijo = (Node) ihijos.next();
            start = Integer.valueOf(lector.getStart(hijo));
            len = Integer.valueOf(lector.getLen(hijo));
            
            if(start <= columna && (start + len) > columna){
                System.out.println(start + " "+ len + " " + columna + " ");
                        Nombre = lector.getAtt(hijo, "Name");
                        Label = lector.getAtt(hijo, "Label");
                        Valor = contenido.substring(start-1, start-1+len);

                        salida += "Item: " + Nombre + " " + Label + " Valor Digitado: " + Valor;
            }
        }
        return salida;
    }
}
