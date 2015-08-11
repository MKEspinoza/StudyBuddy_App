package com.github.studybuddy.rcos.studybuddy_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.studybuddy.rcos.studybuddy_app.Planner.Assignment;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by marina on 8/3/15.
 */
public class assign_add_Fragment extends AppCompatActivity {
    View rootview;
    private Assignment new_assign;
    private String title;
    private String course;
    private int    points;
    private String date;
    private String descript;
    private int month;
    private int day;
    private int year;
    private int hour;
    private int minute;
    Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_assign_layout);

        Button add_assign_button = (Button) findViewById(R.id.button_done_add_assign);
        Button edit_date_button = (Button) findViewById(R.id.button_edit_date);
        Button edit_time_button = (Button) findViewById(R.id.button_edit_time);

        add_assign_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText title_edit = (EditText) findViewById(R.id.assign_title_input);
                title = title_edit.getText().toString();
                EditText course_edit = (EditText) findViewById(R.id.assign_class_input);
                course = course_edit.getText().toString();
                EditText points_edit = (EditText) findViewById(R.id.assign_point_input);
                String points_str = points_edit.getText().toString();
                if (points_str.compareTo("") == 0) points = 0;
                else points = Integer.parseInt(points_str);
                EditText descript_edit = (EditText) findViewById(R.id.assign_descript_input);
                descript = descript_edit.getText().toString();

                if (!verify_input()){
                    Context context = getApplicationContext();
                    CharSequence text = "Form not completed";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
                else{
//                    Calendar calendar = new GregorianCalendar()
//                    new_assign = new Assignment(course,title,points)

                    Context context = getApplicationContext();
                    CharSequence text = "Assignment Added";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }




            }
        });

        edit_date_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(mContext, assign_add_edit_date.class));
                Intent toAct_intent = new Intent(mContext, assign_add_edit_date.class);
                startActivity(toAct_intent);

                Intent fromAct_intent = getIntent();

                String month_str = fromAct_intent.getStringExtra("month_str");
                String day_str = fromAct_intent.getStringExtra("day_str");
                String year_str = fromAct_intent.getStringExtra("year_str");

                TextView date_txt = (TextView) findViewById(R.id.date_displayed);
                date_txt.setText(month_str + "/" + day_str + "/" + year_str);

                month = Integer.parseInt(month_str);
                day = Integer.parseInt(day_str);
                year = Integer.parseInt(year_str);

            }
        });

        edit_time_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, assign_add_edit_time.class));
            }
        });
    }

    private boolean verify_input(){
        if ((title.compareTo("") == 0) || (course.compareTo("") == 0) || (descript.compareTo("") == 0) || (points == 0)) {
            return false;
        }
        else
            return true;

    }





}
