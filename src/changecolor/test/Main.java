package changecolor.test;

import changecolor.view.MyColorView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MyColorView mcv = new MyColorView();
        }catch (Exception e){
            e.printStackTrace();
        }
}


}
