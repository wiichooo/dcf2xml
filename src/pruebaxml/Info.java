/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;

/**
 *
 * @author Luis
 */
public class Info {
    String xml;
    String salida;
    LeerXml lector;
    ArrayList<Node> records;
    Node aux;
    
    public Info(String xml, String salida){
        this.salida = salida;
        this.xml = xml;
        lector = new LeerXml(xml);
        records = lector.getNodosHijos(lector.getRaiz());
//        Iterator ilist = records.iterator();
//        while(ilist.hasNext()){
//            System.out.println(lector.getAtt((Node)ilist.next(),"Label"));
//        }
    }
    public void getIn(){
       String[] listalineas = null;
       Merge(listalineas); 
    }

    private void Merge(String[] lineas) {   
 
                Node aux = null;       
                lineas = salida.split("\n");
                String tipo = "";
                String data = "";
                    
                    for(int x = 0; x < lineas.length; x++){
                        tipo = String.valueOf(lineas[x].charAt(0));
                        aux = lector.getIdItems();
                        if(aux != null){
                            data += DataItems(lineas[x], aux);
                        }
                        aux = getNodeRecord(tipo);
                        if(aux != null) {
                            data += Data(lineas[x], aux);
                        }
                    }
//                    System.out.println(data);
//                    new PruebaXML().writeFile("C:\\PAQUETES\\SALIDA.txt", data);
                    
    }
    
    public Node getNodeRecord(String tipo){
        Node aux = null;
        Iterator ilist = records.iterator();
        while(ilist.hasNext()){
            aux = (Node) ilist.next();
            if(lector.getAtt(aux, "RecordTypeValue").equals(tipo)){
          
                return aux;
            }
        }
        return null;
    }

    private String Data(String string, Node aux) {
        String salida = "Nombre Record: " + lector.getAtt(aux, "Name") + "\t"
                + "Label Record: " + lector.getAtt(aux, "Label") + "\t";
        
        ArrayList<Node> hijos = lector.getNodosHijos(aux);
        Iterator ihijos = hijos.iterator();
        Node hijo = null;
        int start;
        int len;
        String Nombre;
        String Label;
        String Valor = "";
        while(ihijos.hasNext()){
            hijo = (Node) ihijos.next();
            start = Integer.valueOf(lector.getStart(hijo));
            len = Integer.valueOf(lector.getLen(hijo));
            Nombre = lector.getAtt(hijo, "Name");
            Label = lector.getAtt(hijo, "Label");
            try{
            Valor = string.substring(start-1, start-1+len);
            }catch(Exception e){}
            salida += "Item: " + Nombre + " " + Label + " Valor Digitado: " + Valor 
                    + " Valor Label: "+ lector.getLabelByItemValue(hijo, Valor) + "\t";
        }
        salida += "\n";
        return salida;
    }
    private String DataItems(String string, Node aux){
        String salida = "";
        ArrayList<Node> hijos = lector.getNodosHijos(aux);
        Iterator ihijos = hijos.iterator();
        Node hijo = null;
        int start;
        int len;
        String Nombre;
        String Label;
        String Valor = "";
        while(ihijos.hasNext()){
            hijo = (Node)ihijos.next();
            start = Integer.valueOf(lector.getStart(hijo));
            len = Integer.valueOf(lector.getLen(hijo));
            Nombre = lector.getAtt(hijo, "Name");
            Label = lector.getAtt(hijo, "Label");
            try{
                Valor = string.substring(start-1,start-1+len);
            }catch(Exception e){}
            
            salida += "IdItem: " + Nombre + " " + Label + " Valor Digitado: " + Valor
                    + " Valor Label: " + lector.getLabelByItemValue(hijo, Valor) + "\t";
        }
        return salida;
    }
}
