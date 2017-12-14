/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dcf2xml;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Mynor
 */
class Mensajes {

 int advertencia(String textomsgbox, String titulomsgbox) {
        Component frame = null;
       int n = JOptionPane.showConfirmDialog(
    frame,
    textomsgbox,
    titulomsgbox,
    JOptionPane.YES_NO_OPTION);
       // System.out.println (n);
       //1 no 
       //0 si
        return n;
       
    }
 
  void error(String textomsgbox, String titulomsgbox) {
        Component frame = null;
       JOptionPane.showMessageDialog(
    frame,
    textomsgbox,
    titulomsgbox,
    JOptionPane.OK_OPTION);
    }
}
