package mouseevent.controller;

import mouseevent.view.MouseEventView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventListener implements MouseListener , MouseMotionListener {
    private MouseEventView mev;

    public MouseEventListener(MouseEventView mev) {
        this.mev = mev;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mev.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mev.enter();

    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mev.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mev.updatePoint(x,y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mev.updatePoint(x,y);
    }
}
