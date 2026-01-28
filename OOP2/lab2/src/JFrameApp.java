
import javax.swing.JFrame;

public class JFrameApp {
    public static void main(String[] args) {
        MyJFrame frm = new MyJFrame(); // Create an instance of MyJFrame
        
        // Set the default close operation to exit the application
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the size of the frame
        frm.setSize(300, 300);
        
        // Make the frame visible
        frm.setVisible(true);
    }
}

// Define the MyJFrame class, which extends JFrame
class MyJFrame extends JFrame {
    public MyJFrame() {
        super("My First Swing Application"); // Set the title of the frame
    }
}
