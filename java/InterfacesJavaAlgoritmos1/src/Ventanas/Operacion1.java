/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author j2a0a
 */
public class Operacion1 extends javax.swing.JPanel {

    /**
     * Creates new form Operacion1
     */
    private JLabel[][] matriz;
    JTextPane[] diagonalPrincipal;
    JTextPane[] matrizCopia;

    public JTextPane[] getMatrizCopia() {
        return matrizCopia;
    }

    public void setMatrizCopia(JTextPane[] matrizCopia) {
        this.matrizCopia = matrizCopia;
    }

    public JTextPane[] getDiagonalPrincipal() {
        return diagonalPrincipal;
    }

    public void setDiagonalPrincipal(JTextPane[] diagonalPrincipal) {
        this.diagonalPrincipal = diagonalPrincipal;
    }
    
    public Operacion1() {
        initComponents();
        
        derechaBtn.setBounds(800, 10, 20, 40);
        this.add(derechaBtn);
        
    }
    public JLabel[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(JLabel[][] matriz) {
        this.matriz = matriz;
    }
    
    public void addTextPane(JTextPane coordenada, int j, String contenido, int posicionY){
        int labelSize = 35; // Tamaño deseado de JLabel
        int panelWidth = this.getWidth(); // Ancho del panel
        int spacingX = 5; // Espaciado horizontal
        int spacingY = 5; // Espaciado vertical
        int n = matriz.length; // Tamaño de la matriz
        
        // Calcular las coordenadas para centrar el JTextPane en el panel
        int x = (panelWidth - (n * labelSize + (n - 1) * spacingX)) / 2 + (j * (labelSize + spacingX));

        // Crear el JTextPane y configurar los límites
        coordenada = new JTextPane();
        coordenada.setBounds(x, posicionY, labelSize, labelSize);
        coordenada.setBorder(new LineBorder(Color.BLACK));

        coordenada.setBackground(new Color(0,0,0));

        coordenada.setText(contenido);
        
        coordenada.setEditable(false);

        this.add(coordenada); // Hacer el JTextPane no editable

        // Establecer el z-order para que esté en la parte superior
        this.setComponentZOrder(coordenada, 0);
    }
    
    public void diagonalPrincipal(JLabel[][] matriz) {
        int labelSize = 35; // Tamaño deseado de JLabel
        int panelWidth = this.getWidth(); // Ancho del panel
        int spacingX = 5; // Espaciado horizontal
        int spacingY = 5; // Espaciado vertical
        int n = matriz.length; // Tamaño de la matriz

        JTextPane[] matrizCopia = new JTextPane[n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    String textoMatriz = matriz[i][j].getText();
                    // Calcular las coordenadas para centrar el JTextPane en el panel
                    int x = (panelWidth - (n * labelSize + (n - 1) * spacingX)) / 2 + (j * (labelSize + spacingX));

                    // Crear el JTextPane y configurar los límites
                    matrizCopia[i] = new JTextPane();
                    matrizCopia[i].setBounds(x, 110, labelSize, labelSize);
                    matrizCopia[i].setBorder(new LineBorder(Color.BLACK));

                    matrizCopia[i].setBackground(new Color(0,0,0));

                    matrizCopia[i].setText(textoMatriz);

                    matrizCopia[i].setEditable(false);

                    this.add(matrizCopia[i]); // Hacer el JTextPane no editable

                    // Establecer el z-order para que esté en la parte superior
                    this.setComponentZOrder(matrizCopia[i], 0);
                }
            }
        }
        ordenarDiagonal(matrizCopia);
    }
    
    public void ordenarDiagonal(JTextPane[] matriz){
        int n = matriz.length; // Tamaño de la matriz
        
        JTextPane[] arregloOrdenado = new JTextPane[n];
        int[] numeros = new int [n];
        System.out.println(matriz[0].getText());
        for (int i = 0; i < matriz.length; i++) {
            try{
               numeros[i] = Integer.parseInt(matriz[i].getText()); 
            }catch(Exception e){
                System.out.println("ola");
                System.out.println("");
            }
        }
        
        Arrays.sort(numeros);
        for (int i = 0; i < matriz.length; i++) {
            addTextPane(arregloOrdenado[i], i, String.format("%3d", numeros[numeros.length - (i+1)]), 200);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        tituloLabel1 = new javax.swing.JLabel();
        tituloLabel2 = new javax.swing.JLabel();
        derechaBtn = new javax.swing.JButton();

        tituloLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel.setText("Diagonal Principal Ordenada:");

        tituloLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel1.setText("Operación 1: Ordenar la diagonal principal de mayor a menor");
        tituloLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel1MouseEntered(evt);
            }
        });

        tituloLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloLabel2.setText("Diagonal Principal:");

        derechaBtn.setText("Derecha");
        derechaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        derechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloLabel2)
                    .addComponent(tituloLabel))
                .addContainerGap(734, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(derechaBtn)
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(tituloLabel1)
                    .addGap(234, 234, 234)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(derechaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(tituloLabel2)
                .addGap(68, 68, 68)
                .addComponent(tituloLabel)
                .addGap(126, 126, 126))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(tituloLabel1)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void derechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaBtnActionPerformed
        Operacion2 panel2 = new Operacion2();
        showPanel(panel2);
        panel2.setMatriz(matriz);
        panel2.diagonalSecundaria(matriz);
    }//GEN-LAST:event_derechaBtnActionPerformed

    private void tituloLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel1MouseEntered
        
    }//GEN-LAST:event_tituloLabel1MouseEntered

    public void showPanel(JPanel panel){
        panel.setSize(1010,350);
        panel.setLocation(0,0);
        
        this.removeAll();
        this.add(panel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derechaBtn;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel tituloLabel1;
    private javax.swing.JLabel tituloLabel2;
    // End of variables declaration//GEN-END:variables

    void ordenarDiagonal(JLabel[][] matriz) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
