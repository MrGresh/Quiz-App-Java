import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupButtons;
    JButton Lifeline,next,Sumbit;
    public static int timer = 15;
    public static int answer_given = 0; 
    public static int count = 0;
    public static int Score = 0;

    String username;
    Quiz(String username){
        this.username = username;

        setBounds(80,0,1200,700);
        getContentPane().setBackground(Color.white);
        setLayout(null); 

        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz2.png"));
        // JLabel image = new JLabel(i1);
        // image.setBounds(0,0,600,350);
        // add(image);

        qno = new JLabel();
        qno.setBounds(100,350,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);

        question = new JLabel();
        question.setBounds(150,350,800,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(question);

         questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        opt1 = new JRadioButton();
        opt1.setBounds(160,400,300,30);
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(160,440,300,30);
        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(160,480,300,30);
        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(160,520,300,30);
        opt4.setBackground(Color.white);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);

        groupButtons = new ButtonGroup();
        groupButtons.add(opt1);
        groupButtons.add(opt2);
        groupButtons.add(opt3);
        groupButtons.add(opt4);

        Lifeline = new JButton("Lifeline : 50-50");
        Lifeline.setBounds(900,400,200,40);
        Lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
        Lifeline.setBackground(new Color(30,144,255));
        Lifeline.setForeground(Color.white);
        Lifeline.addActionListener(this);
        add(Lifeline);

        next = new JButton("Next");
        next.setBounds(900,500,200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        

        Sumbit = new JButton("Sumbit");
        Sumbit.setBounds(900,600,200,40);
        Sumbit.setFont(new Font("Tahoma",Font.PLAIN,22));
        Sumbit.setBackground(new Color(30,144,255));
        Sumbit.setForeground(Color.white);
        Sumbit.setEnabled(false);
        Sumbit.addActionListener(this);
        add(Sumbit);

        start(count);

        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            answer_given=1;
            if(groupButtons.getSelection()==null)
            {
                useranswers[count][0]="";
            }
            else{
                useranswers[count][0] = groupButtons.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                Sumbit.setEnabled(true);
            }
            count++;
            start(count);
        }
        else if(ae.getSource()==Lifeline){
            if(count==2||count==4||count==6||count==8||count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            Lifeline.setEnabled(false);
        }
        else if(ae.getSource()==Sumbit){
            answer_given=1;
            if(groupButtons.getSelection()==null)
            {
                useranswers[count][0]="";
            }
            else{
                useranswers[count][0] = groupButtons.getSelection().getActionCommand();
            }

            for(int i=0;i<useranswers.length;i++)
            if(useranswers[i][0].equals(answers[i][1]))
            Score+=10;

            setVisible(false);
            new score(username,Score);
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left : "+timer+" Seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        if(timer>0){
            g.drawString(time,850,350);
        }
        else
        g.drawString("Times Up!!!",850,350);
    
        timer--;

        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace(); 
        }
        if(answer_given==1){
        answer_given=0;
        timer = 15;
        }
        else if(timer<0){
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count==8){
                next.setEnabled(false);
                Sumbit.setEnabled(true);
            }
            if(count==9){  // Sumbit Button Case
                if(groupButtons.getSelection()==null)
            {
                useranswers[count][0]="";
            }
            else{
                useranswers[count][0] = groupButtons.getSelection().getActionCommand();
            }

            for(int i=0;i<useranswers.length;i++)
            if(useranswers[i][0].equals(answers[i][1]))
            Score+=10;

            setVisible(false);
            new score(username,Score);
            }
            else{ // next Button Case
            if(groupButtons.getSelection()==null)
            {
                useranswers[count][0]="";
            }
            else{
                useranswers[count][0] = groupButtons.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }
        }
    }

    public void start(int count){
        qno.setText(""+(count+1)+".]");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupButtons.clearSelection();
    }
    public static void main(String[] args) {
        new Quiz("user");
    }
}
