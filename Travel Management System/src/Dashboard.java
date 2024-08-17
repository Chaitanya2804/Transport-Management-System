import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonaldetails,viewPersonaldetails;
    Dashboard(String username){
        this.username= username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0, 1600, 65);
        add(p1);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images.png"));
        Image i2= i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon= new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading= new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Helvatica", Font.BOLD, 25));
        p1.add(heading);

        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65, 300, 900);
        add(p2);

        addPersonaldetails= new JButton("Add Personal Details");
        addPersonaldetails.setBounds(0,0,300,50);
        addPersonaldetails.setBackground(new Color(0,0,102));
        addPersonaldetails.setFont(new Font("Helvatica",Font.BOLD, 20));
        addPersonaldetails.setForeground(Color.WHITE);
        addPersonaldetails.setMargin(new Insets(0,0,0,30));
        addPersonaldetails.addActionListener(this);
        p2.add(addPersonaldetails);

        JButton updatePersonaldetails= new JButton("Update Personal Details");
        updatePersonaldetails.setBounds(0,40,300,50);
        updatePersonaldetails.setBackground(new Color(0,0,102));
        updatePersonaldetails.setFont(new Font("Helvatica",Font.BOLD, 20));
        updatePersonaldetails.setForeground(Color.WHITE);
        updatePersonaldetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatePersonaldetails);

        viewPersonaldetails= new JButton("View Personal Details");
        viewPersonaldetails.setBounds(0,80,300,50);
        viewPersonaldetails.setBackground(new Color(0,0,102));
        viewPersonaldetails.setFont(new Font("Helvatica",Font.BOLD, 20));
        viewPersonaldetails.setForeground(Color.WHITE);
        viewPersonaldetails.setMargin(new Insets(0,0,0,30));
        viewPersonaldetails.addActionListener(this);
        p2.add(viewPersonaldetails);

        JButton deletePersonaldetails= new JButton("Delete Personal Details");
        deletePersonaldetails.setBounds(0,120,300,50);
        deletePersonaldetails.setBackground(new Color(0,0,102));
        deletePersonaldetails.setFont(new Font("Helvatica",Font.BOLD, 20));
        deletePersonaldetails.setForeground(Color.WHITE);
        deletePersonaldetails.setMargin(new Insets(0,0,0,30));
        p2.add(deletePersonaldetails);

        JButton checkPackage= new JButton("Check Package");
        checkPackage.setBounds(0,160,300,50);
        checkPackage.setBackground(new Color(0,0,102));
        checkPackage.setFont(new Font("Helvatica",Font.BOLD, 20));
        checkPackage.setForeground(Color.WHITE);
        checkPackage.setMargin(new Insets(0,0,0,30));
        p2.add(checkPackage);

        JButton bookPackage= new JButton("Book Package");
        bookPackage.setBounds(0,200,300,50);
        bookPackage.setBackground(new Color(0,0,102));
        bookPackage.setFont(new Font("Helvatica",Font.BOLD, 20));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setMargin(new Insets(0,0,0,30));
        p2.add(bookPackage);

        JButton viewPackage= new JButton("View Package");
        viewPackage.setBounds(0,240,300,50);
        viewPackage.setBackground(new Color(0,0,102));
        viewPackage.setFont(new Font("Helvatica",Font.BOLD, 20));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setMargin(new Insets(0,0,0,30));
        p2.add(viewPackage);

        JButton viewHotel= new JButton("View Hotels");
        viewHotel.setBounds(0,280,300,50);
        viewHotel.setBackground(new Color(0,0,102));
        viewHotel.setFont(new Font("Helvatica",Font.BOLD, 20));
        viewHotel.setForeground(Color.WHITE);
        viewHotel.setMargin(new Insets(0,0,0,30));
        p2.add(viewHotel);

        JButton bookHotel= new JButton("Book Hotel");
        bookHotel.setBounds(0,320,300,50);
        bookHotel.setBackground(new Color(0,0,102));
        bookHotel.setFont(new Font("Helvatica",Font.BOLD, 20));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setMargin(new Insets(0,0,0,30));
        p2.add(bookHotel);

        JButton viewbookHotel= new JButton("View Booked Hotel");
        viewbookHotel.setBounds(0,360,300,50);
        viewbookHotel.setBackground(new Color(0,0,102));
        viewbookHotel.setFont(new Font("Helvatica",Font.BOLD, 20));
        viewbookHotel.setForeground(Color.WHITE);
        viewbookHotel.setMargin(new Insets(0,0,0,30));
        p2.add(viewbookHotel);

        JButton destination= new JButton("Destinations");
        destination.setBounds(0,400,300,50);
        destination.setBackground(new Color(0,0,102));
        destination.setFont(new Font("Helvatica",Font.BOLD, 20));
        destination.setForeground(Color.WHITE);
        destination.setMargin(new Insets(0,0,0,30));
        p2.add(destination);

        JButton payments= new JButton("Payments");
        payments.setBounds(0,440,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setFont(new Font("Helvatica",Font.BOLD, 20));
        payments.setForeground(Color.WHITE);
        payments.setMargin(new Insets(0,0,0,30));
        p2.add(payments);

        JButton calculator= new JButton("Calculator");
        calculator.setBounds(0,480,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setFont(new Font("Helvatica",Font.BOLD, 20));
        calculator.setForeground(Color.WHITE);
        calculator.setMargin(new Insets(0,0,0,30));
        p2.add(calculator);

        JButton notepad= new JButton("Notepad");
        notepad.setBounds(0,520,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setFont(new Font("Helvatica",Font.BOLD, 20));
        notepad.setForeground(Color.WHITE);
        notepad.setMargin(new Insets(0,0,0,30));
        p2.add(notepad);

        JButton about= new JButton("About Us");
        about.setBounds(0,560,300,50);
        about.setBackground(new Color(0,0,102));
        about.setFont(new Font("Helvatica",Font.BOLD, 20));
        about.setForeground(Color.WHITE);
        about.setMargin(new Insets(0,0,0,30));
        p2.add(about);

        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("amazing-sunset-panorama-maldives-luxury-260nw-1239349312.jpg"));
        Image i5= i4.getImage().getScaledInstance(1600,950,Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0,0,1600 , 950);
        add(image);

        JLabel text= new JLabel("Travel And Tourism Management System");
        text.setBounds(400,70,1000,70);
        text.setForeground(Color.black);
        text.setFont(new Font("Raleway", Font.PLAIN,40));
        image.add(text);





        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonaldetails){
            new Addcustomer(username);
        } else if (ae.getSource()==viewPersonaldetails) {
            new Viewcustomer(username);
        }
    }

    public static void main(String [] args){
        new Dashboard("");
    }
}
