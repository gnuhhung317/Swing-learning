package changecolor.controller;

import changecolor.view.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorController implements ActionListener {
    private MyColorView mcv;
    String type;

    public MyColorController(MyColorView mcv){
        this.mcv = mcv;
        this.type = "Foreground";
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String act = e.getActionCommand();
        if (act.equals("Foreground")){
            type = act;
        } else if (act.equals("Background")){
            type = act;
        }
        if (type.equals("Foreground")){
            if (act.equals("Black")){
                mcv.setForegroundColor(Color.BLACK);
            }if (act.equals("Blue")){
                mcv.setForegroundColor(Color.BLUE);
            }if (act.equals("Green")){
                mcv.setForegroundColor(Color.GREEN);
            }if (act.equals("Red")){
                mcv.setForegroundColor(Color.RED);
            }if (act.equals("Yellow")){
                mcv.setForegroundColor(Color.YELLOW);
            }if (act.equals("Pink")){
                mcv.setForegroundColor(Color.PINK);
            }
        }
        if (type.equals("Background")){
            if (act.equals("Black")){
                mcv.setBackgroundColor(Color.BLACK);

            }if (act.equals("Blue")){
                mcv.setBackgroundColor(Color.BLUE);
            }if (act.equals("Green")){
                mcv.setBackgroundColor(Color.GREEN);
            }if (act.equals("Red")){
                mcv.setBackgroundColor(Color.RED);
            }if (act.equals("Yellow")){
                mcv.setBackgroundColor(Color.YELLOW);
            }if (act.equals("Pink")){
                mcv.setBackgroundColor(Color.PINK);
            }
        }

    }
}
