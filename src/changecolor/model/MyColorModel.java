package changecolor.model;

import java.awt.*;

public class MyColorModel {
    private Color foreground;
    private Color background;
    private boolean opaque;

    public MyColorModel() {
        this.background = Color.BLACK;
        this.background = Color.WHITE;
        this.opaque = true;
    }

    public Color getForeground() {
        return foreground;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }
}
