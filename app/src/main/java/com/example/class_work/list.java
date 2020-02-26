package com.example.class_work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {
 ListView pat ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        pat=findViewById(R.id.view);
        final ArrayList<String>Arraylist=new ArrayList<>();

        Arraylist.add("Uganda");
        Arraylist.add("Kenya");
        Arraylist.add("Burundi");
        Arraylist.add("Malawi");
        Arraylist.add("Cameroon");
        Arraylist.add("Zimbabwe");
        Arraylist.add("United kingdom");

        ArrayAdapter arrayAdapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,Arraylist);
    pat.setAdapter(arrayAdapter);
    pat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    });

    }



}
