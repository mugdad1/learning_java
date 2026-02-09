import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class MyJFrame extends JFrame {
    JLabel num1Lb1 = new JLabel("number1 : ");
    JLabel num2Lb1 = new JLabel("number2 : ");
    JTextField num1Txt = new JTextField(15);
    JTextField num2Txt = new JTextField(15);
    JButton addbtn = new JButton("ADD");
    JButton subbtn = new JButton("sub");
    EventHandler listener = new EventHandler();

    public MyJFrame() {
        super("add 2 num");
        setLayout(new FlowLayout());
        add(num1Lb1);
        add(num1Txt);
        add(num2Lb1);
        add(num2Txt);
        add(addbtn);
        add(subbtn);
        addbtn.addActionListener(listener);
        subbtn.addActionListener(listener);


    }

private class EventHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
    int num1 = Integer.parseInt(num1Txt.getText());
    int num2 = Integer.parseInt(num2Txt.getText());
    int result ;
    if (e.getSource()==addbtn)
        {result = num1 + num2;}
    else
    {result = num1-num2;}
    JOptionPane.showMessageDialog(null , result , "Result",JOptionPane.INFORMATION_MESSAGE);
    }
}


}
