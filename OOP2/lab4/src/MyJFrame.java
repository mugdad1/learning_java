import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class MyJFrame extends JFrame {
    JLabel num1Lb1 = new JLabel ("number1 : ");
    JLabel num2Lb1 = new JLabel ("number2 : ");
    JLabel rsltLb1 = new JLabel ("the result : ");
    JTextField num1Txt = new JTextField(15);
    JTextField num2Txt = new JTextField(15);
    JTextField rsltTxt = new JTextField(15);
    EventHandler listener = new EventHandler();

    public MyJFrame(){
        super("add 2 num");
        setLayout (new FlowLayout());
        add(num1Lb1);
        add(num1Txt);
        add(num2Lb1);
        add(num2Txt);
        add(rsltLb1);
        add(rsltTxt);
        num2Txt.addActionListener(listener);

    }
private class EventHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
    int num1 = Integer.parseInt(num1Txt.getText());
    int num2 = Integer.parseInt(num2Txt.getText());
    int result = num2 + num1 ;
    rsltTxt.setText("result "+ result);

    }
}


}
