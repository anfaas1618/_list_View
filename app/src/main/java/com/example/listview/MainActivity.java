package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Toast toast;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);
        ArrayList<String> logMem=new ArrayList<String>();
        logMem.add("login mem");
        logMem.add("databse selection 1");
        logMem.add("login mem 1");
        logMem.add("databse selection 2");
        logMem.add("login mem 2");
        logMem.add("databse selection 3");
        logMem.add("login mem 3");
        logMem.add("data selection 4");
        logMem.add(" mem");
        logMem.add("data selection 1");
        logMem.add(" mem 1");
        logMem.add(" selection 2");
        logMem.add(" mem 2");
        logMem.add(" selection 3");
        logMem.add(" mem 3");
        logMem.add(" selection 4");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,logMem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setTag(position);
                Log.i("tag", "onItemClick: "+ view.getTag().toString());
                TextView textView=(TextView)view;
                Toast.makeText(MainActivity.this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
