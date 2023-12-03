/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.*;
import javax.swing.border.*;


/**
 *
 * @author j2a0a
 */
public class Interfaz extends javax.swing.JFrame {
    

    Color colorFondo = new Color(255,255,240); //color del fondo 
    JLabel matriz[][]; // Matriz de jTextFields
    boolean consideracionAgregar = true;
    boolean firstTime = true;

    public Interfaz() {
        initComponents();
        setLayout(null);
        this.setLocationRelativeTo(null);
        errorIndicacion.setVisible(false);
    }
    
    //COEMNTARIO PARA JESUS
    //que es esto porque tienes la imagen de un perro aqui?
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/perroIcon.png"));
        return retValue;
    }
   
    //Matriz: genera y rellena
    public void llenadoMatriz(int n, JPanel panelMatrices) {
        StringBuilder superTexto = new StringBuilder();

        matriz = new JLabel[n][n]; // Cambiado de JTextField a JLabel
        int labelSize = 40; // Tamaño deseado de JLabel
        int panelWidth = panelMatrices.getWidth(); // Ancho del panel
        int marginBottom = 2; // Ajuste para evitar que los bordes se junten

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int numeroRandom = (int) (Math.random() * 1000 + 1);
                matriz[i][j] = new JLabel();
                matriz[i][j].setText(String.format("%-3d", numeroRandom)); //Formato de la matriz
                
                // Calcular las coordenadas para centrar el JLabel en el panel
                int x = (panelWidth - (n * labelSize)) / 2 + (j * labelSize);

                // Establecer los límites con ajuste en la parte inferior
                matriz[i][j].setBounds(x, 80 * i / 2, labelSize, labelSize - marginBottom);

                // Configurar el borde solo en la parte inferior para el JLabel
                matriz[i][j].setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK)); // 1 píxel en la parte inferior

                // Añadir el JLabel al panelMatrices
                panelMatrices.add(matriz[i][j]);
            }
        }

        // Asegurarse de que se repinte la interfaz después de hacer cambios
        panelMatrices.revalidate();
        panelMatrices.repaint();
    }
    
    public void borradoMatriz(JLabel[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                panelMatrices.remove(matriz[i][j]);
            }
        }
        panelMatrices.revalidate(); // Actualiza el diseño del panel
        panelMatrices.repaint();    // Repinta el panel para reflejar los cambios
    }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        operarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        barraValores = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        indicacionLabel2 = new javax.swing.JLabel();
        errorIndicacion = new javax.swing.JLabel();
        panelMatrices = new javax.swing.JPanel();
        salidaBtn = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        operarBtn.setBackground(new java.awt.Color(0, 102, 102));
        operarBtn.setForeground(new java.awt.Color(153, 255, 255));
        operarBtn.setText("Operar");
        operarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        operarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                operarBtnMousePressed(evt);
            }
        });
        operarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(operarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        limpiarBtn.setBackground(new java.awt.Color(0, 102, 102));
        limpiarBtn.setForeground(new java.awt.Color(153, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        barraValores.setMajorTickSpacing(1);
        barraValores.setMaximum(10);
        barraValores.setMinimum(3);
        barraValores.setPaintLabels(true);
        barraValores.setToolTipText("ola");
        barraValores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(barraValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indicacionLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        indicacionLabel2.setText("Tamaño de la matriz");
        jPanel1.add(indicacionLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 170, -1));

        errorIndicacion.setFont(new java.awt.Font("Gill Sans MT", 0, 10)); // NOI18N
        errorIndicacion.setForeground(new java.awt.Color(204, 0, 0));
        errorIndicacion.setText("Tienes que presionar el botón \"LIMPIAR\" para operar otra matriz.");
        jPanel1.add(errorIndicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        javax.swing.GroupLayout panelMatricesLayout = new javax.swing.GroupLayout(panelMatrices);
        panelMatrices.setLayout(panelMatricesLayout);
        panelMatricesLayout.setHorizontalGroup(
            panelMatricesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        panelMatricesLayout.setVerticalGroup(
            panelMatricesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(panelMatrices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1010, 650));

        salidaBtn.setBackground(new java.awt.Color(255, 255, 255));
        salidaBtn.setPreferredSize(new java.awt.Dimension(40, 30));
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

        xLabel.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout salidaBtnLayout = new javax.swing.GroupLayout(salidaBtn);
        salidaBtn.setLayout(salidaBtnLayout);
        salidaBtnLayout.setHorizontalGroup(
            salidaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(salidaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salidaBtnLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(xLabel)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        salidaBtnLayout.setVerticalGroup(
            salidaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(salidaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salidaBtnLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );

        jPanel1.add(salidaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        jLabelFondo.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backGroundSquare.jpg"))); // NOI18N
        jLabelFondo.setText("jLabelFondo");
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 820));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operarBtnActionPerformed
        //Recibe el valor de tamaño de la matiz
        int n = barraValores.getValue();
        //llenadoMatriz(n);
        if (consideracionAgregar){
            llenadoMatriz(n, panelMatrices);
            consideracionAgregar = false;
        }else{
            errorIndicacion.setVisible(true);
        }
        
    }//GEN-LAST:event_operarBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        
        if (firstTime){
            firstTime = false;
        }
        if (!consideracionAgregar){
            consideracionAgregar = true;
            errorIndicacion.setVisible(false);
            borradoMatriz(matriz);
        }else{
            
        }
    }//GEN-LAST:event_limpiarBtnActionPerformed

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

    private void operarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operarBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_operarBtnMousePressed

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
    private javax.swing.JLabel errorIndicacion;
    private javax.swing.JLabel indicacionLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JButton operarBtn;
    private javax.swing.JPanel panelMatrices;
    private javax.swing.JPanel salidaBtn;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables
}
