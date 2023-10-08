package org.launchcode.codingevents.controllers;

import jakarta.validation.Valid;
import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    //private static List<String> dummyEvents = new ArrayList<>();
    //private static Map<String, String> actualEvents = new HashMap<>();
    //private static List<Event> events = new ArrayList<>(); - commented out once EventData class is made

    @GetMapping
    public String displayAllEvents(Model model){
        //List dummyEvents = new ArrayList<>();
//        dummyEvents.add("Event 1");
//        dummyEvents.add("Event 2");
//        dummyEvents.add("Event 3");
//        actualEvents.put("Super Event", "Promise it will smell good");
//        actualEvents.put("So-so Event", "Promise it will smell so-so");
//        actualEvents.put("Okay Event", "Promise it will smell okay");
//        model.addAttribute("actualEvents", actualEvents);
          model.addAttribute("events", EventData.getAll());
          model.addAttribute("title", "All Events");

        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        model.addAttribute("event", new Event());
        return "events/create";
    }

//    @PostMapping("create")
//    public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription) {
//        //actualEvents.put(eventName, eventDescription);
//        EventData.add(new Event(eventName, eventDescription));
//        return "redirect:/events";
//    }

    @PostMapping("create")
    public String createEvent(@ModelAttribute @Valid Event newEvent, Errors errors, Model model) {
        if(errors.hasErrors()){
            model.addAttribute("title", "Create Event");
//            model.addAttribute("errorMsg", "Bad data!");
            return "events/create";
        }
//        if(Integer.parseInt(newEvent.getZipcode())

        EventData.add(newEvent);
        return "redirect:/events";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
        if(eventIds != null) {
            for (int eventId : eventIds) {
                EventData.remove(eventId);
            }
        }
    return "redirect:/events";
    }

    @GetMapping("edit/{eventId}")
    public String displayEditForm(Model model, @PathVariable int eventId){
        Event eventToEdit = EventData.getById(eventId);
        model.addAttribute("event", eventToEdit);
        String title = "Edit Event " + eventToEdit.getName() + " (id=" + eventToEdit.getId() + ")";
        model.addAttribute("title", title );
        return "events/edit";
    }


    @PostMapping("edit")
    public String processEditForm(int eventId, String name, String description) {
            Event eventToEdit = EventData.getById(eventId);
            eventToEdit.setName(name);
            eventToEdit.setDescription(description);
        return "redirect:/events";
    }
}
