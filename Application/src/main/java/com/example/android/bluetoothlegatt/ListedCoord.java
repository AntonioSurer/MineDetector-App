package com.example.android.bluetoothlegatt;

import android.app.Activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListedCoord extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listed_coord);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<DataCoord.ToDos>(
                this,
                android.R.layout.simple_list_item_1,
                DataCoord.todo
        ));
    }
}