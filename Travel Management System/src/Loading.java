import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    String username;
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max=bar.getMaximum();//100
                int value= bar.getValue();

                if(value<max){
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                   new Dashboard(username);
                }
                Thread.sleep(50);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    Loading(String username){
        this.username= username;
        t= new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text= new JLabel("Travel And Tourism Appliction");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.MAGENTA);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);

        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);

        JLabel load= new JLabel("Loading,Please Wait....");
        load.setBounds(230,130,175,30);
        load.setForeground(Color.red);
        load.setFont(new Font("Raleway", Font.BOLD, 16));
        add(load);


        JLabel user= new JLabel("Welcome "+username);
        user.setBounds(20,310,400,40);
        user.setForeground(Color.RED);
        user.setFont(new Font("Raleway", Font.BOLD, 16));
        add(user);

        t.start();

        setVisible(true);
    }
    public static void  main(String[] args){
        new Loading("");
    }
}
