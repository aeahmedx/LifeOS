package LifeOS.DayToDay.School;

import java.util.ArrayList;

public class School {

    private ArrayList<Note> schoolWork;

    public ArrayList<SchoolWork> getSchoolWork() {
        return schoolWork;
    }

    public void displayNoteTitles() {
        for (int i = 0; i < schoolWork.size(); i++) {
        
        System.out.println((i+1) + ". " + schoolWork.get(i).getTitlek());

        }
    }

    public void newNote() {
        Scanner input = new Scanner(System.in);
        StringBuilder note = new StringBuilder();

        System.out.println("Title: ");
        String title = input.nextLine();

        System.out.println("Notes: (To save on Mac (Crtl+D) or Windows (Ctrl+Z))"):
        while (input.hasNextLine()) {
            note.append(input.nextLine()).append("\n");
        }

        input.close();

        Note newnote = new Note(title, note);
    

        schoolWork.add(newnote);
    }

    public void deleteNote() {
        dsiplayNoteTitles();

        Scanner input = new Scanner(System,in);
        System.out.println("Select note to delete: ")
        int choice = input.nextInt();

        schoolWork.remove(choice - 1);

        input.close();
        
    }

    


}
