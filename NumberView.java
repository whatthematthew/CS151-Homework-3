import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    Numbers model;

    public NumberView(int n1, int n2, int n3, Numbers model) {

        // NumberView -> Model -> GraphView
        this.model = model;

        add(new JLabel("Red"));
        JTextField redNumber = new JTextField(5);
        redNumber.setText(n1 + "");
        add(redNumber);
        
        add(new JLabel("Green"));
        JTextField greenNumber = new JTextField(5);
        greenNumber.setText(n1 + "");
        add(greenNumber);
        
        add(new JLabel("Blue"));
        JTextField blueNumber = new JTextField(5);
        blueNumber.setText(n1 + "");
        add(blueNumber);

        JButton submit = new JButton("Submit");
        add(submit);
        setVisible(true);
        setSize(1000, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      int number1 = Integer.parseInt(redNumber.getText());
      int number2 = Integer.parseInt(greenNumber.getText());
      int number3 = Integer.parseInt(blueNumber.getText());
       submit.addActionListener(event ->model.updateValues(number1, number2, number3));

    }
    
}