package org.example;

import org.example.casesdatos.ClienteData;
import org.example.casesdatos.EmpleadoData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Empleado extends JInternalFrame {

    private static List<EmpleadoData> empleadosData = new ArrayList<>();

    private  JTextField nombreField;
    private  JTextField direcionField;
    private JTextField ubicacionField;
    private JTextField telefonoField;
    private JButton correrJButton;
    private JButton cancelarJButton;


    public Empleado(){

        setTitle("Empleado");
        setSize(400,400);
        setBackground(Color.ORANGE);
        setClosable(true); // Permite cerrar el formulario interno
        setResizable(true); // Permite redimensionar el formulario interno
        setMaximizable(true); // Permite maximizar el formulario interno
        setIconifiable(true); // Permite iconificar el formulario interno
        setLayout(new BorderLayout());
        setVisible(true);

        nombreField = new JTextField(25);
        direcionField = new JTextField(25);
        ubicacionField = new JTextField(25);
        telefonoField = new JTextField(25);
        correrJButton = new JButton("Guardar");
        cancelarJButton = new JButton("cancelar");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(15,10));
        panel.add(new JLabel("Nombre"));
        panel.add(nombreField);
        panel.add(new JLabel("Direcion"));
        panel.add(direcionField);
        panel.add(new JLabel("Ubicacion"));
        panel.add(ubicacionField);
        panel.add(new JLabel("Telefono"));
        panel.add(telefonoField);
        panel.add(correrJButton);
        panel.add(cancelarJButton);

        add(panel, BorderLayout.CENTER);


        correrJButton.addActionListener(e -> correrEmpleado());
        cancelarJButton.addActionListener(e -> cancelarFormulario());

    }

    private void correrEmpleado() {
        EmpleadoData data = new EmpleadoData(
                nombreField.getText(),
                direcionField.getText(),
                ubicacionField.getText(),
                telefonoField.getText()
        );
        empleadosData.add(data);
        JOptionPane.showMessageDialog(this, "Cliente guardado exitosamente");

    }


    private void cancelarFormulario() {

        // Cierra el formulario
        dispose();
    }
    public static List<EmpleadoData> getEmpleadosData(){
        return empleadosData;
    }
}

