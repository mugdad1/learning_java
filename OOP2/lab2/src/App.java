import javax.swing.*;

void main() throws Exception {
    String name = JOptionPane.showInputDialog(
            null,
            "insert your name",
            "informaiton",
            JOptionPane.QUESTION_MESSAGE
    );
    JOptionPane.showMessageDialog(null,
            "welcome to oop2",
            "greetings",
            JOptionPane.INFORMATION_MESSAGE
    );
    IO.println("Hello, World!");
}
