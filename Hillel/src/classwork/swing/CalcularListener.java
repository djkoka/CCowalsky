package classwork.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CCowalsky on 09.11.2015.
 */
public class CalcularListener implements ActionListener {

    private JTextField textField;
    private int firstOperant;

    public CalcularListener (JTextField textField){
        this.textField= textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();
        System.out.println(buttonPressed + " Key pressed");

        switch (buttonPressed){
            case "+":
                firstOperant=Integer.parseInt(textField.getText());
                textField.setText(" ");
                break;
            case "=":
                Integer secoundOperant = Integer.parseInt(textField.getText());
                secoundOperant+=firstOperant;
                textField.setText(secoundOperant.toString());
                break;
            default:
                textField.setText(textField.getText()+buttonPressed);

        }
    }
}
