import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class WelcomePage implements ActionListener{
    public static void main(String[] args) {
        PasswordsAndIDS passID = new PasswordsAndIDS();

        LoginPage LoginPage = new LoginPage(passID.getLoginInfo());
        User user = new User();
    }

    public void actionPerformed(ActionEvent e){

    }

}
