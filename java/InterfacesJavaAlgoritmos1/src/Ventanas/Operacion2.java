/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author j2a0a
 */
public class Operacion2 extends javax.swing.JPanel {
    private JLabel[][] matriz;

    public JLabel[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(JLabel[][] matriz) {
        this.matriz = matriz;
    }
    /**
     * Creates new form Operacion1
     */
    public Operacion2() {
        initComponents();
        
        derechaBtn.setBounds(800, 10, 20, 40);
        this.add(derechaBtn);
    }

    public void showPanel(JPanel panel){
        panel.setSize(1010,350);
        panel.setLocation(0,0);
        
        this.removeAll();
        this.add(panel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    public void diagonalSecundaria(JLabel[][] matriz){
        int labelSize = 35; // Tamaño deseado de JLabel
        int panelWidth = this.getWidth(); // Ancho del panel
        int spacingX = 5; // Espaciado horizontal
        int spacingY = 5; // Espaciado vertical
        int n = matriz.length; // Tamaño de la matriz

        int[] arregloSecundario = new int[n];

        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j == n-1) {
                   System.out.print("ola");
                   arregloSecundario[i] = Integer.parseInt(matriz[i][j].getText());
                }
            }
        }
        suma(arregloSecundario);
    }
    
    public void suma(int[] diagonalSegundaria){
        int labelSize = 35; // Tamaño deseado de JLabel
        int panelWidth = this.getWidth(); // Ancho del panel
        int spacingX = 5; // Espaciado horizontal
        int spacingY = 5; // Espaciado vertical
        int n = matriz.length; // Tamaño de la matriz
        String texto = "";
        int sumita = 0;
        
        for (int i = 0; i < diagonalSegundaria.length; i++) {
            texto += String.valueOf(diagonalSegundaria[i]) + " + ";
        }
        for (int i = 0; i < diagonalSegundaria.length; i++) {
            sumita += diagonalSegundaria[i]; 
            
        }
        mostrarSuma.setBorder(new LineBorder(Color.BLACK));

        mostrarSuma.setBackground(new Color(0,0,0));

        mostrarSuma.setText("La suma de " + texto + " es = " + sumita + ", y el promedio es: " + String.format("%3.2f", ((double)(sumita))/ n ));

        mostrarSuma.setEditable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel1 = new javax.swing.JLabel();
        izquierdaBtn = new javax.swing.JButton();
        derechaBtn = new javax.swing.JButton();
        tituloLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarSuma = new javax.swing.JTextPane();

        tituloLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel1.setText("Operación 2: Promedio de la suma de la diagonal principal");
        tituloLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel1MouseEntered(evt);
            }
        });

        izquierdaBtn.setText("Izquierda");
        izquierdaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierdaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaBtnActionPerformed(evt);
            }
        });

        derechaBtn.setText("Derecha");
        derechaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        derechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaBtnActionPerformed(evt);
            }
        });

        tituloLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel2.setText("Promedio:");

        mostrarSuma.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(mostrarSuma);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(tituloLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(izquierdaBtn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(tituloLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(derechaBtn)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel1)
                    .addComponent(izquierdaBtn)
                    .addComponent(derechaBtn))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tituloLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel1MouseEntered

    }//GEN-LAST:event_tituloLabel1MouseEntered

    private void izquierdaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaBtnActionPerformed
        Operacion1 panel1 = new Operacion1();
        showPanel(panel1);
        panel1.setMatriz(matriz);
        panel1.diagonalPrincipal(matriz);
    }//GEN-LAST:event_izquierdaBtnActionPerformed

    private void derechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaBtnActionPerformed
        Operacion3 panel3 = new Operacion3();
        showPanel(panel3);
        panel3.setMatriz(matriz);
        panel3.llamador();
    }//GEN-LAST:event_derechaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derechaBtn;
    private javax.swing.JButton izquierdaBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane mostrarSuma;
    private javax.swing.JLabel tituloLabel1;
    private javax.swing.JLabel tituloLabel2;
    // End of variables declaration//GEN-END:variables
}
