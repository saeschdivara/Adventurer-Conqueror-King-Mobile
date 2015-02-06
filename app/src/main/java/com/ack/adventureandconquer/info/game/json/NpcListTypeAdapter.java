package com.ack.adventureandconquer.info.game.json;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 04/02/15.
 */
public class NpcListTypeAdapter extends TypeAdapter< List<Npc> > {
    @Override
    public void write(JsonWriter out, List<Npc> value) throws IOException {
        out.beginArray();

        for (Npc npc : value) {
            out.beginObject();

            Class<? extends Npc> npcClass = npc.getClass();

            List<Field> fields = getFields(npcClass, null);

            for (Field field : fields) {
                String fieldName = field.getName();

                out.name(fieldName);

                String getterName = getGetterMethodName(fieldName);
                try {
                    Method getterMethod = npcClass.getMethod(getterName, null);
                    try {

                        Class<?> returnTypeClass = getterMethod.getReturnType();

                        String returnValueClassName = returnTypeClass.getSimpleName();

                        System.out.println(returnValueClassName);

                        if (returnValueClassName.equals("String")) {
                            String val = (String) getterMethod.invoke(npc, null);
                            out.value(val);
                        }
                        else if (returnValueClassName.equals("int")) {
                            int val = (int) getterMethod.invoke(npc, null);
                            out.value(val);
                        }
                        else if (returnValueClassName.equals("boolean")) {
                            boolean val = (boolean) getterMethod.invoke(npc, null);
                            out.value(val);
                        }
                        else if (returnTypeClass.isEnum()) {
                            Object valObj = getterMethod.invoke(npc, null);
                            String val = valObj.toString();
                            out.value(val);
                        }
                        else {

                            System.out.println("Could not use the return value");

                            String nullString = null;
                            out.value(nullString);
                        }

                    }
                    catch (InvocationTargetException exc) {
                        System.out.println("Invocation target exception");
                        String nullString = null;
                        out.value(nullString);
                    }
                    catch (IllegalAccessException exc) {
                        System.out.println("Illegal access exception");
                        String nullString = null;
                        out.value(nullString);
                    }
                    catch (Exception exc) {
                        System.out.println("exception");
                        String nullString = null;
                        out.value(nullString);
                    }
                } catch (NoSuchMethodException exc) {
                    System.out.println(fieldName + " has no getter method");
                    try {
                        Class<?> returnTypeClass = field.getType();
                        String returnValueClassName = returnTypeClass.getSimpleName();

                        System.out.println(returnValueClassName);

                        if (returnValueClassName.equals("String")) {
                            String val = (String) field.get(npc);
                            out.value(val);
                        }
                        else if (returnValueClassName.equals("int")) {
                            int val = (int) field.get(npc);
                            out.value(val);
                        }
                        else if (returnValueClassName.equals("boolean")) {
                            boolean val = (boolean) field.get(npc);
                            out.value(val);
                        }
                        else {

                            System.out.println("Could not use the return value");

                            String nullString = null;
                            out.value(nullString);
                        }
                    }
                    catch (IllegalAccessException ill) {
                        System.out.println("Illegal access exception");
                        String nullString = null;
                        out.value(nullString);
                    }
                }
            }

            out.name("className");
            out.value(npcClass.getName());

            out.name("armorClass");
            out.value(npc.getArmorClass());

            out.name("hitDice");
            out.value(npc.getHitDice());

            out.name("additionalHitPoints");
            out.value(npc.getAdditionalHitPoints());

            out.name("hitPoints");
            out.value(npc.getHitPoints());

            out.endObject();
        }

        out.endArray();
    }

    private List<Field> getFields(Class<?> cls, List<Field> fields) {
        if (fields == null) {
            fields = new ArrayList<>();
        }

        String simpleClassName = cls.getSimpleName();

        System.out.println("Class name: " + simpleClassName);

        if  (simpleClassName.equals("Npc") || simpleClassName.equals("Object")) {
            return fields;
        }
        else {
            Field[] classFields = cls.getDeclaredFields();
            System.out.println(cls.getName());

            System.out.println(classFields);
            System.out.println("Field length: " + String.valueOf(classFields.length));

            for (int fieldIndex = 0; fieldIndex < classFields.length; fieldIndex++) {
                Field field = classFields[fieldIndex];
                System.out.println("Field: " + field.getName());
                fields.add(field);
            }

            Class<?> parentClass = cls.getSuperclass();

            return getFields(parentClass, fields);
        }
    }

    private String getGetterMethodName(String fieldName) {

        boolean isBoolean = fieldName.startsWith("is") || fieldName.startsWith("has");

        System.out.println("Is boolean field");

        if (isBoolean) {
            return fieldName;
        }

        String getterName = "get";
        getterName += fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        return getterName;
    }

    @Override
    public List<Npc> read(JsonReader in) throws IOException {
        return null;
    }
}
