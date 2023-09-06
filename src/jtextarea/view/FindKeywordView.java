package jtextarea.view;

import jtextarea.controller.FindKeywordListener;
import jtextarea.model.FindKeywordModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FindKeywordView extends JFrame {
    FindKeywordModel fkm ;
    JTextArea jta_text;
    JTextField jtf_keyword;
    JButton jb_statistic;
    JLabel jl_output;

    public FindKeywordView(){
        fkm = new FindKeywordModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Dem so lan xuat hien");
        this.setSize(400,300);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        //Font for programe
        Font font = new Font("Arial",Font.BOLD,12);
        // Create input panel
        JPanel jPanelInput = new JPanel();
        jPanelInput.setLayout(new GridLayout(4,1,20,20));

        JLabel jl_text = new JLabel("Text");
        jl_text.setFont(font);
        JLabel jl_keyword = new JLabel("Keyword");
        jl_keyword.setFont(font);

        jta_text = new JTextArea();
        jta_text.setFont(font);
        jtf_keyword = new JTextField();
        jtf_keyword.setFont(font);

        jPanelInput.add(jl_text);
        jPanelInput.add(jta_text);
        jPanelInput.add(jl_keyword);
        jPanelInput.add(jtf_keyword);

        // Create output panel
        JPanel jPanelOutput = new JPanel();
        jPanelOutput.setLayout(new GridLayout(1,2,20,20));
        jb_statistic = new JButton("Statistic");
        jb_statistic.setFont(font);
        jb_statistic.setBackground(Color.BLACK);
        jb_statistic.setOpaque(true);
        jb_statistic.setForeground(Color.white);

        jl_output = new JLabel("None",SwingConstants.CENTER);
        jl_output.setFont(font);

        jPanelOutput.add(jb_statistic);
        jPanelOutput.add(jl_output);

        // add to panel to the main frame
        this.add(jPanelInput,BorderLayout.CENTER);
        this.add(jPanelOutput,"South");

        // add listener
        ActionListener al = new FindKeywordListener(this);
        jb_statistic.addActionListener(al);
    }
    public void findKeyword(){
        fkm.setKeyword(jtf_keyword.getText());
        fkm.setText(jta_text.getText());
        fkm.findKeyword();
        if (jtf_keyword.getText().isBlank()) fkm.setCount(0);
        if (fkm.getCount() < 2){
            jl_output.setText("Find "+fkm.getCount()+" word");
        }else{
            jl_output.setText("Find "+fkm.getCount()+" words");
        }

    }

}
