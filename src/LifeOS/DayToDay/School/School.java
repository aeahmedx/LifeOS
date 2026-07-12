package LifeOS.DayToDay.School;

public class School {

    static SchoolWork schoolWork;

    public static SchoolWork getSchoolWork() {
        return schoolWork;
    }

    public static void setSchoolWork(SchoolWork schoolWork) {
        School.schoolWork = schoolWork;
    }
}
