/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author osman.mejia
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        doc = tp_texto.getStyledDocument();
        estilo = tp_texto.addStyle("miEstilo", null);

        DefaultComboBoxModel modelo=(DefaultComboBoxModel) cb_font.getModel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < fontNames.length; i++) {
            modelo.addElement(fontNames[i]);
        }
        cb_font.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tp_texto = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        cb_font = new javax.swing.JComboBox<>();
        cb_tamaño = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor Texto");

        tp_texto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tp_texto);

        jToolBar1.setRollover(true);

        cb_font.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fontItemStateChanged(evt);
            }
        });
        jToolBar1.add(cb_font);

        cb_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "18", "24", "36", "48", "60", "72" }));
        cb_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tamañoActionPerformed(evt);
            }
        });
        jToolBar1.add(cb_tamaño);
        jToolBar1.add(jSeparator2);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/negrita.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/Cursiva.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/Subrayado.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator1);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/fondo.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/letra.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton1);

        jToolBar2.setRollover(true);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/guardar.png"))); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jToolBar2.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/abrir.png"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jToolBar2.add(jButton7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        try {

            StyleConstants.setBackground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.yellow)
            );

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try {

            StyleConstants.setForeground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.red)
            );

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        // TODO add your handling code here:
        try {
            StyleConstants.setBold(estilo, true);

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try {
            StyleConstants.setItalic(estilo, true);

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        try {
            StyleConstants.setUnderline(estilo, true);

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void cb_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tamañoActionPerformed
        // TODO add your handling code here:
        StyleConstants.setFontSize(estilo, Integer.parseInt(cb_tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
    }//GEN-LAST:event_cb_tamañoActionPerformed

    private void cb_fontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fontItemStateChanged
        // TODO add your handling code here:
        StyleConstants.setFontFamily(estilo, cb_font.getSelectedItem().toString());
        //StyleConstants.setFontSize(estilo, Integer.parseInt(cb_tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
    }//GEN-LAST:event_cb_fontItemStateChanged

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = 
                    new FileNameExtensionFilter(
                            "El Inge Docs", "omf");
         jfc.setFileFilter(filtro); 
        int seleccion = jfc.showSaveDialog(this); 
       
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
             try {
                 
                  File fichero=null;
                if (jfc.getFileFilter().getDescription().equals(
                        "El Inge Docs")) {
                    fichero = 
                        new File(jfc.getSelectedFile().getPath()+".omf");
                }else{
                    fichero = jfc.getSelectedFile();
                }   
                
                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                Documento d=new Documento(tp_texto,doc,estilo);
                bw.writeObject(d);
                bw.flush();
                
                JOptionPane.showMessageDialog(this, 
                        "Archivo guardado exitosamente");  
                
            } catch (Exception e) {
                e.printStackTrace();
            }
                               
        }//fin IF
        try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
           } 
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        File fichero = null;
        FileInputStream entrada = null;
        ObjectInputStream objeto = null;        
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = 
                    new FileNameExtensionFilter(
                            "El Inge Docs", "omf");
            jfc.setFileFilter(filtro);                   
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
               fichero = jfc.getSelectedFile();
                entrada
                    = new FileInputStream(fichero);
                 objeto
                    = new ObjectInputStream(entrada);              
               tp_texto.setText("");  
               Documento temp=(Documento)objeto.readObject();
               tp_texto.setText( ((Documento)  temp  ).getPanel().getText() );
               tp_texto.setDocument( ((Documento)temp  ).getDoc()   ) ;
                
               
               
            } //fin if
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            objeto.close();
            entrada.close();
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_jButton7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_font;
    private javax.swing.JComboBox<String> cb_tamaño;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextPane tp_texto;
    // End of variables declaration//GEN-END:variables

    StyledDocument doc;
    Style estilo;

}
