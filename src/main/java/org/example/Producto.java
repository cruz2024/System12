package org.example;
import org.example.casesdatos.ProductoData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Producto extends JInternalFrame {

  private String nombre;
  private String detalle;

  public String getNombre(){
    return nombre;
  }

  public String getDetalle(){
    return detalle;
  }

  private static List<ProductoData> productosDATA = new ArrayList<>();
  private  JTextField nombreField;
  private  JTextField direcionField;
  private JTextField ubicacionField;
  private JTextField telefonoField;
  private JButton guardarJButton;
  private JButton salirJButton;
    public Producto(){
    setTitle("Producto");
    setSize(400,400);
      setBackground(Color.PINK);
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
    guardarJButton = new JButton("Guardar");
    salirJButton = new JButton("cancelar");

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
    panel.add(guardarJButton);
    panel.add(salirJButton);
    add(panel, BorderLayout.CENTER);

      guardarJButton.addActionListener(e -> guardarProducto());
    salirJButton.addActionListener(e -> salirFormulario());
  }
  private void guardarProducto(){
    ProductoData data = new ProductoData(
            nombreField.getText(),
            direcionField.getText(),
            ubicacionField.getText(),
            telefonoField.getText()
    );
    productosDATA.add(data);
    JOptionPane.showMessageDialog(this, "Producto guardado exitosamente");
  }
  private void salirFormulario(){
      dispose();
    }

  public static List<ProductoData> getproductosDATA(){
    return productosDATA;
  }
}

