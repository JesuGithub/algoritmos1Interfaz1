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
import javax.swing.SwingConstants;
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
        JLabel [] diagonalSecundaria = new JLabel[n];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j == matriz.length-1){
                String textoVector = matriz[i][j].getText();
                // Calcular las coordenadas para centrar el JTextPane en el panel
                int x = (panelWidth - (n * labelSize + (n - 1) * spacingX)) / 2 + (j * (labelSize + spacingX));

                    // Crear el JTextPane y configurar los límites
                diagonalSecundaria[i] = new JLabel();
                diagonalSecundaria[i].setBounds(x, 72, labelSize, labelSize);
                diagonalSecundaria[i].setBorder(new LineBorder(new Color(0,102,102)));

                diagonalSecundaria[i].setBackground(new Color(255,255,255));

                diagonalSecundaria[i].setText(textoVector);
                    
                diagonalSecundaria[i].setHorizontalAlignment(SwingConstants.CENTER);
                diagonalSecundaria[i].setVerticalAlignment(SwingConstants.CENTER);

                    //matrizCopia[i].setEditable(false);

                this.add(diagonalSecundaria[i]); // 

                    // Establecer el z-order para que esté en la parte superior
                this.setComponentZOrder(diagonalSecundaria[i], 0);
                }
                
                if (i + j == n-1) {
                   arregloSecundario[i] = Integer.parseInt(matriz[i][j].getText());
                }
            }
        }
        //addTextPane(tituloLabel1, n, TOOL_TIP_TEXT_KEY, spacingY);
        suma(arregloSecundario);
    }
    /*
     public void addTextPane(JLabel coordenada, int j, String contenido, int posicionY){
        int labelSize = 35; // Tamaño deseado de JLabel
        int panelWidth = this.getWidth(); // Ancho del panel
        int spacingX = 5; // Espaciado horizontal
        int spacingY = 5; // Espaciado vertical
        int n = matriz.length; // Tamaño de la matriz
        
        // Calcular las coordenadas para centrar el JTextPane en el panel
        int x = (panelWidth - (n * labelSize + (n - 1) * spacingX)) / 2 + (j * (labelSize + spacingX));

        // Crear el JTextPane y configurar los límites
        coordenada = new JLabel();
        coordenada.setBounds(x, posicionY, labelSize, labelSize);
        coordenada.setBorder(new LineBorder(new Color(0,102,102)));

        coordenada.setBackground(new Color(255,255,255));
        
        coordenada.setHorizontalAlignment(SwingConstants.CENTER);
        coordenada.setVerticalAlignment(SwingConstants.CENTER);

        coordenada.setText(contenido);
        
        //coordenada.setEditable(false);

        this.add(coordenada); // Hacer el JTextPane no editable

        // Establecer el z-order para que esté en la parte superior
        this.setComponentZOrder(coordenada, 0);
    }
     */
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
        mostrarSuma.setBorder(new LineBorder(new Color(255,255,255)));

        mostrarSuma.setBackground(new Color(255,255,255));

        mostrarSuma.setText("Promedio: " + sumita + " / "+n + " = "+ String.format("%3.2f", ((double)(sumita))/ n ));

        
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
        derechaBtn = new javax.swing.JButton();
        mostrarSuma = new javax.swing.JTextPane();
        tituloLabel3 = new javax.swing.JLabel();
        izquierdaBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(988, 214));

        tituloLabel1.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        tituloLabel1.setText("2_Promedio de la suma de la diagonal principal");
        tituloLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloLabel1MouseEntered(evt);
            }
        });

        derechaBtn.setText("Siguiente");
        derechaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        derechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaBtnActionPerformed(evt);
            }
        });

        mostrarSuma.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N

        tituloLabel3.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        tituloLabel3.setText("Diagonal secundaria:");

        izquierdaBtn.setText("Anterior");
        izquierdaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierdaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(326, Short.MAX_VALUE)
                        .addComponent(tituloLabel1)
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(tituloLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(derechaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(izquierdaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mostrarSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel1)
                    .addComponent(derechaBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel3)
                    .addComponent(izquierdaBtn))
                .addGap(54, 54, 54)
                .addComponent(mostrarSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tituloLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabel1MouseEntered

    }//GEN-LAST:event_tituloLabel1MouseEntered

    private void derechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaBtnActionPerformed
        Operacion3 panel3 = new Operacion3();
        showPanel(panel3);
        panel3.setMatriz(matriz);
        panel3.llamador();
    }//GEN-LAST:event_derechaBtnActionPerformed

    private void izquierdaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaBtnActionPerformed
        Operacion1 panel1 = new Operacion1();
        showPanel(panel1);
        panel1.setMatriz(matriz);
        panel1.diagonalPrincipal(matriz);
    }//GEN-LAST:event_izquierdaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derechaBtn;
    private javax.swing.JButton izquierdaBtn;
    private javax.swing.JTextPane mostrarSuma;
    private javax.swing.JLabel tituloLabel1;
    private javax.swing.JLabel tituloLabel3;
    // End of variables declaration//GEN-END:variables
}
