package com.github.studybuddy.rcos.studybuddy_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

/**
 * Created by marina on 8/6/15.
 */
public class assign_add_edit_date extends AppCompatActivity {
    private int month;
    private int day;
    private int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_assign_edit_duedate);

        Button set_date_button = (Button) findViewById(R.id.button_date_done);
        set_date_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                DatePicker date_input = (DatePicker) findViewById(R.id.datePicker);
                month = date_input.getMonth();
                day = date_input.getDayOfMonth();
                year = date_input.getYear();

                Intent intent = new Intent();

                intent.putExtra("month_str",Integer.toString(month));
                intent.putExtra("day_str",Integer.toString(day));
                intent.putExtra("year_str",Integer.toString(year));
                setResult(RESULT_OK, intent);

                finish();


            }


        });

    }
}