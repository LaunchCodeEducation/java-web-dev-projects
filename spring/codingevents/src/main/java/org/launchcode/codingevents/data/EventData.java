package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //a place to put event data - final to keep us from accidentally making a different variable by same name
    private static final Map<Integer, Event> events = new HashMap<>();

    //get all events - use collection because it is an easily iterable interface
    public static Collection<Event> getAll() {
        return events.values();
    }

    //add a single event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    //get a single event
    public static Event getById(Integer id) {
        return events.get(id);
    }

    //remove an event
    public static void remove(Integer id) {
        if (events.containsKey(id)) {
            events.remove(id);
        }
    }

}
