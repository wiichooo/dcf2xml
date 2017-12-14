package progressmonitor;

import dcf2xml.Inicio;
import dcf2xml.PrXML;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * ProgressBar.java is a 1.4 application that requires these files:
 *   LongTask.java
 *   SwingWorker.java
 */
public class ProgressBar  extends javax.swing.JDialog {
    public final static int ONE_SECOND = 1000;

    private JProgressBar progressBar;
    private Timer timer;
    private LongTask task;
    private JDialog a;
    Inicio ini;
    PrXML aThis;
    public ProgressBar(String path, final Inicio ini, String charset) {
        super();
        this.ini = ini;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procesando....");
        setPreferredSize(new java.awt.Dimension(184, 60));
        setResizable(false);
        task = new LongTask(path, charset);
        a = this;
        progressBar = new JProgressBar(0, task.getLengthOfTask());
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
    
        JPanel panel = new JPanel();
        panel.add(progressBar);

        add(panel, BorderLayout.PAGE_START);
         //Display the window.
        pack();
        setVisible(true);
        this.setAlwaysOnTop(true);
        //Create a timer.
        timer = new Timer(ONE_SECOND, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                progressBar.setValue(task.getCurrent());
                if (task.isDone()) {
                    progressBar.setValue(progressBar.getMaximum());
                    Toolkit.getDefaultToolkit().beep();
                    timer.stop();
                    setCursor(null); //turn off the wait cursor
                    
                    ini.setEntrada(task.getEntrada());
                    a.dispose();
                }
            }
        });
        task.go();
        timer.start();
    }

    public ProgressBar(String fileName, final PrXML aThis, String charset) {
        super();
        this.aThis =aThis;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procesando....");
        setPreferredSize(new java.awt.Dimension(184, 60));
        setResizable(false);
        task = new LongTask(fileName, charset);
        a = this;
        progressBar = new JProgressBar(0, task.getLengthOfTask());
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        JPanel panel = new JPanel();
        panel.add(progressBar);
        this.setAlwaysOnTop(true);
        add(panel, BorderLayout.PAGE_START);
         //Display the window.
        setVisible(true);
        pack();
        
        
        //Create a timer.
        timer = new Timer(ONE_SECOND, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                progressBar.setValue(task.getCurrent());
                if (task.isDone()) {
                    progressBar.setValue(progressBar.getMaximum());
                    Toolkit.getDefaultToolkit().beep();
                    timer.stop();
                    setCursor(null); //turn off the wait cursor
                    
                    aThis.setXMl(task.getEntrada());
                    a.dispose();
                }
            }
        });
        task.go();
        timer.start();
    }
 
}

