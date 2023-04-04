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
    private Button addBtn;
    private EditText itemEdit;
    private ArrayList<String> listThing;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.actualList);
        addBtn = findViewById(R.id.buttonAdd);
        itemEdit = findViewById(R.id.editItem);
        listThing = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listThing);

        listView.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String item = itemEdit.getText().toString();

                if (!item.isEmpty())
                {
                    listThing.add(item);

                    adapter.notifyDataSetChanged();
                }
            }
        });

    }
}