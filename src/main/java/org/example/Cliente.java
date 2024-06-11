package org.example;

import org.example.casesdatos.ClienteData;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends JInternalFrame {
    

    private JTextField nombreField;
    private JTextArea detalleField;

    public Cliente() {
        setTitle("Cliente");
        setSize(300, 100);
        setLayout(new BorderLayout());
        setClosable(true);
        setResizable(true);

        nombreField = new JTextField();
        detalleField = new JTextArea();

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Detalle:"));
        panel.add(new JScrollPane(detalleField));

        add(panel, BorderLayout.CENTER);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(e -> dispose());
        add(guardarButton, BorderLayout.SOUTH);
    }

    public String getNombre() {
        return nombreField.getText();
    }

    public String getDetalle() {
        return detalleField.getText();
    }
}
