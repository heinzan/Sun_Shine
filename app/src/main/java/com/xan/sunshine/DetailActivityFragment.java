package com.xan.sunshine;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Intent intent=getActivity().getIntent();
        View rootview=inflater.inflate(R.layout.fragment_detail, container, false);

        if(intent !=null && intent.hasExtra(intent.EXTRA_TEXT)){

            String forecastStr=intent.getStringExtra(intent.EXTRA_TEXT);
            ((TextView)rootview.findViewById(R.id.detail_text)).setText(forecastStr);
        }

        return rootview;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.forecastfragment, menu);
    }


}
