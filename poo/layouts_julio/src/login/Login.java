package login;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Tela de Login");
        setSize(300, 250);
        setResizable(false);
        setLayout();
    }

    private void setLayout(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        panel.setBorder(
                BorderFactory.createCompoundBorder(
                    BorderFactory.createEmptyBorder(3, 3, 3, 3),
                        BorderFactory.createTitledBorder(
                                BorderFactory.createLineBorder(Color.white),
                                "Login"
                        )
                )
        );

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(55,-10,100,100);

        JLabel PassLabel = new JLabel("Password:");
        PassLabel.setBounds(55,25,100,100);

        JTextField userField = new JTextField();
        userField.setToolTipText("User");
        userField.setBounds(115,30,100,20);

        JPasswordField passField = new JPasswordField();
        passField.setToolTipText("Password");
        passField.setBounds(115,65,100,20);

        JButton buttonLogin = new JButton("Access");
        buttonLogin.setBounds(80,110,125,20);
        buttonLogin.setBackground(Color.darkGray);
        buttonLogin.setForeground(Color.WHITE);

        JCheckBox keepaccess = new JCheckBox("keep access");
        keepaccess.setBackground(Color.LIGHT_GRAY);
        keepaccess.setBounds(75,145,135,20);

        JLabel forgotPass = new JLabel("Forgot Password");
        forgotPass.setForeground(Color.black);
        forgotPass.setBounds(65,140,180,100);

        panel.add(userLabel);
        panel.add(PassLabel);
        panel.add(userField);
        panel.add(passField);
        panel.add(buttonLogin);
        panel.add(keepaccess);
        panel.add(forgotPass);
        add(panel);
    }
    

}
