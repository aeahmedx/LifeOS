package LifeOS.DayToDay.TodayTomorrow.Today;

import LifeOS.DayToDay.TodayTomorrow.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Today {

    private ArrayList<Task> todaytask;

    public Today() {
        todaytask = new ArrayList<>();
    }

    public ArrayList<Task> getTodaytask() {
        return todaytask;
    }

    public void displayTodayTasks() {
        for (int i = 0; i < todaytask.size(); i++) {
            System.out.println((i+1) + ". " + todaytask.get(i).getTask());
        }
        
    }

    public void createTodayTask() {

        Scanner input = new Scanner(System.in);

        System.out.println("Task Title: ");
        String title = input.nextLine();

        System.out.println("Priority Level: ");
        int prioritylvl = input.nextInt();

        Task task = new Task(title, prioritylvl);

        input.close();

        todaytask.add(task);
    }

    public void deleteTodayTask() {

        displayTodayTasks();
        Scanner input = new Scanner(System.in);

        System.out.println("Select a task to delete: ");
        int choice = input.nextInt();

        todaytask.remove(choice - 1);

        input.close();

    }

}
