package com.naimi.amine.jokerev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.naimi.amine.jokerev.Adapters.EventListAdapter;
import com.naimi.amine.jokerev.Models.EventContent;

public class MainActivity extends AppCompatActivity {

    ListView eventListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username = getIntent().getExtras().getString("userName");

        Toast.makeText(MainActivity.this, "Hello " +
                username, Toast.LENGTH_SHORT).show();


        eventListView = (ListView) findViewById(R.id.Event_list);


        //Instantiate an EventListAdapter
        EventListAdapter eventAdpt = new EventListAdapter(this, EventContent.eventList);


        eventListView.setAdapter(eventAdpt);

    }


}
