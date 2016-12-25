package com.naimi.amine.jokerev.Models;

import com.naimi.amine.jokerev.Models.POJO.Event;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by macbookpro on 11/12/16.
 */
public class EventContent {

  public static List<Event> eventList = new ArrayList<>();


  static{

    eventList.add(new Event(1,"hello joker",
            "Hello joker description","14/12/2016","image1"));

    eventList.add(new Event(2,"joker cup",
            "joker cup description","12/2/2017","image2"));

    eventList.add(new Event(1,"Joker Event",
            "Joker event description","15/4/2017","image3"));




  }


}
