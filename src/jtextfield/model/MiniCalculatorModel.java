package jtextfield.model;

public class MiniCalculatorModel {
    private  double firstValue;
    private  double secondValue;
    private double answer;

    public MiniCalculatorModel() {

    }
    public void plus(){
        this.answer = firstValue + secondValue;
    }
    public void minus(){
        this.answer = firstValue - secondValue;
    }
    public void multiply(){
        this.answer = firstValue * secondValue;
    }
    public void divide(){
        this.answer = firstValue / secondValue;
    }
    public void pow(){
        this.answer = Math.pow(firstValue , secondValue);
    }
    public void mod(){
        this.answer = firstValue % secondValue;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
}
