package jtextfield.controller;

import jtextfield.view.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {
    MiniCalculatorView mcv;

    public MiniCalculatorListener(MiniCalculatorView mcv) {
        this.mcv = mcv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String act = e.getActionCommand();
        if (act.equals("+")){
            mcv.plus();
        }else if (act.equals("-")){
            mcv.minus();
        }else if (act.equals("*")){
            mcv.multiply();
        }else if (act.equals("/")){
            mcv.divide();
        }else if (act.equals("^")){
            mcv.pow();
        }else if (act.equals("MOD")){
            mcv.mod();
        }
    }
}
