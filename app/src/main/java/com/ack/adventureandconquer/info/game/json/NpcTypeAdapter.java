package com.ack.adventureandconquer.info.game.json;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
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
        return null;
    }
}
