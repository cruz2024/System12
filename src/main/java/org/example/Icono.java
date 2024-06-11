package org.example;

import javax.swing.*;
import java.awt.*;

public class Icono extends JInternalFrame {

    private ImageIcon iconoCliente = new ImageIcon("imagen/cliente.jpg");
    private ImageIcon iconoProducto = new ImageIcon("imagen/producto.jpg");
    private ImageIcon iconoEmpleado = new ImageIcon("imagen/empleado.jpg");
    private ImageIcon iconoProveedor = new ImageIcon("imagen/proveedor.jpg");

    public  Icono(){
        setLayout(new GridLayout(1, 2));
        add(new JLabel(iconoCliente));
        add(new JLabel(iconoProducto));
        add(new JLabel(iconoEmpleado));
        add(new JLabel(iconoProveedor));
    }

    public void setLocationRelativeTo(Object o) {
        setVisible(true);
    }
}
