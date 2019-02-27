package com.example.android.bluetoothlegatt;

import java.util.ArrayList;

public class Data {
    public static ArrayList<ToDo> todos = new ArrayList<>();
    static {
        todos.add(new ToDo("Waiting for data..."));

    }
    public static class ToDo{
        public String data;
        public ToDo(String title) { this.data = title;}
        @Override
        public String toString() { return "\n"+data; }
    }
}