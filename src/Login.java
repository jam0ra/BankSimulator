import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    private JPanel mainPanel;
    private JLabel usernameLabel;
    private JTextField usernameInput;
    private JLabel passwordLabel;
    private JPasswordField passwordInput;
    private JButton loginButton;
    private JButton signUpButton;
    private JPanel usernamePanel;
    private JPanel passwordPanel;
    private JPanel buttonPanel;

    public Login(){
        super("Login Page");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Login login = new Login();
    }
}
