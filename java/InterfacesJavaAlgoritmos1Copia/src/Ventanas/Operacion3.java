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
        expresion.setText(menor(matriz)+ " ^ "+ mayor(matriz));
        expresion.setEditable(false);
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
        textoPanel.setEditable(false);
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
        textMenor = new javax.swing.JTextPane();
        tituloLabel5 = new javax.swing.JLabel();
        textMayor = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        expresion = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        tituloLabel1.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        tituloLabel1.setText("3_Potencia del menor número de la primera columna elevado al mayor");
        tituloLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel1MouseEntered(evt);
            }
        });

        izquierdaBtn.setText("Anterior");
        izquierdaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        izquierdaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaBtnActionPerformed(evt);
            }
        });

        derechaBtn.setText("Siguiente");
        derechaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        derechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaBtnActionPerformed(evt);
            }
        });

        tituloLabel2.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        tituloLabel2.setText("al mayor número de la ultima columna");
        tituloLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel2MouseEntered(evt);
            }
        });

        tituloLabel3.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        tituloLabel3.setText("Resultado:");
        tituloLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel3MouseEntered(evt);
            }
        });

        tituloLabel4.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        tituloLabel4.setText("Base:");
        tituloLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel4MouseEntered(evt);
            }
        });

        mostrarSuma.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        mostrarSuma.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(mostrarSuma);

        textMenor.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N

        tituloLabel5.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        tituloLabel5.setText("Exponente:");
        tituloLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel5MouseEntered(evt);
            }
        });

        textMayor.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel1.setText("Expresión:");

        expresion.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tituloLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(tituloLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tituloLabel1)
                                    .addGap(97, 97, 97))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tituloLabel2)
                                    .addGap(202, 202, 202)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(derechaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(izquierdaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(104, 104, 104))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(132, 132, 132)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(derechaBtn)
                    .addComponent(tituloLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(izquierdaBtn)
                    .addComponent(tituloLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textMayor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textMenor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expresion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tituloLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void tituloLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel3MouseEntered

    private void tituloLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel4MouseEntered

    private void tituloLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel5MouseEntered

    private void tituloLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloLabel2MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derechaBtn;
    private javax.swing.JTextPane expresion;
    private javax.swing.JButton izquierdaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
