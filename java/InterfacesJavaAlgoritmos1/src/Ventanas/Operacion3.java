/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author j2a0a
 */
public class Operacion3 extends javax.swing.JPanel {
    BigInteger numeroAElevar;
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
    public Operacion3() {
        initComponents();
    }
    
    public void llamador(){
        mostrar(textMenor, menor(matriz));
        mostrar(textMayor, mayor(matriz));
        numeroAElevar = BigInteger.valueOf(menor(matriz)).pow(mayor(matriz));
        
        mostrarSuma.setText(String.valueOf(numeroAElevar));
    }
    
    public void showPanel(JPanel panel){
        panel.setSize(1010,350);
        panel.setLocation(0,0);
        
        this.removeAll();
        this.add(panel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    public int menor(JLabel[][] matriz){
        int menor = Integer.parseInt(matriz[0][0].getText());
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0){
                    if (menor > Integer.parseInt(matriz[i][j].getText())){
                        menor = Integer.parseInt(matriz[i][j].getText());
                    }
                }
            }  
        }
        return menor;
    }
    
    public int mayor(JLabel[][] matriz){
        int mayor = Integer.parseInt(matriz[0][0].getText());
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == matriz[0].length - 1){
                    if (mayor < Integer.parseInt(matriz[i][j].getText())){
                        mayor = Integer.parseInt(matriz[i][j].getText());
                    }
                }
            }  
        }
        return mayor;
    }
    
    public void mostrar(JTextPane textoPanel, int numero){
        textoPanel.setText(String.valueOf(numero));
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
        tituloLabel3 = new javax.swing.JLabel();
        tituloLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarSuma = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textMenor = new javax.swing.JTextPane();
        tituloLabel5 = new javax.swing.JLabel();
        mayorPane = new javax.swing.JScrollPane();
        textMayor = new javax.swing.JTextPane();

        tituloLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel1.setText("Operación 2: Potencia del menor número de la primera columna elevado  ");
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
        tituloLabel2.setText("al mayor número de la ultima columna");
        tituloLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel2MouseEntered(evt);
            }
        });

        tituloLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel3.setText("Mayor número de la última columna:");
        tituloLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel3MouseEntered(evt);
            }
        });

        tituloLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel4.setText("Menor número de la primera columna:");
        tituloLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel4MouseEntered(evt);
            }
        });

        mostrarSuma.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(mostrarSuma);

        textMenor.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(textMenor);

        tituloLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel5.setText("Numero elevado:");
        tituloLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel5MouseEntered(evt);
            }
        });

        textMayor.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        mayorPane.setViewportView(textMayor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(izquierdaBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(tituloLabel1)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(tituloLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(derechaBtn)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloLabel5)
                    .addComponent(tituloLabel3)
                    .addComponent(tituloLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mayorPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(derechaBtn)
                            .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tituloLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tituloLabel2)
                            .addGap(26, 26, 26)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(izquierdaBtn)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tituloLabel4)
                        .addGap(59, 59, 59)
                        .addComponent(tituloLabel3)
                        .addGap(51, 51, 51)
                        .addComponent(tituloLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(mayorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tituloLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel1MouseEntered

    }//GEN-LAST:event_tituloLabel1MouseEntered

    private void izquierdaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaBtnActionPerformed
        Operacion2 panel2 = new Operacion2();
        showPanel(panel2);
        panel2.setMatriz(matriz);
        panel2.diagonalSecundaria(matriz);
    }//GEN-LAST:event_izquierdaBtnActionPerformed

    private void derechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaBtnActionPerformed
        Operacion4 panel4 = new Operacion4();
        showPanel(panel4);
        panel4.setMatriz(matriz);
        panel4.llamador();
    }//GEN-LAST:event_derechaBtnActionPerformed

    private void tituloLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel2MouseEntered

    private void tituloLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel3MouseEntered

    private void tituloLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel4MouseEntered

    private void tituloLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel5MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derechaBtn;
    private javax.swing.JButton izquierdaBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane mayorPane;
    private javax.swing.JTextPane mostrarSuma;
    private javax.swing.JTextPane textMayor;
    private javax.swing.JTextPane textMenor;
    private javax.swing.JLabel tituloLabel1;
    private javax.swing.JLabel tituloLabel2;
    private javax.swing.JLabel tituloLabel3;
    private javax.swing.JLabel tituloLabel4;
    private javax.swing.JLabel tituloLabel5;
    // End of variables declaration//GEN-END:variables
}