package org.example;

import org.example.casesdatos.ProveedorData;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Proveedor extends JInternalFrame {

    private static List<ProveedorData> proveedorData = new ArrayList<>();

    private JTextField nombreField;
    private JTextField direccionField;
    private JTextField telefonoField;
    private JTextArea notasArea;
    private JButton guardarButton;
    private JButton cancelarButton;

    public Proveedor() {
        setTitle("Proveedor");
        setSize(400, 400);
        setBackground(Color.MAGENTA);
        setClosable(true); // Permite cerrar el formulario interno
        setResizable(true); // Permite redimensionar el formulario interno
        setMaximizable(true); // Permite maximizar el formulario interno
        setIconifiable(true); // Permite iconificar el formulario interno
        setLayout(new BorderLayout());
        setVisible(true);

        // Inicializar componentes
        nombreField = new JTextField(25);
        direccionField = new JTextField(25);
        telefonoField = new JTextField(25);
        notasArea = new JTextArea(5, 25);
        guardarButton = new JButton("Guardar");
        cancelarButton = new JButton("Cancelar");

        // Agregar componentes al panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(15, 10));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Dirección:"));
        panel.add(direccionField);
        panel.add(new JLabel("Teléfono:"));
        panel.add(telefonoField);
        panel.add(new JLabel("Notas:"));
        panel.add(new JScrollPane(notasArea));
        panel.add(guardarButton);
        panel.add(cancelarButton);

        add(panel, BorderLayout.CENTER);

        // Agregar ActionListener para los botones
        guardarButton.addActionListener(e -> guardarProveedor());
        cancelarButton.addActionListener(e -> cerrarFormulario());
    }

    private void guardarProveedor() {
        ProveedorData data = new ProveedorData(
                nombreField.getText(),
                direccionField.getText(),
                direccionField.getText(),
                telefonoField.getText()
        );
        proveedorData.add(data);
        JOptionPane.showMessageDialog(this, "Proveedor guardado exitosamente");

    }

    private void cerrarFormulario() {
        // Cierra el formulario
        dispose();
    }

    public static List<ProveedorData> getproveedorData(){
        return proveedorData;
    }

}
