package classwork.swing;


import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by CCowalsky on 09.11.2015.
 */
public class MainForm extends JFrame {
    private JPanel panel1;
    private JButton exitbutton;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JTextField textField1;
    private JButton plusbutton;
    private JButton equalbutton;

    public MainForm (){
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        exitbutton.addActionListener(new QuitAction());
        ActionListener keyListener = new CalcularListener(textField1);

        a0Button.addActionListener(keyListener);
        a1Button.addActionListener(keyListener);
        a2Button.addActionListener(keyListener);
        a3Button.addActionListener(keyListener);
        a4Button.addActionListener(keyListener);
        a5Button.addActionListener(keyListener);
        a6Button.addActionListener(keyListener);
        a7Button.addActionListener(keyListener);
        a8Button.addActionListener(keyListener);
        a9Button.addActionListener(keyListener);
        plusbutton.addActionListener(keyListener);
        equalbutton.addActionListener(keyListener);

        a0Button.getActionCommand();
        a1Button.getActionCommand();
        a2Button.getActionCommand();
        a3Button.getActionCommand();
        a4Button.getActionCommand();
        a5Button.getActionCommand();
        a6Button.getActionCommand();
        a7Button.getActionCommand();
        a8Button.getActionCommand();
        a9Button.getActionCommand();
        plusbutton.getActionCommand();
        equalbutton.getActionCommand();
        }

    public static void main(String[] args) {
        new MainForm();
    }
}
