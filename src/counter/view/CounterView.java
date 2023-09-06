package counter.view;

import counter.controller.CounterListener;
import counter.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    CounterModel cm;
    JButton up;
    JButton down;
    JButton reset;
    JLabel value;

    public CounterView(){
        cm = new CounterModel();
        this.setTitle("Counter");
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setSize(300,300);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);

        ActionListener al = new CounterListener(this);

        up = new JButton("UP");
        down = new JButton("DOWN");
        reset = new JButton("RESET");
        value = new JLabel(cm.getValue()+"",0);

        up.addActionListener(al);
        down.addActionListener(al);
        reset.addActionListener(al);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add(up,BorderLayout.EAST);
        jp.add(down, BorderLayout.WEST);
        jp.add(value,BorderLayout.CENTER);
        jp.add(reset,"South");

        this.add(jp);

    }
    public void increase(){
        cm.increase();
        value.setText(cm.getValue()+"");
    }
    public void decrease(){
        cm.decrease();
        value.setText(cm.getValue()+"");
    }
    public void reset(){
        cm.reset();
        value.setText(cm.getValue()+"");
    }

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new CounterView();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}