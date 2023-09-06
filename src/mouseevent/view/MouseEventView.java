package mouseevent.view;

import mouseevent.controller.MouseEventListener;
import mouseevent.model.MouseEventModel;

import javax.swing.*;
import java.awt.*;

public class MouseEventView extends JFrame {
    private MouseEventModel model;
    JLabel jl_x;
    JLabel jl_y;
    JLabel jl_count;
    JLabel jl_countValue;
    JLabel jl_checkIn;
    JLabel jl_checkInValue;
    public MouseEventView(){
        model = new MouseEventModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Mouse checker");
        this.setDefaultCloseOperation(3);
        this.setSize(500,300);
        this.setLocationRelativeTo(null);

        //Create a Jpanel to check the mouse
        JPanel jp_mouse = new JPanel();
        jp_mouse.setBackground(Color.GRAY);
        MouseEventListener mel = new MouseEventListener(this);
        jp_mouse.addMouseListener(mel);
        jp_mouse.addMouseMotionListener(mel);
        //Creat a Jpanel contains info

        JPanel jp_info = new JPanel();
        jp_info.setLayout(new GridLayout(3,3,10,10));

        JLabel jl_position = new JLabel("Position: ");
        jl_x = new JLabel("x = "+model.getX());
        jl_y = new JLabel("y = "+ model.getY());
        jl_count = new JLabel("Number of clicks: ");
        jl_countValue = new JLabel(model.getCount()+"");
        JLabel jl_empty = new JLabel();
        jl_checkIn = new JLabel("Mouse is in component: ");
        jl_checkInValue = new JLabel(model.getCheckIn());
        JLabel jl_empty1 = new JLabel();

        jp_info.add(jl_position);
        jp_info.add(jl_x);
        jp_info.add(jl_y);
        jp_info.add(jl_count);
        jp_info.add(jl_countValue);
        jp_info.add(jl_empty);
        jp_info.add(jl_checkIn);
        jp_info.add(jl_checkInValue);
        jp_info.add(jl_empty1);

        this.setLayout(new BorderLayout());
        this.add(jp_mouse,BorderLayout.CENTER);
        this.add(jp_info,BorderLayout.SOUTH);

    }
    public void click(){
        model.addClick();
        this.jl_countValue.setText(model.getCount()+"");
    }
    public void enter(){
        model.enter();
        this.jl_checkInValue.setText(model.getCheckIn());
    }
    public void exit(){
        model.exit();
        this.jl_checkInValue.setText(model.getCheckIn());
    }

    public void updatePoint(int x, int y) {
        model.setX(x);
        model.setY(y);
        jl_x.setText(x+"");
        jl_y.setText(y+"");
    }
}
