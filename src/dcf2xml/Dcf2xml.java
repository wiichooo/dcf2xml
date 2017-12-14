/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dcf2xml;

import java.awt.Component;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mynor
 */
public class Dcf2xml {


    public static final String HELLO_MESSAGE = "already running";
    public static final int PORT = 7777;
    private Component frame;

    public Dcf2xml() {
        new Thread() {

            @Override
            public void run() {
                listen();
            }
        }.start();
    }

    public void listen() {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(PORT);
        } catch (IOException e) {
            Socket s = null;
            try {
                s = new Socket("127.0.0.1", PORT);
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String message = dis.readUTF();
                if (HELLO_MESSAGE.equals(message)) {
                    //   textField.setText("La aplicación ya se está ejecutando");
                    System.out.print("La aplicación ya se está ejecutando");
                    JOptionPane.showMessageDialog(frame,
                            "Intento acceder dos veces a la misma aplicacion. La"
                            + " aplicación ya se está ejecutando",
                            "ERROR, Aplicación",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    // textField.setText("Mmmm... algo se está ejecutando, pero  no parece ser nuestra aplicación");
                    System.out.print("Mmmm... algo se está ejecutando, pero no"
                            + " parece ser nuestra aplicación");
                    JOptionPane.showMessageDialog(frame,
                            "Mmmm... algo se está ejecutando, pero no parece ser"
                            + " nuestra aplicación",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                }
            } catch (IOException ioe) {
                //    textField.setText("Ops. No se ha podido crear el ServerSocket ni conectar al puerto indicado...");
                System.out.print("Ops. No se ha podido crear el ServerSocket ni"
                        + " conectar al puerto indicado...");
                JOptionPane.showMessageDialog(frame,
                        "Ops. No se ha podido crear el ServerSocket ni conectar"
                        + " al puerto indicado...",
                        "ERROR, Aplicación",
                        JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (s != null) {
                        s.close();
                    }
                } catch (Exception ex) {
                }
            }
            return;
        }
        //    textField.setText("Somos la primera instancia de la aplicación!");
        System.out.print("Somos la primera instancia de la aplicación!");
        new Thread() {

            @Override
            public void run() {
                try {
                    ejecutarAplicacion();
                } catch (IOException ex) {
                    Logger.getLogger(Dcf2xml.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();

        try {
            Socket s = null;
            while ((s = ss.accept()) != null) {
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF(HELLO_MESSAGE);
                s.close();
            }
        } catch (Exception e) {
            // TODO
        }
    }

    
      private void ejecutarAplicacion() throws IOException {
        // lanzar aquí el resto de la aplicación

        Inicio dialog = null;
       
            dialog = new Inicio();
      
        dialog.setLocationRelativeTo(null);
        dialog.setExtendedState(dialog.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        dialog.setVisible(true);


      
      }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

               Dcf2xml c = new Dcf2xml(); 
            }
        });
    }
}