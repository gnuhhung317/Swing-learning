package mouseevent.model;

public class MouseEventModel {
    private int x,y;
    private int count;
    private String checkIn;

    public MouseEventModel() {
        this.checkIn = "NO";
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void addClick(){
        count++;
    }
    public void enter(){
        setCheckIn("YES");
    }
    public void exit(){
        setCheckIn("NO");
    }
}
