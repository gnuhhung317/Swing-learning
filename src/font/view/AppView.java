package font.view;

import font.controller.AppController;

import javax.swing.*;
import java.awt.*;

public class AppView extends JFrame {
    private JButton but1;
    private JButton but2;
    private JButton but4;
    private JButton but3;
    private JLabel label;
    public AppView(){
        this.setTitle("APP");
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setLayout(new GridLayout(2,1));
        this.setDefaultCloseOperation(3);
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        AppController ac = new AppController(this);
        JPanel jp_head = new JPanel();
        jp_head.setLayout(new GridLayout(2,2));
        JPanel jp_end = new JPanel();
        Font font = new Font("Arial",Font.BOLD,20);
        but1 = new JButton("1");
        but2 = new JButton("2");
        but3 = new JButton("3");
        but4 = new JButton("4");

        but1.setFont(font);
        but2.setFont(font);
        but3.setFont(font);
        but4.setFont(font);

        but1.addActionListener(ac);
        but2.addActionListener(ac);
        but3.addActionListener(ac);
        but4.addActionListener(ac);

        jp_head.add(but1);
        jp_head.add(but2);
        jp_head.add(but3);
        jp_head.add(but4);

        label = new JLabel("There's no button have been clicked!");
        label.setFont(font);
        this.add(jp_head);
        jp_end.add(label);
        this.add(jp_end);
    }

    public void setLabel(String number){
        label.setText("Last button pushed is no."+number);
    }

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new AppView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
