package com.example.android.myportfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    public void sendMessage(View view) {
        Context context = getApplicationContext();

        CharSequence text;
        switch(view.getId()) {
            case R.id.spotifyStreamerBtn:
                text = "This button will launch the Music Streamer App";
                break;
            case R.id.footballScoresBtn:
                text = "This button will launch the Scores App";
                break;
            case R.id.libraryBtn:
                text = "This button will launch the Library App";
                break;
            case R.id.buildItBiggerBtn:
                text = "This button will launch the Build It Bigger App";
                break;
            case R.id.xyzReaderBtn:
                text = "This button will launch the XYZ Reader";
                break;
            case R.id.capstoneBtn:
                text = "This button will launch the My Capstone App";
                break;
            default:
                text = "Unknown View";

        }


        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
