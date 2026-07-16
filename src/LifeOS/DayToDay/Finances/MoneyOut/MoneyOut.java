package LifeOS.DayToDay.Finances.MoneyOut;

public class MoneyOut {

    private double moneyout;
    private String source;

    public MoneyIn(double moneyout, String source) {
        this.moneyin = moneyout
        this.source = source;
    }

    public MoneyOut(double moneyout) {
        this.moneyout = moneyout
    }

    public MoneyOut(double moneyout, String source) {
        this.moneyout = moneyout
        this.source = source;
    }

    private double getMoneyout() {
        return moneyout;
    }

    public void setMoneyout(double moneyout) {
        this.moneyout = moneyout;
    }

}
