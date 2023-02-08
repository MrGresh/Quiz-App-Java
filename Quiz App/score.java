import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class score  extends JFrame implements ActionListener{
    JButton PlayAgain,End;

    score(String name,int score){

        setBounds(350,100,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null); 

        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz3.jpeg"));
        // Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel image = new JLabel(i3);
        // image.setBounds(0,200,300,250);
        // add(image);

        JLabel x = new JLabel("Thank You "+name+" !!");
        x.setBounds(150,200,300,30);
        x.setFont(new Font("Tahoma",Font.PLAIN,24));
        x.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(x);

        JLabel YourScore = new JLabel("Your Score : "+score);
        YourScore.setBounds(150,300,300,30);
        YourScore.setFont(new Font("Tahoma",Font.PLAIN,24));
        YourScore.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(YourScore);


        PlayAgain = new JButton("Play Again");
        PlayAgain.setBounds(400,300,200,40);
        PlayAgain.setFont(new Font("Tahoma",Font.PLAIN,22));
        PlayAgain.setBackground(new Color(30,144,255));
        PlayAgain.setForeground(Color.white);
        PlayAgain.addActionListener(this);
        add(PlayAgain);

        End = new JButton("End Quiz");
        End.setBounds(400,400,200,40);
        End.setFont(new Font("Tahoma",Font.PLAIN,22));
        End.setBackground(new Color(30,144,255));
        End.setForeground(Color.white);
        End.addActionListener(this);
        add(End);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==PlayAgain){
            setVisible(false);
            new login();
        }
        else
        setVisible(false);
    }
    public static void main(String[] args) {
        new score("user",0);
    }
}
