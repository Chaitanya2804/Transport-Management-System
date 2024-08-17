import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Viewcustomer extends JFrame  implements ActionListener {
    JButton back;

    Viewcustomer(String username) {
        setBounds(480,180,870,625);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lusername= new JLabel("Username");
        lusername.setBounds(30,50, 150,25);
        add(lusername);

        JLabel labelusername= new JLabel();
        labelusername.setBounds(220,50, 150,25);
        add(labelusername);

        JLabel lid= new JLabel("Id");
        lid.setBounds(30,110, 150,25);
        add(lid);

        JLabel labelid= new JLabel();
        labelid.setBounds(220,110, 150,25);
        add(labelid);

        JLabel lnum= new JLabel("Number");
        lnum.setBounds(30,170, 150,25);
        add(lnum);

        JLabel labelnum= new JLabel();
        labelnum.setBounds(220,170, 150,25);
        add(labelnum);

        JLabel lname= new JLabel("Name");
        lname.setBounds(30,230, 150,25);
        add(lname);

        JLabel labelname= new JLabel();
        labelname.setBounds(220,230, 150,25);
        add(labelname);

        JLabel lgender= new JLabel("Gender");
        lgender.setBounds(30,290, 150,25);
        add(lgender);

        JLabel labelgender= new JLabel();
        labelgender.setBounds(220,290, 150,25);
        add(labelgender);

        JLabel lcountry= new JLabel("Country");
        lcountry.setBounds(350,50, 150,25);
        add(lcountry);

        JLabel labelcountry= new JLabel();
        labelcountry.setBounds(550,50, 150,25);
        add(labelcountry);

        JLabel laddress= new JLabel("Address");
        laddress.setBounds(350,110, 150,25);
        add(laddress);

        JLabel labeladdress= new JLabel();
        labeladdress.setBounds(550,110, 150,25);
        add(labeladdress);

        JLabel lphone= new JLabel("Phone");
        lphone.setBounds(350,170, 150,25);
        add(lphone);

        JLabel labelphone= new JLabel();
        labelphone.setBounds(550,170, 150,25);
        add(labelphone);

        JLabel lemail= new JLabel("E-mail");
        lemail.setBounds(350,230, 150,25);
        add(lemail);

        JLabel labelemail= new JLabel();
        labelemail.setBounds(550,230, 150,25);
        add(labelemail);

        back= new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.PINK);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("diverse-community-people-standing-line-isolated-cartoon-men-women-group-different-countries-flat-vector-169603647.jpg"));
        Image i2= i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(20, 450,600,200);
        add(image);

        try {
            Conn c= new Conn();
            String query= "select * from customer where username='"+username+"'";
            ResultSet rs= c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnum.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        setVisible(true);




    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args){
        new Viewcustomer("Bablu69");
    }
}
