package com.udacity.jarvis.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showShortToast(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        if( v != null) v.setGravity(Gravity.CENTER);
        toast.show();
    }

    // Methods handling button presses.
    public void launchSpotify(View view) {
        showShortToast("This button will launch my Spotify Streamer app!");
    }

    public void launchScores(View view) {
        showShortToast("This button will launch my Scores app!");
    }

    public void launchLibrary(View view) {
        showShortToast("This button will launch my Library app!");
    }

    public void launchBuild(View view) {
        showShortToast("This button will launch my Build It Bigger app!");
    }

    public void launchXYZ(View view) {
        showShortToast("This button will launch my XYZ Reader app!");
    }

    public void launchCapstone(View view) {
        showShortToast("This button will launch my Capstone app!");
    }
}
