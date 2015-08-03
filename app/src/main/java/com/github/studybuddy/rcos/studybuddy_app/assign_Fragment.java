package com.github.studybuddy.rcos.studybuddy_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by glissj on 7/24/2015.
 */
public class assign_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview= inflater.inflate(R.layout.assign_layout, container, false);
        Button add_assign_button = (Button) rootview.findViewById(R.id.add_assign_button);
        add_assign_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                assign_add_Fragment add_fragment = new assign_add_Fragment();

                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentManager.beginTransaction().replace(R.id.add_assign_layout, fragment).commit();

                fragmentTransaction.replace(android.R.id.content,
                        add_fragment);

            }

        });

        return rootview;
    }






}
