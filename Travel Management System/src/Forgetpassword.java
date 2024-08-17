import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Forgetpassword extends JFrame implements ActionListener {
    JTextField tusername,tname,tquestion,tanswer,tpassword;
    JButton search,retrieve,back;
    Forgetpassword(){
        setBounds(350,200,850,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("6434880.jpg"));
        Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);


        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,300);
        add(p1);

        JLabel username= new JLabel("Username");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("Helvatica", Font.BOLD, 14));
        p1.add(username);

        tusername = new JTextField();
        tusername.setBounds(175, 20, 150, 25);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tusername);

        search= new JButton("Search");
        search.setBackground(Color.gray);
        search.setForeground(Color.white);
        search.setBounds(350,20,100, 25);
        search.addActionListener(this);
        p1.add(search);

        JLabel name= new JLabel("Name");
        name.setBounds(40,60,100,25);
        name.setFont(new Font("Helvatica", Font.BOLD, 14));
        p1.add(name);

        tname = new JTextField();
        tname.setBounds(175, 60, 150, 25);
        tname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tname);

        JLabel question= new JLabel("Security Question");
        question.setBounds(40,100,150,25);
        question.setFont(new Font("Helvatica", Font.BOLD, 14));
        p1.add(question);

        tquestion = new JTextField();
        tquestion.setBounds(175, 100, 150, 25);
        tquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tquestion);

        JLabel answer= new JLabel("Answer");
        answer.setBounds(40,140,150,25);
        answer.setFont(new Font("Helvatica", Font.BOLD, 14));
        p1.add(answer);

        tanswer = new JTextField();
        tanswer.setBounds(175, 140, 150, 25);
        tanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tanswer);

        retrieve= new JButton("Retrieve");
        retrieve.setBackground(Color.gray);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(350,140,100, 25);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel password= new JLabel("Password");
        password.setBounds(40,180,150,25);
        password.setFont(new Font("Helvatica", Font.BOLD, 14));
        p1.add(password);

        tpassword = new JTextField();
        tpassword.setBounds(175, 180, 150, 25);
        tpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tpassword);

        back= new JButton("Back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(150,230,100, 25);
        back.addActionListener(this);
        p1.add(back);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query= "select * from account where username = '"+tusername.getText()+"'";
                Conn c= new Conn();

                ResultSet rs= c.s.executeQuery(query);
                while(rs.next()){
                    tname.setText(rs.getString("name"));
                    tquestion.setText(rs.getString("security"));
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        } else if (ae.getSource()==retrieve) {
            try{
                String query= "select * from account where ans = '"+tanswer.getText()+"' AND username = '"+tusername.getText()+"'";
                Conn c= new Conn();

                ResultSet rs= c.s.executeQuery(query);
                while(rs.next()){
                    tpassword.setText(rs.getString("password"));

                }

            }catch(Exception e){
                e.printStackTrace();
            }


        } else {
            setVisible(false);
            new Login();
        }

    }
    public static void main(String []args){
        new Forgetpassword();

    }

}

