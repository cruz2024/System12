
package org.example;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JInternalFrame ClienteInternal;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        setTitle("Login");
        setSize(350, 250);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Nombre"));
        nameField = new JTextField(10); // Utilizamos la variable de instancia
        add(nameField);

        add(new JLabel("Correo electrónico"));
        emailField = new JTextField(10); // Utilizamos la variable de instancia
        add(emailField);

        add(new JLabel("Contraseña"));
        passwordField = new JPasswordField(10); // Utilizamos la variable de instancia
        add(passwordField);

        loginButton = new JButton("Login"); // Utilizamos la variable de instancia
        loginButton.setBackground(Color.GREEN);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Todo los campo tiene que estar completo", "Error", JOptionPane.ERROR_MESSAGE);
                }else if (!isValidEmail(email)){
                    JOptionPane.showMessageDialog(null, "Correo no valido", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    /**La validacion*/
                    JOptionPane.showMessageDialog(null, "Login exitoso");
                    new VentanaPrincipal();
                }

            }

        });
        add(loginButton);

        setVisible(true);
    }
    private boolean isValidEmail(String email){
        String emailRegex = "[a-zA-Z0-9_+8*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

}

