package com.ack.adventureandconquer;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.ack.adventureandconquer.info.game.GameController;
import com.ack.adventureandconquer.info.game.adventure.Encounter;

import java.util.List;


public class EncounterListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encounter_list);

        // Load already created encounters
        System.out.println("Before task");
        new LoadEncountersTask().execute("");
    }

    private class LoadEncountersTask extends AsyncTask<String, Void, List<Encounter>> {
        /** The system calls this to perform work in a worker thread and
         * delivers it the parameters given to AsyncTask.execute() */
        protected List<Encounter> doInBackground(String... urls) {
            System.out.println("Loading in background");
            return GameController.getInstance().loadEncounters();
        }

        /** The system calls this to perform work in the UI thread and delivers
         * the result from doInBackground() */
        protected void onPostExecute(List<Encounter> result) {
            System.out.println("Finish in ui thread");
            System.out.println(result);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_encounter_list, menu);
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
}
