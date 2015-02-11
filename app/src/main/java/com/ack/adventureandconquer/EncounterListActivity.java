package com.ack.adventureandconquer;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

        ProgressDialog ringProgressDialog;

        @Override
        protected void onPreExecute() {
            ringProgressDialog = ProgressDialog.show(
                    EncounterListActivity.this,
                    "Please wait ...",
                    "Load encounter ...", true);
        }

        /** The system calls this to perform work in a worker thread and
         * delivers it the parameters given to AsyncTask.execute() */
        protected List<Encounter> doInBackground(String... urls) {
            return GameController.getInstance().loadEncounters();
        }

        /** The system calls this to perform work in the UI thread and delivers
         * the result from doInBackground() */
        protected void onPostExecute(List<Encounter> result) {
            StableArrayAdapter arrayAdapter = new StableArrayAdapter(EncounterListActivity.this, result);
            ListView encounterList = (ListView) findViewById(R.id.encounterList);
            encounterList.setAdapter(arrayAdapter);

            ringProgressDialog.dismiss();
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

    private class StableArrayAdapter extends ArrayAdapter<Encounter> {
        private final Context context;
        private List<Encounter> encounterList;

        public StableArrayAdapter(Context context, List<Encounter> objects) {
            super(context, R.layout.encounter_list_layout, objects);
            this.context = context;
            this.encounterList = objects;
        }

        @Override
        public long getItemId(int position) {
            Encounter item = getItem(position);
            return encounterList.indexOf(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.encounter_list_layout, parent, false);

            Encounter encounter = encounterList.get(position);

            TextView descriptionView = (TextView) rowView.findViewById(R.id.descriptionTextView);
            descriptionView.setText(encounter.getDescription());

            return rowView;
        }
    }
}
