import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class CreateAccountPage implements ActionListener {
    JFrame frame = new JFrame(); //opens new frame

    JLabel messageLabel = new JLabel("Create an Account");

    JLabel userNameLabel = new JLabel("User ID: ");

    JLabel passwordLabel = new JLabel("Password: ");

    JLabel confirmPasswordLabel = new JLabel("Confirm Pass: ");

    JButton confirmButton = new JButton("Confirm");

    JButton resetButton = new JButton("Reset");

    JTextField userNameField = new JTextField();

    JPasswordField createPasswordField = new JPasswordField();

    JPasswordField confirmPasswordField = new JPasswordField();

    HashMap<String, String> LoginInfo = new HashMap<>();

    CreateAccountPage(HashMap<String, String> LoginInfoOriginal){

        LoginInfo = LoginInfoOriginal; //stores loginInfo sent from loginPage(original) and stores it here

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        messageLabel.setBounds(70, 25, 420, 30);
        messageLabel.setFont(new Font(null, Font.BOLD, 30));
        frame.add(messageLabel);

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

        confirmButton.setBounds(125,250,200,25);
        confirmButton.setVisible(true);
        confirmButton.addActionListener(this);
        confirmButton.setFocusable(false);
        frame.add(confirmButton);

        resetButton.setBounds(125, 280, 200,25);
        resetButton.setFocusable(false);
        resetButton.setVisible(true);
        resetButton.addActionListener(this);
        frame.add(resetButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userNameField.setText("");
            createPasswordField.setText("");
            confirmPasswordField.setText("");
            messageLabel.setText("Create an Account");
        }


        if(e.getSource() == confirmButton){ //checks if the confirm button is pressed
            String username = userNameField.getText();
            String password = createPasswordField.getText();
            String passwordConfirmation = confirmPasswordField.getText();

            // 1 - make sure username does not exist
            // 2 - make sure username and password fields are not empty
            // 3 - make sure passwords match
            // 4 - profit
            if(LoginInfo.containsKey(username)){ // 1
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username Exists");
            }

            if(userNameField.getText().length() != 0 && createPasswordField.getText().length() != 0 && confirmPasswordField.getText().length() != 0){
                if(passwordConfirmation.equals(password)){
                    LoginInfo.put(username, password);
                    frame.dispose();
                    LoginPage newLoginPage = new LoginPage(LoginInfo);

                } else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Passwords Different");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Fill all Fields");
            }




        }

    }
}
