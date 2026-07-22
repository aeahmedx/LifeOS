package LifeOS.DayToDay.OpenLoops;

public class OpenLoop {

    private String openLoop;
    private String category;

    public OpenLoop(String openLoop, String category) {
        this.openLoop = openLoop;
        this.category = category;
    }

    public OpenLoop(String openLoop) {
        this.openLoop = openLoop;
    }

    public String getOpenLoop() {
        return openLoop;
    }

    public void setOpenLoop(String openLoop) {
        this.openLoop = openLoop;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
