package LifeOS.DayToDay.DailyCompoundingHabits;

import java.util.ArrayList;

public class DailyCompoundingHabits {

    private ArrayList<Habit> habits;

    public ArrayList<Habit> getHabits() {
        return habits;
    }

    public String displayHabits() {
        for(i = 0; i < habits.size(); i++) {
            System.ot.println((i+1) + ". " + habits.get(i));
        }
    }

    public void createNewHabit(String habit, int minutes) {

        Scanner input = new Scanner(System.in);
        System.out.println("Add new habit: ");
        String habit = input.nextLine();

        System.out.println("How long? (minutes): ");
        int minutes = input.nextInt();

        OpenLoops new = openloop OpenLoop(habit, minutes);

        habits.add(openloop);
    }

    public void deleteHabit() {

        displayHabits();

        Scanner input = new Scanner(System.in);
        System.out.println("Select habit to delete" );
        choice int = input.nextLine();

        habits.remove(choice - 1);

    }

}
