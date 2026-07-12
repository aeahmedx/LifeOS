package LifeOS.DayToDay.School;

import java.util.ArrayList;

public class SchoolWork {

    static ArrayList<SchoolWork> schoolWork;

    public static ArrayList<SchoolWork> getSchoolWork() {
        return schoolWork;
    }

    public static void setSchoolWork(ArrayList<SchoolWork> schoolWork) {
        SchoolWork.schoolWork = schoolWork;
    }
}
