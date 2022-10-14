import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class WelcomePage implements ActionListener{

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    WelcomePage(HashMap<String, String> loginInfo, String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));

        frame.add(welcomeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        welcomeLabel.setText("Welcome, " + userID);

    }

    public void actionPerformed(ActionEvent e){

    }

}
