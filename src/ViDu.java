import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ViDu extends JFrame {
    public ViDu(){
        this.setTitle("learn java gui");
        this.setSize(600,400);

        // balance the frame
        this.setLocationRelativeTo(null);
        // set layout

        BorderLayout fl = new BorderLayout();
        this.setLayout(fl);

        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");

        this.add(jb1,BorderLayout.EAST);
        this.add(jb2,BorderLayout.CENTER);
        this.add(jb3,BorderLayout.NORTH);
        this.add(jb4,"West");
        this.add(jb5,BorderLayout.SOUTH);






        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ViDu vd = new ViDu();
    }
}
