import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class MYJFrame extends JFrame {

    public MYJFrame() {
        super("My Favorite Animal"); // Title of the JFrame

        // Setting the layout
        setLayout(new FlowLayout());

        // Adding a label with text
        JLabel lbl = new JLabel("My favorite animal is cat");
        add(lbl);

        // Adding an icon image
        Icon icn = new ImageIcon(getClass().getResource("icn.jpg")); // Ensure correct path
        JLabel icnlbl = new JLabel(icn);
        add(icnlbl);

        // Setting frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200); // Set a preferred size
        setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        // Create the JFrame instance
        new MYJFrame();
    }
}
