package com.github.studybuddy.rcos.studybuddy_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by glissj on 7/24/2015.
 */
public class assign_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview= inflater.inflate(R.layout.assign_layout, container, false);
        return rootview;
    }



}
