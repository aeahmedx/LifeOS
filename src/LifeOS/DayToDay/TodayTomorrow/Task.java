package LifeOS.DayToDay.TodayTomorrow;

public class Task {

    private String task;
    private int priority;

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }

    public Task(String task, int priority) {
        this.task = task;
        this.priority = priority
    }

    public Task() {
        this.task = task;
    }

}
