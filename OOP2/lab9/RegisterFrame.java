import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RegisterFrame extends JFrame {

    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton, backButton;

    public RegisterFrame() {
        setTitle("Register");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(new Color(240, 240, 240));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("Register");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        
        gbc.gridy = 1;
        gbc.gridx = 0;
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        mainPanel.add(nameLabel, gbc);

        gbc.gridx = 1;
        nameField = new JTextField(20);
        String namePlaceholder = "Enter your name";
        nameField.setText(namePlaceholder);
        nameField.setForeground(Color.GRAY);
        nameField.addFocusListener(new PlaceholderFocusListener(nameField, namePlaceholder));
        mainPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        mainPanel.add(emailLabel, gbc);

        gbc.gridx = 1;
        emailField = new JTextField(20);
        String emailPlaceholder = "Enter your email";
        emailField.setText(emailPlaceholder);
        emailField.setForeground(Color.GRAY);
        emailField.addFocusListener(new PlaceholderFocusListener(emailField, emailPlaceholder));
        mainPanel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        mainPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        String passwordPlaceholder = "Enter your password";
        passwordField.setText(passwordPlaceholder);
        passwordField.setForeground(Color.GRAY);
        passwordField.setEchoChar((char) 0);
        passwordField.addFocusListener(new PasswordPlaceholderFocusListener(passwordField, passwordPlaceholder));
        mainPanel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel confirmLabel = new JLabel("Confirm:");
        confirmLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        mainPanel.add(confirmLabel, gbc);

        gbc.gridx = 1;
        confirmPasswordField = new JPasswordField(20);
        String confirmPlaceholder = "Confirm your password";
        confirmPasswordField.setText(confirmPlaceholder);
        confirmPasswordField.setForeground(Color.GRAY);
        confirmPasswordField.setEchoChar((char) 0);
        confirmPasswordField.addFocusListener(new PasswordPlaceholderFocusListener(confirmPasswordField, confirmPlaceholder));
        mainPanel.add(confirmPasswordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        registerButton = new JButton("Register");
        registerButton.setPreferredSize(new Dimension(120, 35));
        registerButton.setFont(new Font("Arial", Font.BOLD, 12));
        registerButton.setBackground(new Color(60, 180, 100));
        registerButton.setForeground(Color.WHITE);
        registerButton.setFocusPainted(false);
        mainPanel.add(registerButton, gbc);

        gbc.gridy = 6;
        backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(120, 35));
        backButton.setFont(new Font("Arial", Font.BOLD, 12));
        backButton.addActionListener(e -> dispose());
        mainPanel.add(backButton, gbc);

        add(mainPanel);
    }

    public static class PlaceholderFocusListener implements FocusListener {
        private String placeholder;
        private JTextField textField;

        public PlaceholderFocusListener(JTextField textField, String placeholder) {
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

    public static class PasswordPlaceholderFocusListener implements FocusListener {
        private String placeholder;
        private JPasswordField passwordField;

        public PasswordPlaceholderFocusListener(JPasswordField passwordField, String placeholder) {
            this.passwordField = passwordField;
            this.placeholder = placeholder;
        }

        @Override
        public void focusGained(FocusEvent e) {
            if (String.valueOf(passwordField.getPassword()).equals(placeholder)) {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegisterFrame().setVisible(true));
    }
}
