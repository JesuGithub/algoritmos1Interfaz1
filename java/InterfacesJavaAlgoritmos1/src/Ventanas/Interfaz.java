/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTextField;


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
    //marriz
    JTextField matriz[][];

    //Matriz: genera y rellena
    public void llenadoMatriz(int n){
        
        //matriz tamano
        
        
        //String superTexto = "";
        matriz = new JTextField[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //Rellena matriz con numeros aleatorios del 0 al 999
                    matriz[i][j].setText(Integer.toString((int) (Math.random()*999)));
                    matriz[i][j].setBounds(70*j +40,70*i+40,35,25); //x,y,ancho, alto
                    this.add(matriz[i][j]);
                    this.repaint();
                /*matriz[i][j] = (int) (Math.random()*999 + 1); 
                //Imprime la columna de la fila de la matriz
                superTexto += Integer.toString(matriz[i][j]) + "           ";
            }
            superTexto += "\n"; // genera espacio entre filas*/
        }
        //mostrarValores.setText(superTexto);
    }
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
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salidaBtn = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        barraValores = new javax.swing.JSlider();
        mostrarValor = new javax.swing.JTextField();
        jTextFieldMatrizEnter = new javax.swing.JTextField();
        jButtonSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarValores = new javax.swing.JTextPane();
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

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel5.setText("1-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel8.setText("Tamaño de la matriz");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 180, -1));

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

        mostrarValor.setBackground(new java.awt.Color(0, 51, 51));
        mostrarValor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        mostrarValor.setForeground(new java.awt.Color(255, 255, 255));
        mostrarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarValorActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 60, 60));

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
        getContentPane().add(jTextFieldMatrizEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, -1, -1));

        jButtonSesion.setBackground(new java.awt.Color(0, 102, 102));
        jButtonSesion.setForeground(new java.awt.Color(153, 255, 255));
        jButtonSesion.setText("Iniciar Sesión");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, -1, -1));

        mostrarValores.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(mostrarValores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, 170));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        jLabelFondo.setText("jLabelFondo");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarValor.setText(Integer.toString(barraValores.getValue()));
        //Recibe el valor de tamaño de la matiz
        
        //int n = Integer.parseInt();
        int n = barraValores.getValue();// esto se va cuando funcione
        llenadoMatriz(n);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        int numero, numero2;
        String nombre = mostrarValor.getText();
        numero = Integer.parseInt(nombre);
        //String nombre2 = valorMatrizTxt.getText();
        //numero2 = Integer.parseInt(nombre2);
        //char[] passwordCharArray = jPassword.getPassword();
        //String password = new String(passwordCharArray);

        //String mensaje = "Numero 1: " + numero + "\nContraseña: " + numero2 + "\nSuma: " + (numero + numero2);

        // Mostrar un JOptionPane con la información ingresada
        //javax.swing.JOptionPane.showMessageDialog(this, mensaje, "Información de Sesión", javax.swing.JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldMatrizEnter;
    private javax.swing.JTextField mostrarValor;
    private javax.swing.JTextPane mostrarValores;
    private javax.swing.JPanel salidaBtn;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables
}
