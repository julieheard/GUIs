import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {

    private JPanel HomeForm;
    private JButton JButton1;
    private JButton JButton2;
    private JButton JButton3;


    // This is the main JFrame, other panels get switched into and out of this frame.
    public static JFrame frame = new JFrame("MainMenu");


    public MainMenu() {
        JButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setContentPane(new myForm().getPanel());
                frame.pack(); //sizes the frame so that all its contents are at or above their preferred sizes. Freezes if you remove this.
            }
        });
        JButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setContentPane(new OtherForm().getPanel());
                frame.pack();
            }
        });
        JButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setContentPane(new Converter().getPanel());
                frame.pack();
            }
        });
    }

    public JPanel getPanel() {
        return HomeForm;
    }

    public static void main(String[] args) {
        frame.setContentPane(new MainMenu().HomeForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500)); //Sets the size of the window in pixels
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//Moves theJFrame to the middle of the screen
    }
}
