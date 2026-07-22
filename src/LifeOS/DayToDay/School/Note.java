package LifeOS.DayToDay.School;

public class Note {

    private String title;
    private StringBuilder note;

    public Note(String title, StringBuilder note) {
        this.title = title;
        this.note = note;
    }

    public Note() {}

    public Note(String title) {
        this.title = title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNote(StringBuilder note) {
        this.note = note;
    }

    public StringBuilder getNote() {
        return note;
    }

}
