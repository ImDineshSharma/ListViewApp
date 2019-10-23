package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference to list view
        ListView MyList = (ListView)findViewById(R.id.MyList);

    final String[] foods = {"Bacon", "Tuna", "Potato", "Meatball", "Candy", "Sushi",
            "Apple", "Orange", "Pizza", "Hot dog", "Chole Bhature", "Chole Kulche", "Pasta"};


    //Adapter as a converter
        ListAdapter LAdapter = new CustomAdapter(this, foods);
        MyList.setAdapter(LAdapter);


        //item listener
        MyList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String store = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, store, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}
