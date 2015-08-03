package com.github.studybuddy.rcos.studybuddy_app.Planner;

/**
 * Created by marina on 8/3/15.
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Assignment_Pad {
    private LinkedList<Assignment> list_of_assignments;
    private Set<String> set_of_courses;
    private int workday_hours;


    public Assignment_Pad(){
        list_of_assignments = new LinkedList<Assignment>();
        set_of_courses = new HashSet<String>();
        workday_hours = 0;
    }


    public void add_Course(String c){
        set_of_courses.add(c);
    }

    public void set_hours(int h){
        workday_hours = h;
    }

    public ArrayList<String> get_Courses(){
        Iterator<String> iter = set_of_courses.iterator();
        ArrayList<String> res = new ArrayList<String>(set_of_courses.size());
        while (iter.hasNext()){
            String course = (String) iter.next();
            res.add(course);
        }
        return res;
    }

    public void add_Assignment(String c, String t, float p,Calendar dd){
        Assignment a = new Assignment(c, t, p, dd);
        list_of_assignments.add(a);
    }

    public void set_Courses(Set cs){
        set_of_courses = new HashSet<String>(cs);
    }

    public LinkedList<Assignment> getAssignments(){
        return new LinkedList<Assignment>(list_of_assignments);
    }

    public int get_allSections(){
        int num = 0;
        Map<Integer,Boolean> sections_;
        for (int i = 0; i < list_of_assignments.size(); ++i){
            sections_ = list_of_assignments.get(i).getSections();
            Iterator it = sections_.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if (!((boolean) pair.getValue())) num=num+1;
            }
        }
        return num;

    }



}
