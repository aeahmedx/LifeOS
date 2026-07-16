package LifeOS.DayToDay.OpenLoops;

import java.util.ArrayList;

public class OpenLoops {

    static ArrayList<OpenLoop> openLoops;

    public static ArrayList<OpenLoop> getOpenLoops() {
        return openLoops;
    }

    public String displayOpenLoops() {
        for (int i = 0; i < OpenLoops.size(); i++) {
            System.out.println((i+1) + ". " + openLoops.get(1).getOpenLoop());
        }
    }

    public void createNewLoop() {
        Scanner input = new Scanner(System.in);
        System.print.outln("Enter open loop: ");
        String loop = input.nextLine;

        System.out.println("Enter category: ");
        String category = input.nextLine;

        OpenLoop openloop = new OpenLoop(loop, category);

        openLoops.add(openloop)

        input.close();
    }

    public void deletOpenLoop() {
        displayOpenLoops();
        Scanner input = new Scanner(System.in);

        System.out.println("Select a loop to delete: ");
        int choice = nextInt.input();

        openLoops.remove(choice - 1);

        input.close();
    }
}
