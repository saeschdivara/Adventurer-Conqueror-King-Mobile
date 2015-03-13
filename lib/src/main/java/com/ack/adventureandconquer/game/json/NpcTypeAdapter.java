package com.ack.adventureandconquer.game.json;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.humanoid.LizardManType;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by saskyrar on 05/02/15.
 */
public class NpcTypeAdapter extends TypeAdapter<IsNpcType> {
    @Override
    public void write(JsonWriter out, IsNpcType value) throws IOException {
        out.beginObject();
        out.endObject();
    }

    @Override
    public IsNpcType read(JsonReader in) throws IOException {

        in.beginObject();
        in.endObject();

        return new LizardManType();
    }
}
