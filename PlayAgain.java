import java.awt.*;
import javax.swing.*;

public class PlayAgain extends JFrame{
    
    public PlayAgain(){
    
         super("PUZZLE GAME");
            this.setSize(600,650);
            Dimension dim  = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setBackground(Color.PINK);
            panel.setLayout(null);
            
            JLabel play = new JLabel("Do you want to play again ?");
            play.setBounds(40, 60, 450, 50);
            play.setForeground(Color.BLUE);
            play.setFont(new Font("Verdana", Font.PLAIN, 30));
            panel.add(play);
            
            JButton playAgain = new JButton("Yes");
            playAgain.setBounds(120,240,130, 30);
            playAgain.addActionListener(e->again());
            playAgain.setBackground(Color.GREEN);
            playAgain.setFont(new Font("Cambria", Font.BOLD, 20));
            playAgain.setBorderPainted(false);
            playAgain.setFocusable(false);
            panel.add(playAgain);
            
            JButton exit = new JButton("No");
            exit.setBounds(275,240, 130, 30); 
            exit.addActionListener(e->exitApp());
            exit.setBackground(Color.RED);
            exit.setFont(new Font("Cambria", Font.BOLD, 20));
            exit.setBorderPainted(false);
            exit.setFocusable(false);
            panel.add(exit);
            
        this.add(panel);
    }

    private void again() {
    
        PuzzleMatching puzzleMatching = new PuzzleMatching();
        puzzleMatching.setVisible(true);
        this.setVisible(false);
    }

    private void exitApp() {
    
         System.exit(0);
    }
}
