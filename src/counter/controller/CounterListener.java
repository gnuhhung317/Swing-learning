package counter.controller;

import counter.view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener{
    private CounterView cv;
    public CounterListener(CounterView cv){
        this.cv = cv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("UP")){
            cv.increase();
        }else if (button.equals("DOWN")){
            cv.decrease();
        }else if (button.equals("RESET")){
            cv.reset();
        }
    }
}