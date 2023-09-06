package font.controller;

import font.view.AppView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppController implements ActionListener {
    private AppView av;
    public AppController(AppView av){
        this.av = av;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        if (choice.equals("1")){
            av.setLabel("1");
        }
        if (choice.equals("2")){
            av.setLabel("2");
        }
        if (choice.equals("3")){
            av.setLabel("3");
        }
        if (choice.equals("4")){
            av.setLabel("4");
        }
    }
}
