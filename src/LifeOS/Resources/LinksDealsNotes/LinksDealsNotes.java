package LifeOS.Resources.LinksDealsNotes;

import java.util.ArrayList;

public class LinksDealsNotes {

    static ArrayList<Link> links;
    static ArrayList<Deal> deals;
    static ArrayList<Note> notes;

    public static ArrayList<Link> getLinks() {
        return links;
    }

    public static void setLinks(ArrayList<Link> links) {
        LinksDealsNotes.links = links;
    }

    public static ArrayList<Deal> getDeals() {
        return deals;
    }

    public static void setDeals(ArrayList<Deal> deals) {
        LinksDealsNotes.deals = deals;
    }

    public static ArrayList<Note> getNotes() {
        return notes;
    }

    public static void setNotes(ArrayList<Note> notes) {
        LinksDealsNotes.notes = notes;
    }
}
