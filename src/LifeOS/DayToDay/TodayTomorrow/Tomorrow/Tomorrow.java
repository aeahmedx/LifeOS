package LifeOS.DayToDay.TodayTomorrow.Tomorrow;

import LifeOS.DayToDay.TodayTomorrow.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Tomorrow {

    private ArrayList<Task> tomorrowtask;

    public Tomorrow() {
        tomorrowtask = new ArrayList<>();
    }

    public ArrayList<Task> getTomorrowtask() {
        return tomorrowtask;
    }


    public void displayTomorrowTasks() {
        for (int i = 0; i < tomorrowtask.size(); i++) {
            System.out.println((i + 1) + ". " + tomorrowtask.get(i).getTask());
        }
    }

    public void createTomorrowTask() {

        Scanner input = new Scanner(System.in);

        System.out.println("Task Title: ");
        String title = input.nextLine();

        System.out.println("Priority Level: ");
        int prioritylvl = input.nextInt();

        Task task = new Task(title, prioritylvl);

        tomorrowtask.add(task);

        input.close();

    }

    public void deleteTomorrowTask() {
        displayTomorrowTasks();

        Scanner input = new Scanner(System.in);

        System.out.println("Select a task to delete: ");
        int choice = input.nextInt();

        tomorrowtask.remove(choice-1);

        input.close();

    }

}
