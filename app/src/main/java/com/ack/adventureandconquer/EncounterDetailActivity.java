package com.ack.adventureandconquer;

import android.content.Context;
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

import com.ack.adventureandconquer.info.game.GameController;
import com.ack.adventureandconquer.info.game.adventure.Encounter;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

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
        System.out.println(encounter);

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

            Npc npc = npcList.get(position);
            unitName.setText("Type: " + npc.getClass().getSimpleName());
            armorClass.setText("Armor: " + String.valueOf(npc.getArmorClass()));
            hitDice.setText("Hit dice: " + String.valueOf(npc.getHitDice()));
            hitPoints.setText("Hit points: " + String.valueOf(npc.getHitPoints()));

            return rowView;
        }
    }

}
