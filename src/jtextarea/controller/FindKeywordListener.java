package jtextarea.controller;

import jtextarea.view.FindKeywordView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindKeywordListener implements ActionListener {
    FindKeywordView fkv;

    public FindKeywordListener(FindKeywordView fkv) {
        this.fkv = fkv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String act = e.getActionCommand();
        if(act.equals("Statistic")){
            fkv.findKeyword();
        }
    }
}
