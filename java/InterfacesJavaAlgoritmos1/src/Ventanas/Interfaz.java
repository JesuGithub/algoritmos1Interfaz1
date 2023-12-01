/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;


/**
 *
 * @author j2a0a
 */
public class Interfaz extends javax.swing.JFrame {
    

    Color colorFondo = new Color(200,230,144); //color del fondo 

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/perroIcon.png"));
        return retValue;
    }
    
    
    //llenado de matriz 
    public void llenadoMatriz(int matriz[][],int n){
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random()*999);
            }
            tMatriz.setText(Arrays.toString(matriz));
        }
        tMatriz.setText("\n");
    }
    //generar matriz
    public int[][] generarMatriz(int n){
        int m[][] = new int[n][n];
        return m;
    }
   
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salidaBtn = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        barraValores = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        valorMatrizTxt = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        mostrarValor = new javax.swing.JTextField();
        jTextFieldMatrizEnter = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabelIcon = new javax.swing.JLabel();
        jButtonSesion = new javax.swing.JButton();
        tMatriz = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(153, 255, 255));
        jButton1.setText("Operar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(153, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setText("3-");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel2.setText("2-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, 30));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel3.setText("4-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel4.setText("Diagonal Principal mayor a menor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel5.setText("1-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel6.setText("Diagonal Principal mayor a menor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel7.setText("Diagonal Principal mayor a menor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel8.setText("Tamaño de la matriz");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 180, -1));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel9.setText("Diagonal Principal mayor a menor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        salidaBtn.setBackground(new java.awt.Color(200, 230, 144));
        salidaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salidaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salidaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salidaBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salidaBtnMousePressed(evt);
            }
        });

        xLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        xLabel.setText("X");
        xLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xLabelMousePressed(evt);
            }
        });
        salidaBtn.add(xLabel);

        getContentPane().add(salidaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 40));

        barraValores.setMajorTickSpacing(1);
        barraValores.setMaximum(10);
        barraValores.setMinimum(3);
        barraValores.setPaintLabels(true);
        barraValores.setToolTipText("ola");
        getContentPane().add(barraValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jScrollPane2.setViewportView(valorMatrizTxt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 70, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("ola\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        mostrarValor.setBackground(new java.awt.Color(0, 51, 51));
        mostrarValor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        mostrarValor.setForeground(new java.awt.Color(255, 255, 255));
        mostrarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarValorActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 50, 30));

        jTextFieldMatrizEnter.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldMatrizEnter.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTextFieldMatrizEnter.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldMatrizEnter.setText("Ingrese de que tamaño será su matriz");
        jTextFieldMatrizEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldMatrizEnterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldMatrizEnterMousePressed(evt);
            }
        });
        jTextFieldMatrizEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatrizEnterActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMatrizEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        jPassword.setBackground(new java.awt.Color(0, 51, 51));
        jPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 200, 30));

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mugiwara-logo-303FD55C54-seeklogo.com.png"))); // NOI18N
        getContentPane().add(jLabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 320, 280));

        jButtonSesion.setBackground(new java.awt.Color(0, 102, 102));
        jButtonSesion.setForeground(new java.awt.Color(153, 255, 255));
        jButtonSesion.setText("Iniciar Sesión");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, -1, -1));

        tMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(tMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 370, 230));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        jLabelFondo.setText("jLabelFondo");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarValor.setText(Integer.toString(barraValores.getValue()));
        // recibe el valor de tamaño 
        //recuerda modificar aqui para usar el scrollbar
        //int n = Integer.parseInt();
        int [][] matriz;
        int n = 3;// esto se va cuando funcione
        matriz = this.generarMatriz(n);
        this.llenadoMatriz(matriz, n);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        int numero, numero2;
        String nombre = mostrarValor.getText();
        numero = Integer.parseInt(nombre);
        String nombre2 = valorMatrizTxt.getText();
        numero2 = Integer.parseInt(nombre2);
        char[] passwordCharArray = jPassword.getPassword();
        String password = new String(passwordCharArray);

        String mensaje = "Numero 1: " + numero + "\nContraseña: " + numero2 + "\nSuma: " + (numero + numero2);

        // Mostrar un JOptionPane con la información ingresada
        javax.swing.JOptionPane.showMessageDialog(this, mensaje, "Información de Sesión", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code herea:
    }//GEN-LAST:event_jButtonSesionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldMatrizEnterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMatrizEnterMousePressed
        if (jTextFieldMatrizEnter.getText().equals("Ingrese de que tamaño será su matriz")){
            jTextFieldMatrizEnter.setText("");
            jTextFieldMatrizEnter.setForeground(Color.white);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatrizEnterMousePressed

    private void jTextFieldMatrizEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatrizEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatrizEnterActionPerformed

    private void jTextFieldMatrizEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMatrizEnterMouseExited
        if (jTextFieldMatrizEnter.getText().isEmpty()){
            jTextFieldMatrizEnter.setText("Ingrese de que tamaño será su matriz");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatrizEnterMouseExited

    private void xLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLabelMouseEntered
        
        // TODO add your handling code here:
    }//GEN-LAST:event_xLabelMouseEntered

    private void salidaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaBtnMouseEntered
        salidaBtn.setBackground(Color.red);
        xLabel.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaBtnMouseEntered

    private void xLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLabelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_xLabelMousePressed

    private void salidaBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaBtnMousePressed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaBtnMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void xLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLabelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_xLabelMouseExited

    private void salidaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaBtnMouseExited
        salidaBtn.setBackground(colorFondo);
        xLabel.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaBtnMouseExited

    private void xLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLabelMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_xLabelMouseClicked

    private void salidaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaBtnMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaBtnMouseClicked

    private void mostrarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarValorActionPerformed

    private void tMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMatrizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMatrizActionPerformed

    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider barraValores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldMatrizEnter;
    private javax.swing.JTextField mostrarValor;
    private javax.swing.JPanel salidaBtn;
    private javax.swing.JTextField tMatriz;
    private javax.swing.JTextPane valorMatrizTxt;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables
}
