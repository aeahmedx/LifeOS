package LifeOS.DayToDay.DailyCompoundingHabits;

import java.util.ArrayList;
import java.util.Scanner;

public class DailyCompoundingHabits {

    private ArrayList<Habit> habits;

    public DailyCompoundingHabits() {
        habits = new ArrayList<>();
    }

    public ArrayList<Habit> getHabits() {
        return habits;
    }

    public void displayHabits() {
        for (int i = 0; i < habits.size(); i++) {
            System.out.println((i + 1) + ". " + habits.get(i));
        }
    }

    public void createNewHabit() {

        Scanner input = new Scanner(System.in);
        System.out.println("Add new habit: ");
        String habit = input.nextLine();

        System.out.println("How long? (minutes): ");
        int minutes = input.nextInt();


        Habit newhabit = new Habit(habit, minutes);

        habits.add(newhabit);
    }

    public void deleteHabit() {

        displayHabits();

        Scanner input = new Scanner(System.in);
        System.out.println("Select habit to delete" );
        int choice = input.nextInt();

        habits.remove(choice - 1);

    }

}
