package com.example.android.bluetoothlegatt;

import java.util.ArrayList;

public class DataCoord {
    public static ArrayList<ToDos> todo = new ArrayList<>();
    static {
        todo.add(new ToDos("Color of Mines Found (RGB):"));

    }
    public static class ToDos{
        public String data;
        public ToDos(String title) { this.data = title;}
        @Override
        public String toString() { return "\r\n"+data; }
    }
}