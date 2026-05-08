import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EstudianteFormulario {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lista de estudiantes");
        JPanel panel = new JPanel();

        JTextField nombreField = new JTextField(10);
        JTextField edadField = new JTextField(5);
        JTextField cursoField = new JTextField(10);

        JButton boton = new JButton("Agregar");

        panel.add(new JLabel("Nombre"));
        panel.add(nombreField);

        panel.add(new JLabel("Edad"));
        panel.add(edadField);

        panel.add(new JLabel("Curso"));
        panel.add(cursoField);

        panel.add(boton);

        // Columnas de la tabla
        String[] columnas = {
                "Nombre",
                "Edad",
                "Curso"
        };

        // Modelo de tabla
        DefaultTableModel modelo =
                new DefaultTableModel(columnas, 0);

        JTable tabla = new JTable(modelo);

        JScrollPane scrollPane =
                new JScrollPane(tabla);

        boton.addActionListener(e -> {

            String nombre =
                    nombreField.getText();

            String edad =
                    edadField.getText();

            String curso =
                    cursoField.getText();

            if(nombre.isEmpty() ||
                    edad.isEmpty() ||
                    curso.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Completa todos los campos"
                );

            } else {

                modelo.addRow(new Object[] {
                        nombre,
                        edad,
                        curso
                });

                nombreField.setText("");

                edadField.setText("");

                cursoField.setText("");
            }
        });

        frame.add(panel, "North");
        frame.add(scrollPane, "Center");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setVisible(true);
    }
}