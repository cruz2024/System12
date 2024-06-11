package org.example;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JDesktopPane desktopPane;
    private Cliente cliente;
    private Producto producto;
    private Empleado empleado;
    private Proveedor proveedor;
    private EntidadTableModel entidadTableModel;
    private JTable entidadTable;

    public VentanaPrincipal() {
        setTitle("Mi sistema");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        //crea la barra de menu
        JMenuBar menuBar = new JMenuBar();

        //Creo el archivo
        JMenu archivoMenu = new JMenu("Archivo");
        JMenu guardarMenuItem = new JMenu("Guardar");
        JMenuItem salirMenuItem = new JMenuItem("Salir");
        guardarMenuItem.addActionListener(e -> System.exit(1));
        salirMenuItem.addActionListener(e -> System.exit(0));
        archivoMenu.add(guardarMenuItem);
        archivoMenu.add(salirMenuItem);

        //Se crea una ayuda
        JMenu ayudaMenu = new JMenu("Ayuda");
        JMenuItem acercaDeMenuItem = new JMenuItem("Acerca de");
        ayudaMenu.add(acercaDeMenuItem);

        //Se agrega menu ala barra de menu
        menuBar.add(archivoMenu);
        menuBar.add(ayudaMenu);

        //Configuramo la barra de menu
        setJMenuBar(menuBar);

        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.LIGHT_GRAY);
        add(desktopPane, BorderLayout.CENTER);

        /** Se crea la barra de entidad */
        JPanel entidadBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton entidadButton = new JButton("Entidad");
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem clienteMenuItem = new JMenuItem("Cliente");
        clienteMenuItem.addActionListener(e -> abrirCliente());

        JMenuItem productoMenuItem = new JMenuItem("Producto");
        productoMenuItem.addActionListener(e -> mostrarProducto());

        JMenuItem empleadoMenuItem = new JMenuItem("Empleado");
        empleadoMenuItem.addActionListener(e -> correrEmpleado());

        JMenuItem proveedorMenuItem = new JMenuItem("Proveedor");
        proveedorMenuItem.addActionListener(e -> guardarProveedor());

        popupMenu.add(clienteMenuItem);
        popupMenu.add(productoMenuItem);
        popupMenu.add(empleadoMenuItem);
        popupMenu.add(proveedorMenuItem);

        entidadButton.addActionListener(e -> popupMenu.show(entidadButton, 0, entidadButton.getHeight()));

        entidadBar.add(entidadButton);
        add(entidadBar, BorderLayout.NORTH);

        entidadTableModel = new EntidadTableModel();
        entidadTable = new JTable(entidadTableModel);

        JScrollPane scrollPane = new JScrollPane(entidadTable);
        add(scrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void abrirCliente() {
        if (cliente == null || cliente.isClosed()){
            cliente = new Cliente();
            cliente.getContentPane().setBackground(Color.CYAN);
            desktopPane.add(cliente);
            cliente.setVisible(true);
            cliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                    entidadTableModel.agregarFila(new Object[] {"Cliente", cliente.getNombre(), cliente.getDetalle()});
                }
            });
        }else {
            try {
                cliente.setSelected(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void mostrarProducto() {
        if (producto == null || producto.isClosed()) {
            producto = new Producto();
            producto.getContentPane().setBackground(Color.PINK);
            desktopPane.add(producto);
            producto.setVisible(true);
            producto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                    entidadTableModel.agregarFila(new Object[] {"Producto", producto.getNombre(), producto.getDetalle()});
                }
            });
        }else {
            try {
                producto.setSelected(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    public void correrEmpleado() {
        if (empleado == null || empleado.isClosed()){
            empleado = new Empleado();
            empleado.getContentPane().setBackground(Color.ORANGE);
            desktopPane.add(empleado);
            empleado.setVisible(true);
            empleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                   // entidadTableModel.agregarFila(new Object[] {"Empleado", empleado.getNombre(), empleado.getDetalle()});
                }
            });
        }else {
            try {
                empleado.setSelected(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void guardarProveedor() {
        if (proveedor == null || proveedor.isClosed()){
            proveedor = new Proveedor();
            empleado.getContentPane().setBackground(Color.ORANGE);
            desktopPane.add(proveedor);
            proveedor.setVisible(true);
            proveedor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                    //entidadTableModel.agregarFila(new Object[] {"Proveedor", proveedor.getNombre(), proveedor.getDetalle()});
                }
            });
        }else{
            try {
                proveedor.setSelected(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}



