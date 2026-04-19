import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

class HomeFrame extends JFrame {

    private JButton loginButton;
    private JButton registerButton;

    public HomeFrame() {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(new Color(240, 240, 240));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Welcome to Our Application");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);

        // Subtitle
        JLabel subtitleLabel = new JLabel("Please choose an option below:");
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridy = 1;
        mainPanel.add(subtitleLabel, gbc);

        // Login Button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(150, 50));
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(new Color(70, 130, 180));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(this::openLoginFrame);
        mainPanel.add(loginButton, gbc);

        // Register Button
        gbc.gridx = 1;
        registerButton = new JButton("Register");
        registerButton.setPreferredSize(new Dimension(150, 50));
        registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        registerButton.setBackground(new Color(60, 180, 100));
        registerButton.setForeground(Color.WHITE);
        registerButton.setFocusPainted(false);
        registerButton.addActionListener(this::openRegisterFrame);
        mainPanel.add(registerButton, gbc);

        add(mainPanel);
    }

    // Action listener for Login button - Opens LoginFrame
    private void openLoginFrame(ActionEvent e) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }

    // Action listener for Register button - Opens RegisterFrame (if you have one)
    private void openRegisterFrame(ActionEvent e) {
        RegisterFrame registerFrame = new RegisterFrame();
        registerFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HomeFrame().setVisible(true));
    }
}
