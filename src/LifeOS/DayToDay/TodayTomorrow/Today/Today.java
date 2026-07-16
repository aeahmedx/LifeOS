package LifeOS.DayToDay.TodayTomorrow.Today;

import LifeOS.DayToDay.TodayTomorrow.Task;

import java.util.ArrayList;

public class Today {

    private ArrayList<Task> todaytask;
    
    public Today() {
        
    }

    public ArrayList<Task> getTodaytask() {
        return todaytask;
    }

    public Today() {

    }

    public ArrayList<Task> displayTodayTasks() {
        for (int i = 0; i < todaytask.size(); i++) {
            System.out.println((i+1) + ". " + todaytask.get(1).getTask());
        }
        
    }

    public void createTodayTask() {

        Scanner new = input Scanner(System.in);

        System.out.println("Task Title: ");
        String title = nextLine.input();

        System.out.println("Priority Level: ");
        String prioritylvl = nextInt.input();

        TdTmTask new = task Task(title, prioritylvl);

        input.close();

        todaytask.add(task);
    }

    public void deleteTodayTask() {

        displayTodayTasks();
        Scanner input = new Scanner(System.in);

        System.out.println("Select a task to delete: ");
        int choice = nextInt.input();

        todaytask.remove(choice - 1);

        input.close();

    }

}
