import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login, signup, bpassword;
    JTextField tusername,tpassword;

    Login() {
        setSize(900, 450);
        setLocation(350, 200);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        JPanel p = new JPanel();
        p.setBackground(new Color(140, 120, 130));
        p.setBounds(0, 0, 400, 400);
        p.setLayout(null);
        add(p);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("customer-service-icon-user-with-laptop-computer-and-headphone-illustration-free-vector.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p.add(image);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(400, 30, 450, 300);
        add(p1);

        JLabel username = new JLabel("Username");
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        username.setBounds(60, 20, 100, 25);
        p1.add(username);

        tusername = new JTextField();
        tusername.setBounds(60, 60, 300, 30);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tusername);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setBounds(60, 110, 100, 25);
        p1.add(password);

        tpassword = new JTextField();
        tpassword.setBounds(60, 150, 300, 30);
        tpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tpassword);

        login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(Color.pink);
        login.setBorder(new LineBorder(Color.RED));
        login.addActionListener(this);
        p1.add(login);

        signup = new JButton("Signup");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground(Color.pink);
        signup.setBorder(new LineBorder(Color.RED));
        signup.addActionListener(this);
        p1.add(signup);

        bpassword = new JButton("Forgot Password");
        bpassword.setBounds(130, 250, 130, 30);
        bpassword.setBackground(Color.pink);
        bpassword.setBorder(new LineBorder(Color.RED));
        bpassword.addActionListener(this);
        p1.add(bpassword);

        JLabel text = new JLabel("Login Mai Taklif....");
        text.setBounds(280, 250, 150, 20);
        text.setForeground(Color.red);
        p1.add(text);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            try{
                String username= tusername.getText();
                String password= tpassword.getText();

                String query= "select * from account where username= '"+username+"' AND password= '"+password+"'";
                Conn c= new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }



            }catch(Exception e){
                e.printStackTrace();
            }

        } else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup();
        } else {
            setVisible(false);
            new Forgetpassword();
        }


    }

    public static void main(String[] args) {
        new Login();
    }
}
