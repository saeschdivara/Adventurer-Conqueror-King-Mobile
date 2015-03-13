package com.ack.adventureandconquer.game.json;

import com.ack.adventureandconquer.game.creature.HumanoidType;
import com.ack.adventureandconquer.game.creature.IsCreatureType;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by saskyrar on 05/02/15.
 */
public class CreatureTypeAdapter extends TypeAdapter<IsCreatureType> {
    @Override
    public void write(JsonWriter out, IsCreatureType value) throws IOException {
        out.beginObject();
        out.endObject();
    }

    @Override
    public IsCreatureType read(JsonReader in) throws IOException {

        in.beginObject();
        in.endObject();

        return new HumanoidType();
    }
}
