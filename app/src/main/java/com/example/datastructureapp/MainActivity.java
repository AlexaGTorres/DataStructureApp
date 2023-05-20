package com.example.datastructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.actualList);

        /*
        Queue myQueue = new Queue();

        myQueue.add(10);
        myQueue.add(20);

       ArrayAdapter<Queue> adapter = new ArrayAdapter<Queue>(this, myQueue);//This still doesn't work...

        listView.setAdapter(adapter);
         */

        //I know how to use list view though

        ArrayList<Integer> yes = new ArrayList<Integer>();

        yes.add(10);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);
        yes.add(20);


        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, yes);

        listView.setAdapter(adapter);

    }
}