/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_diegocasco_juanmendez;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }
Random r = new Random();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        crear_archivos = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_extension = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        sp_tam = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        crear_carpeta = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Jt_nombrecarp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        popupMenu2 = new java.awt.PopupMenu();
        PopMenu_Folders = new javax.swing.JPopupMenu();
        Ag_papelera = new javax.swing.JMenuItem();
        Ag_destacados = new javax.swing.JMenuItem();
        Ag_miusuario = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        crear_archivos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear Archivos ");
        crear_archivos.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        crear_archivos.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        crear_archivos.getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 310, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Extension");
        crear_archivos.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        cb_extension.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        cb_extension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF", "txt", "docx", "jpg", "mp4" }));
        crear_archivos.getContentPane().add(cb_extension, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tamaño: ");
        crear_archivos.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        sp_tam.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        crear_archivos.getContentPane().add(sp_tam, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, -1));

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        crear_archivos.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-vortex-3d_1920x1080_xtrafondos.com.jpg"))); // NOI18N
        crear_archivos.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        crear_carpeta.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Crear carpeta");
        crear_carpeta.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre de la carpeta: ");
        crear_carpeta.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));
        crear_carpeta.getContentPane().add(Jt_nombrecarp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 290, 30));

        jButton2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        crear_carpeta.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 150, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1366_2000.png"))); // NOI18N
        crear_carpeta.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 370));

        popupMenu2.setLabel("popupMenu2");

        Ag_papelera.setText("Eliminar");
        PopMenu_Folders.add(Ag_papelera);

        Ag_destacados.setText("Agregar a Destacados\n");
        PopMenu_Folders.add(Ag_destacados);

        Ag_miusuario.setText("Agregar a Mi Usuario");
        PopMenu_Folders.add(Ag_miusuario);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 670, 320));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 620, 40));
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 740, 40));
        getContentPane().add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 740, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9988.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        jMenu1.setText("Archivos");

        jMenuItem1.setText("Papelera");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Destacados");
        jMenu1.add(jMenuItem2);

        jMenu3.setText("Crear");

        jMenuItem3.setText("Crear archivo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Crear carpeta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        crear_archivos.setModal(true); // bloquear
        crear_archivos.pack();
        crear_archivos.setLocationRelativeTo(this);
        crear_archivos.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        crear_carpeta.setModal(true); // bloquear
        crear_carpeta.pack();
        crear_carpeta.setLocationRelativeTo(this);
        crear_carpeta.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String nombre, extension, link;
        int tamaño;
        link = "https://help.dropbox.com/es-la/files-folders/share/view-only";
        nombre = txt_nombre.getText();
        extension = cb_extension.getSelectedItem().toString();
        tamaño = (Integer) sp_tam.getValue();
        archivos.add(new Archivos(nombre,link,extension,tamaño));
        JOptionPane.showConfirmDialog(this, "Archivo Agregado exitosamente");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        // TODO add your handling code here:
        if(evt.isMetaDown()){
            PopMenu_Folders.show(evt.getComponent(),evt.getX() ,evt.getY());
        }
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String linak;
        AdminCarpetas ac = new AdminCarpetas("./Carpets.nuils");
        int z=65+r.nextInt(90);
        int x=97+r.nextInt(122); 
        int q =65+r.nextInt(90);
        int h =97+r.nextInt(122);
        int p=97+r.nextInt(122); 
        char a = (char)z;
        char b = (char)x;
        char c = (char)q;
        char d = (char)h;
        char e = (char)p;
        linak = "dive.google.com/misuario/"+a+b+c+d+e;
        System.out.println(linak);
        miusuario.add(new Carpeta(Jt_nombrecarp.getText(), linak));
        ac.escribirArchivo();
        
        Dba db = new Dba("./lab9p2.accdb");
        db.conectar();
        try { 
            Date hoy;
            hoy = new Date();
            String n;
            int jj;
            jj=1;
            n=Jt_nombrecarp.getText();
            db.query.execute("INSERT INTO Carpetas"
                    + " (Nombre_Carpeta, Cantidad_Dentro ,Fecha_Creacion)"
                    + " VALUES ('" + n + "', '" + jj + "','" + hoy + "' )");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ag_destacados;
    private javax.swing.JMenuItem Ag_miusuario;
    private javax.swing.JMenuItem Ag_papelera;
    private javax.swing.JTextField Jt_nombrecarp;
    private javax.swing.JPopupMenu PopMenu_Folders;
    private javax.swing.JComboBox<String> cb_extension;
    private javax.swing.JDialog crear_archivos;
    private javax.swing.JDialog crear_carpeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JSpinner sp_tam;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
    ArrayList<Carpeta> miusuario = new ArrayList();
    ArrayList<Carpeta> destacado = new ArrayList();
    ArrayList<Carpeta> papelera = new ArrayList();
    ArrayList<Archivos> archivos = new ArrayList();
}
