import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class PuzzleMatching extends JFrame implements ActionListener{
    
        private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
        private JPanel panel;
        private JLabel score;
        int num1 = 0,num2 = 0,result = 0, count =5;
        
        public PuzzleMatching()
		{
            super("PUZZLE MATCHING");
            this.setSize(600,600);
            Dimension dim  = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel = new JPanel();
            panel.setBackground(Color.PINK);
            panel.setLayout(null);

            Random random1 = new Random();
            Random random2 = new Random();

            button1 = new JButton();
            button1.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button1.setBackground(Color.CYAN);
            button1.setFont(new Font("Cambria", Font.BOLD, 20));
            button1.setFocusable(false);
            button1.addActionListener(this);
            button1.setForeground(Color.WHITE);
            panel.add(button1);

            button2 = new JButton();
            button2.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button2.setBackground(Color.CYAN);
            button2.setFont(new Font("Verdana", Font.BOLD, 18));
            button2.setFocusable(false);
            button2.addActionListener(this);
            button2.setForeground(Color.white);
            panel.add(button2);

            button3 = new JButton();
            button3.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button3.setBackground(Color.CYAN);
            button3.setFont(new Font("Cambria", Font.BOLD, 20));
            button3.setFocusable(false);
            button3.addActionListener(this);
            button3.setForeground(Color.white);
            panel.add(button3);

            button4 = new JButton();
            button4.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button4.setBackground(Color.CYAN);
            button4.setFont(new Font("Cambria", Font.BOLD, 20));
            button4.setFocusable(false);
            button4.addActionListener(this);
            button4.setForeground(Color.white);
            panel.add(button4);

            button5 = new JButton();
            button5.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button5.setBackground(Color.CYAN);
            button5.setFont(new Font("Cambria", Font.BOLD, 20));
            button5.setFocusable(false);
            button5.addActionListener(this);
            button5.setForeground(Color.white);
            panel.add(button5);

            button6 = new JButton();
            button6.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button6.setBackground(Color.red);
            button6.setFont(new Font("Cambria", Font.BOLD, 20));
            button6.setBorderPainted(false);
            button6.setFocusable(false);
            button6.addActionListener(this);
            button6.setForeground(Color.white);
            panel.add(button6);

            button7 = new JButton();
            button7.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button7.setBackground(Color.red);
            button7.setFont(new Font("Cambria", Font.BOLD, 30));
            button7.setBorderPainted(false);
            button7.setFocusable(false);
            button7.addActionListener(this);
            button7.setForeground(Color.white);
            panel.add(button7);

            button8 = new JButton();
            button8.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button8.setBackground(Color.red);
            button8.setFont(new Font("Cambria", Font.BOLD, 20));
            button8.setBorderPainted(false);
            button8.setFocusable(false);
            button8.addActionListener(this);
            button8.setForeground(Color.white);
            panel.add(button8);

            button9 = new JButton();
            button9.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button9.setBackground(Color.red);
            button9.setFont(new Font("Cambria", Font.BOLD, 20));
            button9.setBorderPainted(false);
            button9.setFocusable(false);
            button9.addActionListener(this);
            button9.setForeground(Color.white);
            panel.add(button9);

            button10 = new JButton();
            button10.setBounds(random1.nextInt(550),random2.nextInt(450), 50, 50);
            button10.setBackground(Color.red);
            button10.setFont(new Font("Cambria", Font.BOLD, 20));
            button10.setBorderPainted(false);
            button10.setFocusable(false);
            button10.addActionListener(this);
            button10.setForeground(Color.white);
            panel.add(button10);

            score = new JLabel("Score : 0");
            score.setBounds(10, 5, 100, 30);
            score.setFont(new Font("Cambria", Font.BOLD, 20));
            score.setForeground(Color.BLUE);;
            panel.add(score);

	        JButton exit = new JButton("Exit");
	        exit.setBounds(250, 510, 90, 40);
	        exit.setBackground(Color.BLUE);
			exit.setForeground(Color.WHITE);
	        exit.setFont(new Font("Cambria", Font.BOLD, 20));
	        exit.addActionListener(e->close());
	        exit.setBorderPainted(false);
	        exit.setFocusable(false);
	        panel.add(exit);

	        this.add(panel);
 }

    public void actionPerformed(ActionEvent ae) 
	{
        if(ae.getSource()==button1)
		{
            button1.setText("1");
            num1 = 1;
        }
        else if(ae.getSource()==button6)
		{
			button6.setText("1");
            num2 = 1;
            if(num1 == num2)
			{
                result+=5;
                score.setText("Score :"+result);
                button1.setVisible(false);
                button6.setVisible(false);
                count--;
            }
            else
			{
				result--;
                score.setText("Score :"+result);
            }
        }
        else
		{
            button1.setText("");
            button6.setText("");
        }
        if(ae.getSource()==button2)
		{
            button2.setText("2");
            num1 = 2;
        }
        else if(ae.getSource()==button7)
		{
			button7.setText("2");
            num2 = 2;
            if(num1 == num2)
			{
                result+=5;
                score.setText("Score :"+result);
                button2.setVisible(false);
                button7.setVisible(false);
                count--;
            }
            else
			{
				result--;
                score.setText("Score :"+result);
            }
        }
        else
		{
            button2.setText("");
            button7.setText("");
        }
        if(ae.getSource()==button3)
		{
            button3.setText("3");
            num1 = 3;
        }
        else if(ae.getSource()==button8)
		{
			button8.setText("3");
            num2 = 3;
            if(num1 == num2)
			{
                result+=5;
                score.setText("Score :"+result);
                button3.setVisible(false);
                button8.setVisible(false);
                count--;
            }
            else
			{
				result--;
                score.setText("Score :"+result);
            }
        }
        else
		{
            button3.setText("");
            button8.setText("");
        }
        if(ae.getSource()==button4)
		{
            button4.setText("4");
            num1 = 4;
        }
        else if(ae.getSource()==button9)
		{
			button9.setText("4");
            num2 = 4;
            if(num1 == num2)
			{
                result+=5;
                score.setText("Score :"+result);
                button4.setVisible(false);
                button9.setVisible(false);
                count--;
            }
            else{
				result--;
                score.setText("Score :"+result);
            }
        }
        else{
              button4.setText("");
              button9.setText("");
            }
        if(ae.getSource()==button5)
		{
            button5.setText("5");
            num1 = 5;
        }
        else if(ae.getSource()==button10)
		{
			button10.setText("5");
            num2 = 5;
            if(num1 == num2){
                result+=5;
                score.setText("Score :"+result);
                button5.setVisible(false);
                button10.setVisible(false);
                count--;
            }
           else {
				result--;
                score.setText("Score :"+result);
                }
        }
        else{
            button5.setText("");
            button10.setText("");
            }

        if(count == 0) 
		{
             JOptionPane.showMessageDialog(this,score.getText()); 
             PlayAgain playAgain = new PlayAgain();
             playAgain.setVisible(true);
             this.setVisible(false);
        }
    }
    
    public  void close()
	{
             System.exit(0);
    }
	
}
