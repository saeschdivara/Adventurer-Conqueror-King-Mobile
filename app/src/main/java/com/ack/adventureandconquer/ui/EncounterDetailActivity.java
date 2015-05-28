package com.ack.adventureandconquer.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.ack.adventureandconquer.R;
import com.ack.adventureandconquer.game.adventure.Encounter;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.GameController;

import java.util.List;


public class EncounterDetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encounter_detail);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        // Set top encounter text
        TextView textView = (TextView) findViewById(R.id.encounter_text);
        Encounter encounter = GameController.getInstance().getLastEncounter();

        StableArrayAdapter arrayAdapter = new StableArrayAdapter(this, encounter.getEncounterNpcs());
        ListView npcList = (ListView) findViewById(R.id.npcList);
        npcList.setAdapter(arrayAdapter);

        textView.setText(encounter.getDescription());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_encounter_detail, menu);
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
        else if (id == R.id.action_save_encounter) {
            new SaveEncounterTask().execute("");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_encounter_detail, container, false);
            return rootView;
        }
    }

    private class SaveEncounterTask extends AsyncTask<String, Void, Void> {

        ProgressDialog ringProgressDialog;

        @Override
        protected void onPreExecute() {
            ringProgressDialog = ProgressDialog.show(
                    EncounterDetailActivity.this,
                    "Please wait ...",
                    "Saving encounter ...", true);
        }

        /**
         * The system calls this to perform work in a worker thread and
         * delivers it the parameters given to AsyncTask.execute()
         */
        @Override
        protected Void doInBackground(String... urls) {
            GameController.getInstance().saveEncounter();

            return null;
        }

        /**
         * The system calls this to perform work in the UI thread and delivers
         * the result from doInBackground()
         */
        @Override
        protected void onPostExecute(Void aVoid) {
            ringProgressDialog.dismiss();
        }
    }

    private class StableArrayAdapter extends ArrayAdapter<Npc> {
        private final Context context;
        private List<Npc> npcList;

        public StableArrayAdapter(Context context, List<Npc> objects) {
            super(context, R.layout.npc_list_layout, objects);
            this.context = context;
            this.npcList = objects;
        }

        @Override
        public long getItemId(int position) {
            Npc item = getItem(position);
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.npc_list_layout, parent, false);
            TextView unitName = (TextView) rowView.findViewById(R.id.unitName);
            TextView armorClass = (TextView) rowView.findViewById(R.id.armorClass);
            TextView hitDice = (TextView) rowView.findViewById(R.id.hitDice);
            TextView hitPoints = (TextView) rowView.findViewById(R.id.hitPoints);
            TextView attackThrow = (TextView) rowView.findViewById(R.id.attackThrow);
            TextView attacksDamage = (TextView) rowView.findViewById(R.id.attacksDamage);
            TextView extraInformation = (TextView) rowView.findViewById(R.id.extraInformation);
            TextView save = (TextView) rowView.findViewById(R.id.saves);
            TextView morale = (TextView) rowView.findViewById(R.id.morale);
            TextView movement = (TextView) rowView.findViewById(R.id.movement);
            TextView extramovement = (TextView) rowView.findViewById(R.id.extramovement);

            Npc npc = npcList.get(position);

            unitName.setText("Type: " + npc.getClass().getSimpleName());
            armorClass.setText("Armor: " + String.valueOf(npc.getArmorClass()));
            hitDice.setText("Hit dice: " + String.valueOf(npc.getHitDice()));
            hitPoints.setText("Hit points: " + String.valueOf(npc.getHitPoints()));
            attackThrow.setText("Attack Throw: " + String.valueOf(npc.getMinAttackThrowValue()) + "+");
            attacksDamage.setText("Attacks: " + String.valueOf(npc.getAttackRoutine()));
            save.setText("Saves: " + String.valueOf(npc.getSaves()));
            morale.setText("Morale: " + String.valueOf(npc.getMorale()));
            extraInformation.setText(npc.getExtraInformation());
            movement.setText("Movement: " + String.valueOf(npc.getMovement()));
            if (!npc.getExtraMovementType().isEmpty()) {
                extramovement.setText(String.valueOf("   " + npc.getExtraMovementType()) + ": " + String.valueOf(npc.getExtraMovement()));
            }
            return rowView;
        }
    }

}
