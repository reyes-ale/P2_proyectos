/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_archivos_graficos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author omejia
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_arbol = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("mi pc");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(arbol);

        jButton1.setText("Cargar Arbol");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_arbolLayout = new javax.swing.GroupLayout(jd_arbol.getContentPane());
        jd_arbol.getContentPane().setLayout(jd_arbolLayout);
        jd_arbolLayout.setHorizontalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbolLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_arbolLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jd_arbolLayout.setVerticalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        ta_1.setColumns(20);
        ta_1.setRows(5);
        jScrollPane1.setViewportView(ta_1);

        jMenu1.setText("Archivo");

        jMenuItem3.setText("Crear Directorio");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Listar Directorio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Abrir Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar Archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("Listar Directorio Arbol");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        ta_1.setText("");
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = 
                    new FileNameExtensionFilter(
                            "Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2 = 
                new FileNameExtensionFilter(
                        "Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);            
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
               fichero = jfc.getSelectedFile();
               fr = new FileReader(fichero);
               br=new BufferedReader(fr);
               String linea;
               ta_1.setText("");
               while(  (linea=br.readLine()) !=null  ){                    
                    ta_1.append(linea);
                    ta_1.append("\n");
                }
            } //fin if
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = 
                    new FileNameExtensionFilter(
                            "Archivos de Texto", "txt");
         jfc.addChoosableFileFilter(filtro); 
        int seleccion = jfc.showSaveDialog(this);        
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
             try {
                 
                  File fichero=null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero = 
                        new File(jfc.getSelectedFile().getPath()+".txt");
                }else{
                    fichero = jfc.getSelectedFile();
                }                             
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(ta_1.getText());
                ta_1.setText("");
                bw.flush();         
                JOptionPane.showMessageDialog(this, 
                        "Archivo guardado exitosamente");  
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
           }                     
        }//fin IF
}//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();//muestra el file chooser sin nesc.mente ponerlo en la gui
        int seleccion = fileChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            boolean fueCreado = dir.mkdir();
            
            if (fueCreado) {
                JOptionPane.showMessageDialog(this,
                        "Directorio Creado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this,
                        "El directorio no fue creado");
            }
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed


    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ta_1.setText("");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(
                JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            File[] files = dir.listFiles(); //devuelve arreglo de files
            for (File file : files) {
                if (file.isDirectory()) {
                    ta_1.append("Directorio:" + file.getName() + "\n");
                }
                if (file.isFile()) {
                    ta_1.append("Archivo:" + file.getName() + "\n");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        DefaultTreeModel m=(DefaultTreeModel) arbol.getModel();
        JFileChooser jf=new JFileChooser();
        jf.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
        int s=jf.showOpenDialog(jd_arbol);
        File f=jf.getSelectedFile();
        m.setRoot(new DefaultMutableTreeNode(f.getName()));
        //listar_no_orden(f,(DefaultMutableTreeNode)m.getRoot());
        listar_todo(f,(DefaultMutableTreeNode)m.getRoot());
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jd_arbol.setModal(true);
        jd_arbol.pack();
        jd_arbol.setLocationRelativeTo(this);
        jd_arbol.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    
public void listar_no_orden(File p_raiz, DefaultMutableTreeNode nodo){  
    try{
        for(File temp:p_raiz.listFiles()){
            if( temp.isFile() ){                
                DefaultMutableTreeNode n=new DefaultMutableTreeNode(
                        temp.getName());
                nodo.add(n);      
            }else{
                DefaultMutableTreeNode n=new DefaultMutableTreeNode(
                        temp.getName());
                nodo.add(n);  
                listar_no_orden(temp,n);
            }
        } 
    }
    catch(Exception e){        
    }
}
    
    
    
    
    public void listar_todo(File p_raiz, DefaultMutableTreeNode nodo){  
    try{
        ArrayList<File> l1=new ArrayList();
        ArrayList<File> l2=new ArrayList();
        ArrayList<File> l3=new ArrayList();
        for (File f : p_raiz.listFiles()) {
            if (f.isDirectory()) {
                l1.add(f);
            }else{
                l2.add(f);
            }
        }
       l3.addAll(l1);
       l3.addAll(l2);
       
        for(File temp:l3){
            if( temp.isFile() ){                
                DefaultMutableTreeNode n=new DefaultMutableTreeNode(
                        temp.getName());
                nodo.add(n);      
            }else{
                DefaultMutableTreeNode n=new DefaultMutableTreeNode(
                        temp.getName());
                nodo.add(n);  
                listar_todo(temp,n);
            }
        } 
    }
    catch(Exception e){    
        e.printStackTrace();
    }
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_arbol;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextArea ta_1;
    // End of variables declaration//GEN-END:variables
    String path = "";
}
