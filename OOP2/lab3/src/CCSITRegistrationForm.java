import javax.swing.*;
import java.awt.*;

public class CCSITRegistrationForm extends JFrame {
    public CCSITRegistrationForm() {
        setTitle("CCSIT Registration Form");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 1, 5, 5)); // single column, variable rows

        // Username
        add(new JLabel("username:"));
        JTextField usernameField = new JTextField(15);
        add(usernameField);

        // Password
        add(new JLabel("passwd:"));
        JPasswordField passwordField = new JPasswordField(15);
        add(passwordField);

        // Courses (checkboxes)
        add(new JLabel("select your courses:"));
        JPanel coursesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JCheckBox cbDb = new JCheckBox("db");
        JCheckBox cbSwe = new JCheckBox("swe");
        JCheckBox cbOop2 = new JCheckBox("oop2");
        coursesPanel.add(cbDb);
        coursesPanel.add(cbSwe);
        coursesPanel.add(cbOop2);
        add(coursesPanel);

        // Major (radio buttons)
        add(new JLabel("select your major:"));
        JPanel majorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JRadioButton rbCs = new JRadioButton("cs");
        JRadioButton rbIs = new JRadioButton("is");
        ButtonGroup majorGroup = new ButtonGroup();
        majorGroup.add(rbCs);
        majorGroup.add(rbIs);
        majorPanel.add(rbCs);
        majorPanel.add(rbIs);
        add(majorPanel);

        // Gender (radio buttons)
        add(new JLabel("select your gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JRadioButton rbMale = new JRadioButton("male");
        JRadioButton rbFemale = new JRadioButton("female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);
        add(genderPanel);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton submitBtn = new JButton("Submit");
        JButton cancelBtn = new JButton("Cancel");
        buttonPanel.add(submitBtn);
        buttonPanel.add(cancelBtn);
        add(buttonPanel);

        // Optional simple actions
        submitBtn.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            JOptionPane.showMessageDialog(this,
                    "Submitted:\nusername: " + user + "\npasswd: " + pass,
                    "Info", JOptionPane.INFORMATION_MESSAGE);
        });
        cancelBtn.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
            cbDb.setSelected(false);
            cbSwe.setSelected(false);
            cbOop2.setSelected(false);
            majorGroup.clearSelection();
            genderGroup.clearSelection();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CCSITRegistrationForm f = new CCSITRegistrationForm();
            f.setVisible(true);
        });
    }
}
