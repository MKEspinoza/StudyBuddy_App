package com.github.studybuddy.rcos.studybuddy_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Vector;

/**
 * Created by glissj on 7/24/2015.
 */
public class grade_Fragment extends Fragment {
    View rootview;

    TextView textRow2Col1, textRow2Col2, textRow2Col3, textRow2Col4, textRow2Col5, textRow2Col6, textRow2Col7,
            textRow3Col1, textRow3Col2, textRow3Col3, textRow3Col4, textRow3Col5, textRow3Col6, textRow3Col7,
            textRow4Col1, textRow4Col2, textRow4Col3, textRow4Col4, textRow4Col5, textRow4Col6, textRow4Col7,
            textRow13Col1, textRow13Col2, textRow13Col3, textRow13Col4, textRow13Col5, textRow13Col6, textRow13Col7;

    public int getTotalCredits(Vector<ClassData> classesList) {
        int totalCredits=0;
        for(int i=0; i<classesList.size(); i++){
            totalCredits+= classesList.get(i).getCredits();
        }
        return totalCredits;
    }
    public String getTotalPercentIn(Vector<ClassData> classesList){
        DecimalFormat df = new DecimalFormat("00.00");
        double tempPercent=0;
        for(int i=0; i<classesList.size(); i++){
            if(classesList.get(i).getClassName() != ""){
                tempPercent+= (classesList.get(i).getCredits() * classesList.get(i).getPercentIn());
            }
        }
        double finalPercent= tempPercent/getTotalCredits(classesList);
        return df.format(finalPercent) + "%";
    }
    public String getTotalGrade(Vector<ClassData> classesList){
        DecimalFormat df = new DecimalFormat("00.00");
        double tempGrade= 0;
        for(int i=0; i<classesList.size(); i++){
            if(classesList.get(i).getClassName() != ""){
                tempGrade+= (classesList.get(i).getCredits() * classesList.get(i).getGrade());
            }
        }
        double finalGrade= tempGrade/getTotalCredits(classesList);
        return df.format(finalGrade) + "%";
    }
    public String getTotalGPA(Vector<ClassData> classesList){
        DecimalFormat df = new DecimalFormat("0.00");
        double tempGPA= 0;
        for(int i=0; i<classesList.size(); i++){
            if(classesList.get(i).getLetterGPA() == "A")
                tempGPA+= (classesList.get(i).getCredits() * 4.00);
            else if(classesList.get(i).getLetterGPA() == "A-")
                tempGPA+= (classesList.get(i).getCredits() * 3.666667);
            else if(classesList.get(i).getLetterGPA() == "B+")
                tempGPA+= (classesList.get(i).getCredits() * 3.333333);
            else if(classesList.get(i).getLetterGPA() == "B")
                tempGPA+= (classesList.get(i).getCredits() * 3.00);
            else if(classesList.get(i).getLetterGPA() == "B-")
                tempGPA+= (classesList.get(i).getCredits() * 2.666667);
            else if(classesList.get(i).getLetterGPA() == "C+")
                tempGPA+= (classesList.get(i).getCredits() * 2.333333);
            else if(classesList.get(i).getLetterGPA() == "C")
                tempGPA+= (classesList.get(i).getCredits() * 2.00);
            else if(classesList.get(i).getLetterGPA() == "C-")
                tempGPA+= (classesList.get(i).getCredits() * 1.666667);
            else if(classesList.get(i).getLetterGPA() == "D+")
                tempGPA+= (classesList.get(i).getCredits() * 1.333333);
            else if(classesList.get(i).getLetterGPA() == "D")
                tempGPA+= (classesList.get(i).getCredits() * 1.00);
            else if(classesList.get(i).getLetterGPA() == "F")
                tempGPA+= (classesList.get(i).getCredits() * 0.00);
        }
        double finalGPA= tempGPA/getTotalCredits(classesList);
        return df.format(finalGPA);
    }
    public String minTotalGrade(Vector<ClassData> classesList){
        DecimalFormat df = new DecimalFormat("00.00");
        double tempScore=0;
        for(int i=0; i<classesList.size(); i++){
            tempScore+= (classesList.get(i).getMaxPossible() * classesList.get(i).getCredits());
        }
        double finalGrade= tempScore/getTotalCredits(classesList);
        return df.format(finalGrade);
    }
    public String maxTotalGrade(Vector<ClassData> classesList){
        DecimalFormat df = new DecimalFormat("00.00");
        double tempScore=0;
        for(int i=0; i<classesList.size(); i++){
            tempScore+= (classesList.get(i).getMinPossible() * classesList.get(i).getCredits());
        }
        double finalGrade= tempScore/getTotalCredits(classesList);
        return df.format(finalGrade);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.grade_layout, container, false);

        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        DecimalFormat df = new DecimalFormat("00.00");


