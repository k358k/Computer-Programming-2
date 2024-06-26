import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {

    JPanel panel;
    JTextField roleTextField;
    JTextField userNameTextField;
    JPasswordField passWordTextField;
    JLabel userNameTextLabel;
    JLabel passWordTextLabel;
    JLabel loginTitle;
    JLabel roleTextLabel;
    JButton loginButton;
    JComboBox rolebox;



    LoginPage() {
        String [] roles = {"Employee","Administrator"};
        rolebox = new JComboBox(roles);
        rolebox.setBounds(50,80,160,30);

        roleTextLabel = new JLabel("Role");
        roleTextLabel.setBounds(50,55,160,30);

        loginTitle = new JLabel("Login");
        loginTitle.setBounds(90,20,160,30);
        loginTitle.setFont(new Font("Consolas",Font.BOLD,25));

        loginButton = new JButton("LOGIN");
        loginButton.setBounds(50,240,160,30);
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Consolas",Font.BOLD,15));
        loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        loginButton.setBackground(new Color(51,102,153));


        passWordTextLabel = new JLabel("Password");
        passWordTextLabel.setBounds(50,175,160,30);

        passWordTextField = new JPasswordField();
        passWordTextField.setBounds(50,200,160,30);
        passWordTextField.setBackground(Color.WHITE);
        passWordTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));


        userNameTextLabel = new JLabel("Username");
        userNameTextLabel.setBounds(50,115,160,30);

        userNameTextField = new JTextField();
        userNameTextField.setBounds(50,140,160,30);
        userNameTextField.setBackground(Color.WHITE);
        userNameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));


        panel = new JPanel();
        panel.setBounds(75,40,250,300);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel.setBackground(new Color(240,240,240));
        panel.add(userNameTextField);
        panel.add(passWordTextField);
        panel.add(userNameTextLabel);
        panel.add(passWordTextLabel);
        panel.add(loginButton);
        panel.add(loginTitle);
        panel.add(roleTextLabel);
        panel.add(rolebox);


        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(420,420);
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
        this.add(panel);
        this.getContentPane().setBackground(new Color(85,85,85));
        this.setLocationRelativeTo(null);// makes frame popup in the center
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
