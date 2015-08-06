package com.github.studybuddy.rcos.studybuddy_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
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

import java.util.concurrent.TimeUnit;


/**
 * Created by glissj on 7/24/2015.
 */
public class timer_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview= inflater.inflate(R.layout.timer_layout, container, false);

        Button AddAssignmentButton = (Button) rootview.findViewById(R.id.gototimer);
        AddAssignmentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),timer.class));
            }

    });
    return rootview;}

    public void openAddAssignment(View view){
        Intent intent = new Intent(getActivity(), timer.class);
        startActivity(intent);
    }

    /*@Override
    public void OnClick(View v) {
        switch (rootview.getId()){
            case R.id.timerbutton:
                startActivity(timer);
                break;
        }
    }*/

}
