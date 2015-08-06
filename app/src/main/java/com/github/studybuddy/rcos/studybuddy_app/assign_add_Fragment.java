package com.github.studybuddy.rcos.studybuddy_app;

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

import com.github.studybuddy.rcos.studybuddy_app.Planner.Assignment;

/**
 * Created by marina on 8/3/15.
 */
public class assign_add_Fragment extends AppCompatActivity {
    View rootview;
    private Assignment new_assign;
    private String title;
    private String course;
    private String points;
    private String date;
    private String descript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_assign_layout);

//        Button add_assign_button = (Button) findViewById(R.id.button_done_add_assign);
//        add_assign_button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                //
//            }
//        });
    }





}
