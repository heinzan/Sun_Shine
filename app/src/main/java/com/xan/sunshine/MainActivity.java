package com.xan.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_main,new PlaceholderFragment())
                    .commit();

    }
}
