package com.xan.sunshine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceholderFragment extends Fragment {
    private ArrayAdapter<String> mForecastAdapter;

    public PlaceholderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_main,container,false);

        String[] forecastArray={
          "Today - Sunny - 88/63",
                "Tomorrow - Sunny - 88/63",
                "Weds - Foggy - 88/63",
                "Thurs - Cloudy - 88/63",
                "Fri - Asteroids - 88/63",
                "Sat - Heavy Rain - 88/63",
                "Sun - Sunny - 88/63"
        };

        List<String> weekForecast=new ArrayList<String>(Arrays.asList(forecastArray));

        mForecastAdapter=new ArrayAdapter<String>(
                getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);

        ListView listView= (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        return rootView;
    }

}
