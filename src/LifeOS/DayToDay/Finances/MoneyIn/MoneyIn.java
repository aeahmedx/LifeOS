package LifeOS.DayToDay.Finances.MoneyIn;

public class MoneyIn {

    private double moneyin;
    private String source;

    public MoneyIn(double moneyin, String source) {
        this.moneyin = moneyin;
        this.source = source;
    }

    public MoneyIn(double moneyin) {
        this.moneyin = moneyin;
    }

    public double getMoneyin() {
        return moneyin;
    }

    public void setMoneyin(double moneyin) {
        this.moneyin = moneyin;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
