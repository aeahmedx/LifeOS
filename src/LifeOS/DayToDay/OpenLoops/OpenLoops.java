package LifeOS.DayToDay.OpenLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class OpenLoops {

    public ArrayList<OpenLoop> openLoops;

    public OpenLoops() {
        openLoops = new ArrayList<>();
    }

    public ArrayList<OpenLoop> getOpenLoops() {
        return openLoops;
    }

    public void displayOpenLoops() {
        for (int i = 0; i < openLoops.size(); i++) {
            System.out.println((i+1) + ". " + openLoops.get(i).getOpenLoop());
        }
    }

    public void createNewLoop() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter open loop: ");
        String loop = input.nextLine();

        System.out.println("Enter category: ");
        String category = input.nextLine();

        OpenLoop openloop = new OpenLoop(loop, category);

        openLoops.add(openloop);

        input.close();
    }

    public void deleteOpenLoop() {
        displayOpenLoops();
        Scanner input = new Scanner(System.in);

        System.out.println("Select a loop to delete: ");
        int choice = input.nextInt();

        openLoops.remove(choice - 1);

        input.close();
    }
}
