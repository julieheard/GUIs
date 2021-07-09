import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtherForm {
    private JPanel panel1;
    private JButton button1;

    public OtherForm() {
        MainMenu.frame.setPreferredSize(new Dimension(800,800)); //Makes the frame bigger
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainMenu.frame.setContentPane(new MainMenu().getPanel());
                MainMenu.frame.setPreferredSize(new Dimension(500,500));
                MainMenu.frame.pack();
            }
        });
    }

    public JPanel getPanel(){
        return panel1;
    }

}
