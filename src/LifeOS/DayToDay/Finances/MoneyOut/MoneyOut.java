package LifeOS.DayToDay.Finances.MoneyOut;

public class MoneyOut {

    private double moneyout;
    private String source;

    public MoneyOut(double moneyout) {
        this.moneyout = moneyout;
    }

    public MoneyOut(double moneyout, String source) {
        this.moneyout = moneyout;
        this.source = source;
    }

    public double getMoneyOut() {
        return moneyout;
    }

    public void setMoneyOut(double moneyout) {
        this.moneyout = moneyout;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
