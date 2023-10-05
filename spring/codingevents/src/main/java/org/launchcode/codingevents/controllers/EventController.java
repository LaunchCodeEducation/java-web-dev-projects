package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    //private static List<String> dummyEvents = new ArrayList<>();
    private static Map<String, String> actualEvents = new HashMap<>();
    @GetMapping
    public String displayAllEvents(Model model){
        //List dummyEvents = new ArrayList<>();
//        dummyEvents.add("Event 1");
//        dummyEvents.add("Event 2");
//        dummyEvents.add("Event 3");
        actualEvents.put("Super Event", "Promise it will smell good");
        actualEvents.put("So-so Event", "Promise it will smell so-so");
        actualEvents.put("Okay Event", "Promise it will smell okay");
        model.addAttribute("actualEvents", actualEvents);

        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, String eventDescription) {
        actualEvents.put(eventName, eventDescription);
        return "redirect:/events";
    }

}
