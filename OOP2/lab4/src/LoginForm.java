import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    private final JTextField usernameField = new JTextField(15);
    private final JPasswordField passwordField = new JPasswordField(15);

    public LoginForm() {
        setTitle("Login Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");
        panel.add(loginButton);
        panel.add(cancelButton);

        loginButton.addActionListener(e -> handleLogin());
        cancelButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });

        add(panel);
        pack();
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        if ("malhajri".equals(username) && "1111".equals(password)) {
            JOptionPane.showMessageDialog(this, "Welcome malhajri",
                    "Login Successful", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Username or Password is not correct!",
                    "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
