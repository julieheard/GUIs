import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Converter {
    private JPanel panel1;
    private JTextField GBPAmount;
    private JButton convertButton;
    private JComboBox comboBox1;
    private JLabel displayMessage;
    private JButton backButton;


    public Converter() {

        displayMessage.setVisible(false);//Initial components can go in the constructor

        comboBox1.addItem("Euro");
        comboBox1.addItem("USD");
        comboBox1.addItem("INR");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Double amount = Double.parseDouble(GBPAmount.getText());
                    if (comboBox1.getSelectedItem().equals("Euro")) {
                        displayMessage.setText("Your amount in Euros is: " + Math.round((amount * 1.16) * 100.0) / 100.0);
                    } else if (comboBox1.getSelectedItem().equals("USD")) {
                        displayMessage.setText("Your amount in USD (United States Dollars) is: " + Math.round((amount * 1.37) * 100.0) / 100.0);
                    } else {
                        displayMessage.setText("Your amount in INR (Indian Rupees) is: " + Math.round((amount * 1.37) * 100.0) / 100.0);
                    }
                    displayMessage.setVisible(true);
                    panel1.setBackground(Color.green);
                } catch (Exception e) {
                    displayMessage.setVisible(true);
                    panel1.setBackground(Color.red);
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainMenu.frame.setContentPane(new MainMenu().getPanel()); //Go back to main menu after conversion
                MainMenu.frame.pack();
            }
        });
    }


    public JPanel getPanel() {
        return panel1;
    }

}
