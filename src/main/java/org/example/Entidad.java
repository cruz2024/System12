package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Entidad extends JPanel {

    private VentanaPrincipal ventanaPrincipal;

    public Entidad(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        crearEntidades();
    }

    private void crearEntidades() {
        // Crear botones para cada entidad
        JButton clienteButton = new JButton("Cliente");
        JButton productoButton = new JButton("Producto");
        JButton empleadoButton = new JButton("Empleado");
        JButton proveedorButton = new JButton("Proveedor");

        // Agregar ActionListener a cada botón
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.abrirCliente();
            }
        });

        productoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.mostrarProducto();
            }
        });

        empleadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.correrEmpleado();
            }
        });

        proveedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.guardarProveedor();
            }
        });

        // Agregar botones a la barra de entidades
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clienteButton);
        add(productoButton);
        add(empleadoButton);
        add(proveedorButton);
    }
}

