package com.github.studybuddy.rcos.studybuddy_app;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

/**
 * Created by marina on 7/31/15.
 */
public class AssignTitle_Fragment extends ListFragment {
    boolean mDuelPane;

    int current_selection = 0;

    //Bundle: saved key value pairs
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
//
//        ArrayAdapter<String> connectArrayToListView = new
//                ArrayAdapter<String>(
//                getActivity(),
//                android.R.layout.simple_list_item_activated_1,
//                AssignmentInfo.ASSIGN_TITLES);
//
//        setListAdapter(connectArrayToListView);
//        View detailsFrame = getActivity().findViewById(R.id.details);
    }

}
