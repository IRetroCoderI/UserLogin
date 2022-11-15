import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class CreateAccountPage implements ActionListener {
    JFrame frame = new JFrame(); //opens new frame
    JLabel createAccountLabel = new JLabel("Create an Account");
    JLabel userNameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel confirmPasswordLabel = new JLabel("Confirm Password: ");


    

    CreateAccountPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        createAccountLabel.setBounds(70, 25, 420, 30);
        createAccountLabel.setFont(new Font(null, Font.BOLD, 30));
        frame.add(createAccountLabel);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
