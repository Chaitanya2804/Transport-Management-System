import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Addcustomer extends JFrame implements ActionListener {
    JLabel lblusername, lusername,lid,num,lblname,labelname,lblgender;
    Choice comboid;
    JTextField tfnum,tcountry,taddress,temail,tphone;
    JRadioButton rmale,rfemale;
    JButton add, back;
    String username;


    Addcustomer(String username){
        this.username= username;
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        lblusername= new JLabel("Username");
        lblusername.setBounds(30, 50, 150,25);
        add(lblusername);


        lusername= new JLabel();
        lusername.setBounds(220,50,150,25);
        add(lusername);

        lid= new JLabel("Id");
        lid.setBounds(30,90,150,25);
        add(lid);

        comboid= new Choice();
        comboid.add("Passport");
        comboid.add("Aadhar Crad");
        comboid.add("Pan Card");
        comboid.add("Driving Licence");
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.black);
        comboid.setForeground(Color.pink);
        add(comboid);

        num= new JLabel("Number");
        num.setBounds(30,130,150,25);
        add(num);

        tfnum= new JTextField();
        tfnum.setBounds(220,130 ,150,25);
        add(tfnum);

        lblname= new JLabel("Name");
        lblname.setBounds(30, 170, 150,25);
        add(lblname);

        labelname= new JLabel();
        labelname.setBounds(220, 170, 150,25);
        add(labelname);

        lblgender= new JLabel("Gender");
        lblgender.setBounds(30, 210, 150,25);
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.white);
        rmale.setForeground(Color.black);
        add(rmale);

        rfemale= new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.white);
        rfemale.setForeground(Color.black);
        add(rfemale);

        ButtonGroup bg= new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        JLabel country= new JLabel("Country");
        country.setBounds(30, 250, 150,25);
        add(country);


        tcountry= new JTextField();
        tcountry.setBounds(220,250,150,25);
        add(tcountry);

        JLabel address= new JLabel("Address");
        address.setBounds(30, 290, 150,25);
        add(address);


        taddress= new JTextField();
        taddress.setBounds(220,290,150,25);
        add(taddress);

        JLabel email= new JLabel("E-mail");
        email.setBounds(30, 330, 150,25);
        add(email);


        temail= new JTextField();
        temail.setBounds(220,330,150,25);
        add(temail);

        JLabel phone= new JLabel("Phone");
        phone.setBounds(30, 370, 150,25);
        add(phone);


        tphone= new JTextField();
        tphone.setBounds(220,370,150,25);
        add(tphone);

        add= new JButton("Add");
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);

        back= new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("tourist-man-with-travel-bag-icon-cartoon-style-vector-32780108.jpg"));
        Image i2= i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(400,40,400,420);
        add(image);

        try {
            Conn c= new Conn();
            ResultSet rs= c.s.executeQuery("Select * from account where username= 'Bablu69'");
            while(rs.next()){
                lusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }


        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username= lusername.getText();
            String id = (String)comboid.getSelectedItem();
            String num= tfnum.getText();
            String lblname= labelname.getText();
            String gender= null;
            if(rmale.isSelected()){
                gender= "Male";
            }else{
                gender= "Female";
            }
            String country= tcountry.getText();
            String address= taddress.getText();
            String phone= tphone.getText();
            String email= temail.getText();

            try{
                Conn c= new Conn();
                String query= "insert into customer values('"+username+"','"+id+"','"+num+"','"+lblname+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Cutomer Details Added Successfully");
                setVisible(false);

            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Addcustomer("");
    }
}