        //Connecting the 4 buttons to their respective pages
        Button AddAssignmentButton = (Button) rootview.findViewById(R.id.add_assignment_button);
        AddAssignmentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AddAssignment.class));
            }
        });
        Button EditAssignmentsButton = (Button) rootview.findViewById(R.id.edit_assignments_button);
        EditAssignmentsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), EditAssignments.class));
            }
        });
        Button AddClassButton = (Button) rootview.findViewById(R.id.add_class_button);
        AddClassButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AddClass.class));
            }
        });
        Button EditClassesButton = (Button) rootview.findViewById(R.id.edit_class_button);
        EditClassesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), EditClasses.class));
            }
        });


        ClassData[] classesArray = new ClassData[8];
        final Vector<ClassData> classesList = new Vector<ClassData>();   //A list to hold the current classes(ClassData objects)

        ClassData CS2 = new ClassData("CS2", 4);
        classesList.addElement(CS2);
        CS2.addAnAssignment("exam1", 30, 85.5);
        CS2.addAnAssignment("exam2", 13, 92);
        textRow2Col1 = (TextView) rootview.findViewById(R.id.textRow2Col1);
        textRow2Col1.setText(CS2.getClassName());
        textRow2Col2 = (TextView) rootview.findViewById(R.id.textRow2Col2);
        textRow2Col2.setText(Integer.toString(CS2.getCredits()));
        textRow2Col3 = (TextView) rootview.findViewById(R.id.textRow2Col3);
        textRow2Col3.setText(CS2.getPercentInSTR());
        textRow2Col4 = (TextView) rootview.findViewById(R.id.textRow2Col4);
        textRow2Col4.setText(CS2.getGradeSTR());
        textRow2Col5 = (TextView) rootview.findViewById(R.id.textRow2Col5);
        textRow2Col5.setText(CS2.getLetterGPA());
        textRow2Col6 = (TextView) rootview.findViewById(R.id.textRow2Col6);
        textRow2Col6.setText(CS2.getMaxPossibleSTR());
        textRow2Col7 = (TextView) rootview.findViewById(R.id.textRow2Col7);
        textRow2Col7.setText(CS2.getMinPossibleSTR());

        ClassData FOCS = new ClassData("FOCS",4);
        classesList.addElement(FOCS);
        FOCS.addAnAssignment("assignment1", 27, 90);
        FOCS.addAnAssignment("assignment2", 14, 96.5);
        FOCS.addAnAssignment("assignment3", 9, 80);
        FOCS.addAnAssignment("assignment4", 20, 92);
        FOCS.addAnAssignment("assignment5", 22, 89);
        textRow3Col1 = (TextView) rootview.findViewById(R.id.textRow3Col1);
        textRow3Col1.setText(FOCS.getClassName());
        textRow3Col2 = (TextView) rootview.findViewById(R.id.textRow3Col2);
        textRow3Col2.setText(Integer.toString(FOCS.getCredits()));
        textRow3Col3 = (TextView) rootview.findViewById(R.id.textRow3Col3);
        textRow3Col3.setText(FOCS.getPercentInSTR());
        textRow3Col4 = (TextView) rootview.findViewById(R.id.textRow3Col4);
        textRow3Col4.setText(FOCS.getGradeSTR());
        textRow3Col5 = (TextView) rootview.findViewById(R.id.textRow3Col5);
        textRow3Col5.setText(FOCS.getLetterGPA());
        textRow3Col6 = (TextView) rootview.findViewById(R.id.textRow3Col6);
        textRow3Col6.setText(FOCS.getMaxPossibleSTR());
        textRow3Col7 = (TextView) rootview.findViewById(R.id.textRow3Col7);
        textRow3Col7.setText(FOCS.getMinPossibleSTR());

        ClassData MultiVar= new ClassData("MultiVar",1);
        classesList.addElement(MultiVar);
        MultiVar.addAnAssignment("ass1", 30, 85);
        MultiVar.addAnAssignment("ass2", 13, 92);
        MultiVar.addAnAssignment("ass3", 36, 75);
        textRow4Col1 = (TextView) rootview.findViewById(R.id.textRow4Col1);
        textRow4Col1.setText(MultiVar.getClassName());
        textRow4Col2 = (TextView) rootview.findViewById(R.id.textRow4Col2);
        textRow4Col2.setText(Integer.toString(MultiVar.getCredits()));
        textRow4Col3 = (TextView) rootview.findViewById(R.id.textRow4Col3);
        textRow4Col3.setText(MultiVar.getPercentInSTR());
        textRow4Col4 = (TextView) rootview.findViewById(R.id.textRow4Col4);
        textRow4Col4.setText(MultiVar.getGradeSTR());
        textRow4Col5 = (TextView) rootview.findViewById(R.id.textRow4Col5);
        textRow4Col5.setText(MultiVar.getLetterGPA());
        textRow4Col6 = (TextView) rootview.findViewById(R.id.textRow4Col6);
        textRow4Col6.setText(MultiVar.getMaxPossibleSTR());
        textRow4Col7 = (TextView) rootview.findViewById(R.id.textRow4Col7);
        textRow4Col7.setText(MultiVar.getMinPossibleSTR());

        textRow13Col2 = (TextView) rootview.findViewById(R.id.textRow13Col2);
        textRow13Col2.setText(Integer.toString(getTotalCredits(classesList)));
        textRow13Col3 = (TextView) rootview.findViewById(R.id.textRow13Col3);
        textRow13Col3.setText(getTotalPercentIn(classesList));
        textRow13Col4 = (TextView) rootview.findViewById(R.id.textRow13Col4);
        textRow13Col4.setText(getTotalGrade(classesList));
        textRow13Col5 = (TextView) rootview.findViewById(R.id.textRow13Col5);
        textRow13Col5.setText(getTotalGPA(classesList));
        textRow13Col6 = (TextView) rootview.findViewById(R.id.textRow13Col6);
        textRow13Col6.setText(minTotalGrade(classesList));
        textRow13Col7 = (TextView) rootview.findViewById(R.id.textRow13Col7);
        textRow13Col7.setText(maxTotalGrade(classesList));

        return rootview;
    }

}