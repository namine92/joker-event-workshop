package com.naimi.amine.jokerev.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.naimi.amine.jokerev.Models.POJO.Event;
import com.naimi.amine.jokerev.R;

import java.util.List;

/**
 * Created by macbookpro on 11/12/16.
 */
public class EventListAdapter extends BaseAdapter {

    List<Event> eventList;

    // declare context to get it later from the activity to create LayoutInfalter
    Context myContext;

    // declare infalter which coverts an XML layout file into corresponding ViewGroups and Widgets
    LayoutInflater inflater;

   public EventListAdapter(Context myContext, List<Event> eventList){

        this.myContext = myContext;
       this.eventList = eventList;
    }

    @Override
    public int getCount() {
        return eventList.size();
    }


    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        //get the inflater from the context
        inflater = LayoutInflater.from(myContext);

        if(view == null)
        // the inflate methode returns the view object with the XML of our item
        // the 2 firsts parameter are clear, the third (Boolean) idicate if we want to attach the return view to the second parameter
        // as a parent view or not in this case view group will be the parent of the view
            view = inflater.inflate(R.layout.event_item_layout, viewGroup, false);

       TextView eventTitle = (TextView) view.findViewById(R.id.title_text);
        TextView eventDate = (TextView) view.findViewById(R.id.date_text);
        TextView eventDescription = (TextView) view.findViewById(R.id.description_text);

        eventTitle.setText(eventList.get(pos).title);
        eventDate.setText(eventList.get(pos).date);
        eventDescription.setText(eventList.get(pos).description);

        return view;
    }

    @Override
    public long getItemId(int pos) {
        return eventList.get(pos).id;
    }

    @Override
    public Object getItem(int pos) {
        return eventList.get(pos);
    }
}
