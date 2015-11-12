package classwork.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CCowalsky on 12.11.2015.
 */
public class AdvForm extends JFrame{

    private JPanel panel;
    private JButton exitButton;
    private JList list1;
    private JButton addButton;
    private JTextField textField1;


    public AdvForm(){
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        exitButton.addActionListener(new ActionListener() {
            private int exitCode = 1;

            @Override
            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(null,
                        "Are you sure", "Exit",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {

                    System.exit(exitCode);
                }

            }
        });

        exitButton.addActionListener(e -> System.out.println("exit")) ;

        DefaultListModel<String> model = new DefaultListModel<String>();
        list1.setModel(model);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text = textField1.getText();
                textField1.setText("");

                model.add(model.size(), text);
            }
        });

    }

    public static void main(String[] args) {
        new  AdvForm();
    }

}
