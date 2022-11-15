import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class CreateAccountPage implements ActionListener {
    JFrame frame = new JFrame(); //opens new frame
    JLabel createAccountLabel = new JLabel("Create an Account");

    JLabel userNameLabel = new JLabel("User ID: ");

    JLabel passwordLabel = new JLabel("Password: ");

    JLabel confirmPasswordLabel = new JLabel("Confirm Pass: ");

    JButton confirmButton = new JButton("Confirm");

    JButton resetButton = new JButton("Reset");

    JTextField userNameField = new JTextField();

    JPasswordField createPasswordField = new JPasswordField();

    JPasswordField confirmPasswordField = new JPasswordField();





    CreateAccountPage(HashMap<String, String> LoginInfo){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        createAccountLabel.setBounds(70, 25, 420, 30);
        createAccountLabel.setFont(new Font(null, Font.BOLD, 30));
        frame.add(createAccountLabel);

        userNameLabel.setBounds(50,100,75,25);
        userNameLabel.setVisible(true);
        frame.add(userNameLabel);

        userNameField.setBounds(125, 100, 200, 25);
        userNameField.setVisible(true);
        frame.add(userNameField);

        passwordLabel.setBounds(50,150,75,25);
        passwordLabel.setVisible(true);
        frame.add(passwordLabel);

        createPasswordField.setBounds(125,150,200,25);
        createPasswordField.setVisible(true);
        frame.add(createPasswordField);

        confirmPasswordLabel.setBounds(30,200,100,25);
        confirmPasswordLabel.setVisible(true);
        frame.add(confirmPasswordLabel);

        confirmPasswordField.setBounds(125, 200, 200,25);
        confirmPasswordField.setVisible(true);
        frame.add(confirmPasswordField);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
