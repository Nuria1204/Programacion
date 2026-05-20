import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {

    private ArrayList<Coche> listaCoches;

    private DefaultTableModel modeloTabla;

    public VentanaPrincipal() {

        setTitle("Gestión de Coches");

        setSize(600,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        listaCoches = new ArrayList<>();

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Opciones");

        JMenuItem agregarItem =
                new JMenuItem("Añadir Coche");

        JMenuItem mostrarItem =
                new JMenuItem("Mostrar Coches");

        menu.add(agregarItem);

        menu.add(mostrarItem);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        agregarItem.addActionListener(e -> {

            agregarCoche();
        });

        mostrarItem.addActionListener(e -> {

            mostrarTabla();
        });

        setVisible(true);
    }

    private void agregarCoche() {

        String marca = JOptionPane.showInputDialog(
                this,
                "Introduce la marca"
        );

        String anioTexto =
                JOptionPane.showInputDialog(
                        this,
                        "Introduce el año"
                );

        String color = JOptionPane.showInputDialog(
                this,
                "Introduce el color"
        );

        if(marca.isEmpty() ||
                anioTexto.isEmpty() ||
                color.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "No dejes campos vacíos"
            );

            return;
        }

        int anio = Integer.parseInt(anioTexto);

        Coche coche = new Coche(
                marca,
                anio,
                color
        );

        listaCoches.add(coche);

        JOptionPane.showMessageDialog(
                this,
                "Coche agregado correctamente"
        );
    }

    private void mostrarTabla() {

        JFrame ventanaTabla =
                new JFrame("Lista de coches");

        String[] columnas = {
                "Marca",
                "Año",
                "Color"
        };

        modeloTabla =
                new DefaultTableModel(columnas,0);

        for(Coche coche : listaCoches) {

            modeloTabla.addRow(new Object[] {

                    coche.getMarca(),
                    coche.getAnio(),
                    coche.getColor()
            });
        }

        JTable tabla = new JTable(modeloTabla);

        JScrollPane scroll =
                new JScrollPane(tabla);

        ventanaTabla.add(scroll);

        ventanaTabla.setSize(500,300);

        ventanaTabla.setLocationRelativeTo(null);

        ventanaTabla.setVisible(true);
    }
}