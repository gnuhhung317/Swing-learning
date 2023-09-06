import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    public MyCalculator(){
        this.setTitle("My calculator");

        this.setSize(300,300);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        JTextField jTF = new JTextField();

        JPanel jp_head =new JPanel();
        jp_head.setLayout(new BorderLayout());
        jp_head.add(jTF,BorderLayout.CENTER);
        JPanel jp_bottom = new JPanel();
        jp_bottom.setLayout(new GridLayout(5,3));

        JButton jb0 = new JButton("0");
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8= new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jb_nhan = new JButton("*");
        JButton jb_chia = new JButton("/");
        JButton jb_cong = new JButton("+");
        JButton jb_tru = new JButton("-");
        JButton jb_bang = new JButton("=");

        jp_bottom.add(jb0);
        jp_bottom.add(jb1);
        jp_bottom.add(jb2);
        jp_bottom.add(jb3);
        jp_bottom.add(jb4);
        jp_bottom.add(jb5);
        jp_bottom.add(jb6);
        jp_bottom.add(jb7);
        jp_bottom.add(jb8);
        jp_bottom.add(jb9);
        jp_bottom.add(jb_cong);
        jp_bottom.add(jb_tru);
        jp_bottom.add(jb_nhan);
        jp_bottom.add(jb_chia);
        jp_bottom.add(jb_bang);

        this.setLayout(new BorderLayout());
        this.add(jp_head,BorderLayout.NORTH);
        this.add(jp_bottom,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyCalculator();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
