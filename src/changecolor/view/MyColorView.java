package changecolor.view;

import changecolor.controller.MyColorController;
import changecolor.model.MyColorModel;

import javax.swing.*;
import java.awt.*;

public class MyColorView extends JFrame {
     MyColorModel mcm;
     JLabel text;
     JButton black;
     JButton blue;
     JButton green;
     JButton red;
     JButton yellow;
     JButton pink;

     JButton foreground;
     JButton background;


    public MyColorView(){
        mcm = new MyColorModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("My Color");
        this.setSize(400,250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        Font font = new Font("Arial",Font.BOLD,20);

        text = new JLabel("I LOVE YOU, BABE",JLabel.CENTER);
        text.setFont(font);
        text.setOpaque(mcm.isOpaque());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,3));

        black = new JButton("Black");
        black.setFont(font);
        black.setForeground(Color.BLACK);

        blue = new JButton("Blue");
        blue.setFont(font);
        blue.setForeground(Color.BLUE);

        green = new JButton("Green");
        green.setFont(font);
        green.setForeground(Color.GREEN);

        red = new JButton("Red");
        red.setFont(font);
        red.setForeground(Color.RED);

        yellow = new JButton("Yellow");
        yellow.setFont(font);
        yellow.setForeground(Color.YELLOW);

        pink = new JButton("Pink");
        pink.setFont(font);
        pink.setForeground(Color.PINK);

        jPanel.add(black);
        jPanel.add(blue);
        jPanel.add(green);
        jPanel.add(red);
        jPanel.add(yellow);
        jPanel.add(pink);

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1,2));

        foreground = new JButton("Foreground");
        foreground.setFont(font);
        background = new JButton("Background");
        background.setFont(font);

        jPanel1.add(foreground);
        jPanel1.add(background);

        this.setLayout(new BorderLayout());
        this.add(text,BorderLayout.CENTER);
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(2,1));
        jPanel2.add(jPanel,BorderLayout.SOUTH);
        jPanel2.add(jPanel1,BorderLayout.SOUTH);
        this.add(jPanel2,"South");

        MyColorController mcc = new MyColorController(this);
        black.addActionListener(mcc);
        blue.addActionListener(mcc);
        green.addActionListener(mcc);
        red.addActionListener(mcc);
        yellow.addActionListener(mcc);
        pink.addActionListener(mcc);
        foreground.addActionListener(mcc);
        background.addActionListener(mcc);


    }

    public void setForegroundColor(Color color){
        mcm.setForeground(color);
        text.setForeground(mcm.getForeground());
    }
    public void setBackgroundColor(Color color){
        mcm.setBackground(color);
        text.setBackground(mcm.getBackground());

    }


}
