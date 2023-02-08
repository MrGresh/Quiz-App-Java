import javax.swing.*;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener {
    JButton Start,Back;
    String name;
    rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+name+" Simple Minds");
        heading.setBounds(100,60,900,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30)); 
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel("Welcome "+name+" Simple Minds");
        rules.setBounds(20,90,900,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16)); 
        rules.setText(
            "<html>"+"<br><br>"+ 
            "1. All the Questions are Compulsory."+"<br><br>"+
            "2. You will have limited time to answer each question."+"<br><br>"+
            "3. Score will be display after completion of quiz."+"<br><br>"+
            "4. All the Best !"+"<br><br>"+
            "<html>"
        );
        add(rules);


        Back = new JButton("Back");
        Back.setBounds(250,500,100,30);
        Back.setBackground(new Color(30,144,254));
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);

        Start = new JButton("Start");
        Start.setBounds(400,500,100,30); 
        Start.setBackground(new Color(30,144,254));
        Start.setForeground(Color.white);
        Start.addActionListener(this);
        add(Start);
        
        


        setSize(800,600);
        setLocation(250,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Start){
            setVisible(false);
            new Quiz(name);
        }
        else {
            setVisible(false);
            new login();
        }
    }
    public static void main(String[] args) {
        new rules("User");
    }
}
