/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author mynor
 */
public class TablaRenderizadorItems implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel etiqueta = new JLabel();
        etiqueta.setOpaque(true);
        /*
         * Coloreamos las filas
         */
        if (row % 2 == 0) {
            etiqueta.setBackground(new Color(218, 217, 217));
        } else {
            etiqueta.setBackground(Color.white);
        }
        /*
         * Para establecer el tipo de icono
         */
       // if (column == 2) {
            // String nombre = (String) value;
            //  etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
//            if (nombre.startsWith("#")) { //Hombre
//                etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blogspot/rolandopalermo/recursos/user.png"))); // NOI18N
//            } else if (nombre.startsWith("&")) { //Mujer
//                etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blogspot/rolandopalermo/recursos/user2.png"))); // NOI18N
//            }

         //   Color colorete = (Color) value;
            //System.out.print(value);

         //   etiqueta.setBackground(colorete);


            // etiqueta.setText(value.toString().substring(1, nombre.length()));
      //  } else {
            etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            etiqueta.setText(value.toString());
     //   }
        /*
         * Para una fila seleccionada
         */
        if (isSelected) {
            etiqueta.setBackground(new Color(151, 193, 215));
        }
        return etiqueta;
    }
}
