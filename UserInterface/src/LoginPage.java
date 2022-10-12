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
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel("Enter Information");
    HashMap<String ,String> LoginInfo = new HashMap<String, String>();
    LoginPage (HashMap<String, String> LoginInfoOriginal){
        LoginInfo = LoginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);

        resetButton.setFocusable(false);
        loginButton.setFocusable(false);
        frame.add(resetButton);
        frame.add(loginButton);
        frame.add(userIDField);
        frame.add(userPasswordField);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        userPasswordField.setEchoChar('*');

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
                    WelcomePage welcomePage = new WelcomePage();
                } else {
                    messageLabel.setText("Wrong password");
                    messageLabel.setForeground(Color.red);
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found");
            }
        }
    }


}
