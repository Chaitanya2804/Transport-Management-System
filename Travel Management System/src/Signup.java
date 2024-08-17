import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField tusername,tfname, tpassword, tans;
    Choice s1;
    Signup() {
        setBounds(350, 200,900,360);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        JPanel r1= new JPanel();
        r1.setBackground(new Color(140,120,130));
        r1.setBounds(0,0, 500,400);
        r1.setLayout(null);
        add(r1);

        JLabel username= new JLabel("Username");
        username.setFont(new Font("Helvatica",Font.BOLD, 18));
        username.setBounds(50,20,125,25);
        r1.add(username);

        tusername = new JTextField();
        tusername.setBounds(160,20, 180,25);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        r1.add(tusername);

        JLabel name= new JLabel("Name");
        name.setFont(new Font("Helvatica",Font.BOLD, 18));
        name.setBounds(50,60,125,25);
        r1.add(name);

        tfname = new JTextField();
        tfname.setBounds(160,60, 180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        r1.add(tfname);

        JLabel password= new JLabel("Password");
        password.setFont(new Font("Helvatica",Font.BOLD, 18));
        password.setBounds(50,100,125,25);
        r1.add(password);

        tpassword = new JTextField();
        tpassword.setBounds(160,100, 180,25);
        tpassword.setBorder(BorderFactory.createEmptyBorder());
        r1.add(tpassword);

        JLabel security= new JLabel("Security Question");
        security.setFont(new Font("Helvatica",Font.BOLD, 18));
        security.setBounds(50,140,125,25);
        r1.add(security);
        s1=  new Choice();
        s1.add("Your Favourite Language");
        s1.add("Your Favourite Marvel  Character");
        s1.add("Your Favourite Football player");
        s1.add("Your Favourite Web seires");
        s1.setBounds(180, 140,220,25);
        r1.add(s1);

        JLabel ans= new JLabel("Answer");
        ans.setFont(new Font("Helvatica",Font.BOLD, 18));
        ans.setBounds(50,180,125,25);
        r1.add(ans);

        tans = new JTextField();
        tans.setBounds(160,180, 180,25);
        tans.setBorder(BorderFactory.createEmptyBorder());
        r1.add(tans);

         b1= new JButton("Create");
        b1.setBackground(Color.pink);
        b1.setBorder(new LineBorder(Color.red));
        b1.setBounds(80, 250, 100, 30);
        b1.addActionListener(this);
        r1.add(b1);

        b2= new JButton("Back");
        b2.setBackground(Color.pink);
        b2.setBorder(new LineBorder(Color.red));
        b2.setBounds(230, 250, 100, 30);
        b2.addActionListener(this);
        r1.add(b2);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("pngtree-flatstyle-finger-cursor-signup-icon-on-black-background-vector-png-image_41389728.jpg"));
        Image i2= i1.getImage().getScaledInstance(250, 250 ,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(580, 50, 250,250);
        add(image);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String username= tusername.getText();
            String name= tfname.getText();
            String password= tpassword.getText();
            String security= s1.getSelectedItem();
            String answer= tans.getText();

            String query= "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+security+"', '"+answer+"')";

            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }


        } else if (ae.getSource()== b2) {
            setVisible(false);
            new Login();


        }


    }
    public static void main(String []args){
        new Signup();
    }
}
