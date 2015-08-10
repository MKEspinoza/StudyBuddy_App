package com.github.studybuddy.rcos.studybuddy_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by cordom2 on 8/6/2015.
 */
public class AddClass extends AppCompatActivity {

    String course, creditsSTR;
    int credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_class_layout);

        Button addClassButton = (Button) findViewById(R.id.addClassADDbutton);
        addClassButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, ClassInformation.class));
                EditText courseTitle = (EditText) findViewById(R.id.add_class_title);
                course= courseTitle.getText().toString();
                EditText courseCredits = (EditText) findViewById(R.id.add_class_credits);
                creditsSTR= courseCredits.getText().toString();
                credits= Integer.parseInt(creditsSTR);

            }
        });
    }
}
