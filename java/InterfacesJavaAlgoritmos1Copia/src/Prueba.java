import javax.swing.*;
import java.awt.*;

public class Prueba extends JFrame {
    private JTextField[][] matrizTextFields;

    public Prueba(int filas, int columnas) {
        matrizTextFields = new JTextField[filas][columnas];

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        // Configurar el diseño de la matriz en un GridLayout
        setLayout(new BorderLayout(filas, columnas));

        // Inicializar y agregar los JTextField a la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTextFields[i][j] = new JTextField(5); // 5 es el ancho del JTextField
                add(matrizTextFields[i][j]);
            }
        }

        // Configurar el segundo JPanel para el botón
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton mostrarMatrizButton = new JButton("Mostrar Matriz");
        mostrarMatrizButton.addActionListener(e -> mostrarMatriz());
        buttonPanel.add(mostrarMatrizButton);

        // Agregar la matriz y el botón al contenido principal
        add(buttonPanel);

        setVisible(true);
    }

    private void mostrarMatriz() {
        // Obtener y mostrar los valores de la matriz
        for (int i = 0; i < matrizTextFields.length; i++) {
            for (int j = 0; j < matrizTextFields[i].length; j++) {
                System.out.print(matrizTextFields[i][j].getText() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Prueba(3, 3);
        });
    }
}
