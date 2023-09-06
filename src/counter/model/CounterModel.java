package counter.model;

public class CounterModel{
    private int value;
    public CounterModel(){
        value = 0;
    }

    public void increase(){
        value++;
    }
    public void decrease(){
        value--;
    }
    public void reset(){
        value = 0;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}