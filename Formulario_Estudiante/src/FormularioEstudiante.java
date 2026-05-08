import javax.swing.*;
import javax.swing.*;
public class FormularioEstudiante {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Formulario");

        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField(15);

        JLabel ageLabel = new JLabel("Edad:");
        JTextField ageField = new JTextField(15);

        JLabel courseLabel = new JLabel("Curso:");
        JTextField courseField = new JTextField(15);

        JButton button = new JButton("Guardar");

        button.addActionListener(e -> {

            String name = nameField.getText();
            String age = ageField.getText();
            String course = courseField.getText();

            JOptionPane.showMessageDialog(
                    null,
                    "Nombre: " + name +
                            "\nEdad: " + age +
                            "\nCurso: " + course
                );
            });

            panel.add(nameLabel);
            panel.add(nameField);

            panel.add(ageLabel);
            panel.add(ageField);

            panel.add(courseLabel);
            panel.add(courseField);

            panel.add(button);

            frame.add(panel);

            frame.setSize(300,200);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);
        }
    }

