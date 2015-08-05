package com.github.studybuddy.rcos.studybuddy_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
public class assign_add_Fragment extends Fragment {
    View rootview;
    private Assignment new_assign;
    private String title;
    private String course;
    private String points;
    private String date;
    private String descript;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.add_assign_layout, container, false);
        return rootview;
    }

//    public void onStart(){
//        super.onStart();
//        Button done_button = (Button) rootview.findViewById(R.id.button_done);
//        done_button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                EditText title_txt = (EditText) rootview.findViewById(R.id.assign_title_input);
//                title = title_txt.toString();
//
//                EditText course_txt = (EditText) rootview.findViewById(R.id.assign_class_input);
//                course = course_txt.toString();
//
//                EditText descript_txt = (EditText) rootview.findViewById(R.id.assign_descript_input);
//                descript = descript_txt.toString();
//
//
//            }
//        });
//    }



}
