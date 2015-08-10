package com.github.studybuddy.rcos.studybuddy_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by cordom2 on 8/4/2015.
 */
public class AddAssignment extends AppCompatActivity {

    String course, assignmentName, percentSTR, scoreSTR;
    double percentOfGrade, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_assignment_layout);

        Button addAssignmentButton = (Button) findViewById(R.id.addAssignmentADDbutton);
        addAssignmentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, ClassInformation.class));
                EditText courseTitle = (EditText) findViewById(R.id.add_assignment_class_name);
                course = courseTitle.getText().toString();
                EditText assignmentTitle = (EditText) findViewById(R.id.add_assignment_title);
                assignmentName = assignmentTitle.getText().toString();
                EditText percentGrade = (EditText) findViewById(R.id.add_assignment_percent_of_grade);
                percentSTR = percentGrade.getText().toString();
                percentOfGrade = Integer.parseInt(percentSTR);
                EditText gradeScore = (EditText) findViewById(R.id.add_assignment_score);
                scoreSTR = gradeScore.getText().toString();
                score = Integer.parseInt(scoreSTR);

            }
        });
    }
}
