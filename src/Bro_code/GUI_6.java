package Bro_code;

//psvm for     public static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
import javax.swing.JOptionPane;

/**
 *
 * @author mugdad
 */
public class GUI_6 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"hello"+ name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"your are"+age+"years old");
        
        
        double hight = Double.parseDouble(JOptionPane.showInputDialog("enter your hight"));
        JOptionPane.showMessageDialog(null,"your are"+hight+" cm long");
        
        
        
        
    }
    
}
