package com.github.studybuddy.rcos.studybuddy_app;

import java.lang.reflect.Constructor;
import java.util.Vector;

/**
 * Created by cordom2 on 8/10/2015.
 */
public class ListData {
    final Vector<ClassData> classesList = new Vector<ClassData>();   //A list to hold the current classes(ClassData objects)
    Vector<String> totalAssignmentList = new Vector<String>();

    boolean isClassesListFull(){
        if(classesList.size() >= 8)
            return true;
        else
            return false;
    }

    boolean addClassToList(String className, int classCredits){
        for(int i=0; i<classesList.size(); i++)
        {
            if(className == classesList.get(i).getClassName())
            {
                return false;
            }
        }
        /*
        Class<?> c = Class.forName(ClassData);      Trying to dynamically name the new ClassData object
        Constructor<?> cons = c.getConstructor(String.class);
        Object object = cons.newInstance("MyAttributeValue");
        */
        ClassData x = new ClassData(className, classCredits);
        if(!isClassesListFull())
        {
            classesList.add(x);
            return true;
        }
        else
            return false;
    }
}
