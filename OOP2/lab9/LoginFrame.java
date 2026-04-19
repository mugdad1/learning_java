import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginFrame extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton backButton;

    public LoginFrame() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(new Color(240, 240, 240));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);

        // Email Label and Field
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        mainPanel.add(emailLabel, gbc);

        gbc.gridx = 1;
        emailField = new JTextField(20);
        String emailPlaceholder = "Enter your email";
        emailField.setText(emailPlaceholder);
        emailField.setForeground(Color.GRAY);
        emailField.addFocusListener(
            new PlaceholderFocusListener(emailField, emailPlaceholder)
        );
        mainPanel.add(emailField, gbc);

        // Password Label and Field
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        mainPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        String passwordPlaceholder = "Enter your password";
        passwordField.setText(passwordPlaceholder);
        passwordField.setForeground(Color.GRAY);
        passwordField.setEchoChar((char) 0);
        passwordField.addFocusListener(
            new PasswordPlaceholderFocusListener(
                passwordField,
                passwordPlaceholder
            )
        );
        mainPanel.add(passwordField, gbc);

        // Login Button
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(120, 35));
        loginButton.setFont(new Font("Arial", Font.BOLD, 12));
        loginButton.setBackground(new Color(70, 130, 180));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        mainPanel.add(loginButton, gbc);

        // Back Button
        gbc.gridy = 4;
        backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(120, 35));
        backButton.setFont(new Font("Arial", Font.BOLD, 12));
        backButton.addActionListener(e -> dispose());
        mainPanel.add(backButton, gbc);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }

    // Inner Class: Placeholder Focus Listener for Text Fields
    public static class PlaceholderFocusListener implements FocusListener {

        private String placeholder;
        private JTextField textField;

        public PlaceholderFocusListener(
            JTextField textField,
            String placeholder
        ) {
            this.textField = textField;
            this.placeholder = placeholder;
        }

        @Override
        public void focusGained(FocusEvent e) {
            if (textField.getText().equals(placeholder)) {
                textField.setText("");
                textField.setForeground(Color.BLACK);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (textField.getText().isEmpty()) {
                textField.setText(placeholder);
                textField.setForeground(Color.GRAY);
            }
        }
    }

    // Inner Class: Placeholder Focus Listener for Password Fields
    public static class PasswordPlaceholderFocusListener
        implements FocusListener
    {

        private String placeholder;
        private JPasswordField passwordField;

        public PasswordPlaceholderFocusListener(
            JPasswordField passwordField,
            String placeholder
        ) {
            this.passwordField = passwordField;
            this.placeholder = placeholder;
        }

        @Override
        public void focusGained(FocusEvent e) {
            if (
                String.valueOf(passwordField.getPassword()).equals(placeholder)
            ) {
                passwordField.setText("");
                passwordField.setForeground(Color.BLACK);
                passwordField.setEchoChar('●');
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                passwordField.setText(placeholder);
                passwordField.setForeground(Color.GRAY);
                passwordField.setEchoChar((char) 0);
            }
        }
    }
}
