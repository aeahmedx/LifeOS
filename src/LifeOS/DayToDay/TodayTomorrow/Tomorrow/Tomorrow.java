package LifeOS.DayToDay.TodayTomorrow.Tomorrow;

import LifeOS.DayToDay.TodayTomorrow.Task;

import java.util.ArrayList;

public class Tomorrow {

    private ArrayList<Task> tomorrowtask;

    public ArrayList<Task> getTomorrowtask() {
        return tomorrowtask;
    }

    public void Tomorrow() {

    }

    public ArrayList<Task> displayTomorrowTasks() {
        for (int i = 0; i < tomorrowtask.size(); i++) {
            System.out.println((i+1) + ". " + tomorrowtask.get(i).getTask());
        }
        
    }

    public void createTomorrowTask() {

        Scanner input = new Scanner();

        System.out.println("Task Title: ")
        String title = nextLine.Scanner(System.in);

        System.out.println("Priority Level: ");
        int prioritylvl = nextInt.input();

        Task new = task Task(title, prioritylvl);

        tomorrowtask.add(task);

        input.close();

    }

    public void deleteTomorrowTask() {
        displayTomorrowTasks();

        Scanner input = new Scanner(System.in);

        System.out.println("Select a task to delete: ");
        int choice = nextInt.input();

        tomorrowtask.remove(choice-1);

        input.close();

    }

}
