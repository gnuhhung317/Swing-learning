package jtextfield.view;

import jtextfield.controller.MiniCalculatorListener;
import jtextfield.model.MiniCalculatorModel;

import javax.swing.*;
import java.awt.*;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel mcm;
    JTextField jtf_firstValue;
    JTextField jtf_secondValue;
    JTextField jtf_answer;

    public MiniCalculatorView(){
        mcm = new MiniCalculatorModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("May tinh cui bap");
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setSize(400,200);

        Font font = new Font("Arial",Font.BOLD,15);
        //create the head panel for input and output
        JLabel jl_firstValue = new JLabel("First Value");
        JLabel jl_secondValue = new JLabel("Second Value");
        JLabel jl_answer = new JLabel("Answer");
        jl_firstValue.setFont(font);
        jl_answer.setFont(font);
        jl_secondValue.setFont(font);

        jtf_firstValue = new JTextField(50);
        jtf_secondValue = new JTextField(50);
        jtf_answer = new JTextField(50);
        jtf_firstValue.setFont(font);
        jtf_secondValue.setFont(font);
        jtf_answer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3,2,20,20));
        jPanelIO.add(jl_firstValue);
        jPanelIO.add(jtf_firstValue);
        jPanelIO.add(jl_secondValue);
        jPanelIO.add(jtf_secondValue);
        jPanelIO.add(jl_answer);
        jPanelIO.add(jtf_answer);

        // add button panel for calculate
        MiniCalculatorListener mcl = new MiniCalculatorListener(this);
        JButton jb_plus = new JButton("+");
        jb_plus.setFont(font);
        jb_plus.addActionListener(mcl);
        JButton jb_minus = new JButton("-");
        jb_minus.setFont(font);
        jb_minus.addActionListener(mcl);
        JButton jb_multiply = new JButton("*");
        jb_multiply.setFont(font);
        jb_multiply.addActionListener(mcl);
        JButton jb_divide = new JButton("/");
        jb_divide.setFont(font);
        jb_divide.addActionListener(mcl);
        JButton jb_pow = new JButton("^");
        jb_pow.setFont(font);
        jb_pow.addActionListener(mcl);
        JButton jb_mod = new JButton("MOD");
        jb_mod.setFont(font);
        jb_mod.addActionListener(mcl);

        JPanel jp_button = new JPanel();
        jp_button.setLayout(new FlowLayout());
        jp_button.add(jb_plus);
        jp_button.add(jb_minus);
        jp_button.add(jb_multiply);
        jp_button.add(jb_divide);
        jp_button.add(jb_pow);
        jp_button.add(jb_mod);

        this.setLayout(new BorderLayout());
        this.add(jPanelIO,BorderLayout.CENTER);
        this.add(jp_button,BorderLayout.SOUTH);


    }
    public void getText(){
        mcm.setFirstValue(Double.parseDouble(jtf_firstValue.getText()));
        mcm.setSecondValue(Double.parseDouble(jtf_secondValue.getText()));
    }
    public void plus(){
        this.getText();
        mcm.plus();
        this.jtf_answer.setText(mcm.getAnswer()+"");
    }
    public void minus(){
        this.getText();
        mcm.minus();
        this.jtf_answer.setText(mcm.getAnswer()+"");
    }
    public void multiply(){
        this.getText();
        mcm.multiply();
        this.jtf_answer.setText(mcm.getAnswer()+"");
    }
    public void divide(){
        this.getText();
        mcm.divide();
        this.jtf_answer.setText(mcm.getAnswer()+"");
    }
    public void pow(){
        this.getText();
        mcm.pow();
        this.jtf_answer.setText(mcm.getAnswer()+"");
    }
    public void mod(){
        this.getText();
        mcm.mod();
        this.jtf_answer.setText(mcm.getAnswer()+"");
    }
}
