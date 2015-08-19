package com.ack.adventureandconquer.game.json;

import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Constructor;
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

        // TODO: Needs to be faster
        for (Npc npc : value) {
            out.beginObject();

            Class<? extends Npc> npcClass = npc.getClass();

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

            out.name("attackThrow");
            out.value(npc.getMinAttackThrowValue());

            out.name("attackRoutine");
            out.value(npc.getAttackRoutine().toString());

            out.name("saves");
            out.value(npc.getSaves());

            out.name("morale");
            out.value(npc.getMorale());

            out.name("movement");
            out.value(npc.getMovementString());

            out.name("extramovement");
            out.value(npc.getExtraMovementString());

            out.name("extramovementtype");
            out.value(npc.getExtraMovementType());

            out.name("alignment");
            out.value(npc.getAlignment());

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

    private String getSetterMethodName(String fieldName) {

        String setterName = "set";

        int nameStartPoint = 0;

        if (fieldName.startsWith("is")) {
            nameStartPoint = 2;
        }
        else if (fieldName.startsWith("has")) {
            nameStartPoint = 3;
        }

        setterName += fieldName.substring(nameStartPoint, nameStartPoint + 1).toUpperCase() +
                      fieldName.substring(nameStartPoint + 1);

        System.out.println("Setter name: " + setterName);

        return setterName;
    }

    @Override
    public List<Npc> read(JsonReader in) throws IOException {

        List<Npc> allNpc = new ArrayList<>();

        in.beginArray();

        try {

            while (in.hasNext()) {
                in.beginObject();

                String propertyName = in.nextName();

                System.out.println("First type: " + propertyName);

                if (!propertyName.equals("className")) {
                    throw new ClassNotFoundException();
                }

                String className = in.nextString();
                Class<? extends Npc> npcClass = (Class<? extends Npc>) Class.forName(className);

                if (npcClass != null) {
                    System.out.println("NPC Class: " + npcClass.getSimpleName());
                }
                else {
                    System.out.println("Warning: NPC Class is null");
                }

                Constructor<? extends Npc> npcClassConstructor = npcClass.getConstructor();
                Npc npc = npcClassConstructor.newInstance();

                allNpc.add(npc);

                while (in.hasNext()) {
                    String key = in.nextName();
                    System.out.println("Key: " + key);

                    String setterMethodName = getSetterMethodName(key);

                    String getterMethodName = getGetterMethodName(key);
                    Method method = npcClass.getMethod(getterMethodName);

                    System.out.println(method);
                    System.out.println(method.getReturnType().getSimpleName());

                    Class<?> fieldType = method.getReturnType();
                    System.out.println("Field type: " + fieldType.getSimpleName());

                    Method setterMethod = npc.getClass().getMethod(setterMethodName, fieldType);
                    System.out.println("Method: " + setterMethod);

                    String fieldTypeClassName = fieldType.getSimpleName();

                    System.out.println(fieldType);
                    System.out.println( fieldTypeClassName );

                    if (fieldTypeClassName.equals("String")) {
                        String value = in.nextString();
                        setterMethod.invoke(npc, value);
                    }
                    else if (fieldTypeClassName.equals("int")) {
                        int value = in.nextInt();
                        setterMethod.invoke(npc, value);
                    }
                    else if (fieldTypeClassName.equals("double")) {
                        double value = in.nextDouble();
                        setterMethod.invoke(npc, value);
                    }
                    else if (fieldTypeClassName.equals("long")) {
                        long value = in.nextLong();
                        setterMethod.invoke(npc, value);
                    }
                    else if (fieldTypeClassName.equals("boolean")) {
                        boolean value = in.nextBoolean();
                        setterMethod.invoke(npc, value);
                    }
                    else if (fieldType.isEnum()) {
                        String value = in.nextString();
                        Method fromStringMethod = fieldType.getMethod("fromString", String.class);
                        Object enumData = fromStringMethod.invoke(null, value);
                        setterMethod.invoke(npc, enumData);
                    }

                }

                in.endObject();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        in.endArray();

        return allNpc;
    }
}
