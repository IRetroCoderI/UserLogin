import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class LoginPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JButton createAccountButton = new JButton("Create Account");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel("Enter Information");
    HashMap<String ,String> LoginInfo = new HashMap<String, String>();



    LoginPage (HashMap<String, String> LoginInfoOriginal){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        LoginInfo = LoginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        frame.add(userIDLabel);
        userIDField.setBounds(125, 100, 200, 25);
        frame.add(userIDField);

        userPasswordField.setBounds(125, 150, 200, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        frame.add(userPasswordField);
        frame.add(userPasswordLabel);
        userPasswordField.setEchoChar('*');


        messageLabel.setBounds(125, 300, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
        frame.add(messageLabel);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        frame.add(loginButton);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);
        frame.add(resetButton);

        createAccountButton.setBounds(125,230,200,25);
        createAccountButton.addActionListener(this);
        createAccountButton.setFocusable(false);
        frame.add(createAccountButton);
    }
    public void actionPerformed(ActionEvent e) {
        //some code
        if (e.getSource() == resetButton) {
            userIDField.setText(""); //clears text field
            userPasswordField.setText("");//clears text field
            messageLabel.setForeground(Color.BLACK);
            messageLabel.setText("Enter Information");
        }
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String pass = String.valueOf(userPasswordField.getPassword());

            if (LoginInfo.containsKey(userID)) {
                if (LoginInfo.containsValue(pass)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(LoginInfo, userID); //opens new welcome page

                } else {
                    messageLabel.setText("Wrong password");
                    messageLabel.setForeground(Color.red);
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found");
            }
        }
        if(e.getSource() == createAccountButton){
            CreateAccountPage createAccountPage = new CreateAccountPage(LoginInfo);
            frame.dispose();
        }
    }
}