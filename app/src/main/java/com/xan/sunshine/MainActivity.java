package com.xan.sunshine;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_main,new ForecastFragment())
                    .commit();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if(id == R.id.action_settings){
            startActivity(new Intent(this, SettingsActivity.class));
            return true;

        }if(id == R.id.action_map){
            onPreferenceLocaitonmap();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void onPreferenceLocaitonmap() {

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        String location= prefs.getString(getString(R.string.pref_location_key),getString(R.string.pref_location_default));

        Uri geoLocation=Uri.parse("geo:0,0?").buildUpon().appendQueryParameter("q",location).build();

        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);

        if(intent.resolveActivity(getPackageManager()) != null)
        {

            startActivity(intent);
        }



    }
}
