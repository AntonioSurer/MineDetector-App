package com.example.android.bluetoothlegatt;

import java.util.ArrayList;

public class DataCoord {
    public static ArrayList<ToDos> todo = new ArrayList<>();
    static {
        todo.add(new ToDos("Color and Coordinates of Mines Found (RGB)(X,Y):"));

    }
    public static class ToDos{
        public String data;
        public ToDos(String title) { this.data = title;}
        @Override
        public String toString() { return ""+data; }
    }
}