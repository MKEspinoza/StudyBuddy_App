package com.github.studybuddy.rcos.studybuddy_app.Planner;

/**
 * Created by marina on 8/3/15.
 */
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment {
    private String 		course;
    private String 		title;


    private float		points;
    private Calendar 	due_date;

    private Map<Integer,Boolean>	sections;


    public Assignment(String c, String t, float p,Calendar dd){
        course = c;
        title = t;
        points = p;
        due_date = dd;
        sections = new HashMap<Integer,Boolean>();
    }

    public String getCourse(){
        return new String(course);
    }

    public String getTitle(){
        return new String(title);
    }

    public float getPoints(){
        return points;
    }

    public Calendar getDueDate(){
        return due_date;
    }

    public int fromCal_toHours(Calendar cal, int workday_hours){
        int days = cal.get(Calendar.DAY_OF_MONTH);
        int hours = cal.get(Calendar.HOUR_OF_DAY) + days*workday_hours;
        return hours;
    }


    public int getTimeleft(int workday_hours, Calendar current_date){
        int dd_hours = fromCal_toHours(due_date, workday_hours);
        int cu_hours = fromCal_toHours(current_date, workday_hours);

        return dd_hours-cu_hours;
    }

    public float getValue(){
        int dd_days = due_date.get(Calendar.DAY_OF_MONTH);
        return points/dd_days;
    }

    public void initialize_sections(int workday_hours){
        int dd_hours = fromCal_toHours(due_date, workday_hours);
        sections = new HashMap<Integer,Boolean>();

        for (int i = 0; i < dd_hours; ++i){
            sections.put(1, false);
        }
    }

    public Map<Integer,Boolean> getSections(){
        return sections;
    }

}
