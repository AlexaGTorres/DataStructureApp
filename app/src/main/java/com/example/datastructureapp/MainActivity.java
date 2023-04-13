package com.example.datastructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.actualList);

        Queue myQueue = new Queue();

        myQueue.add(10);
        myQueue.add(20);

        ArrayAdapter<Queue> adapter = new ArrayAdapter<Queue>(this, myQueue);

        listView.setAdapter(adapter);

    }
}