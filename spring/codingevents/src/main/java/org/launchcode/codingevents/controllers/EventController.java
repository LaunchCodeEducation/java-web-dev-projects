package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("event")
public class EventController {
    @GetMapping
    public String displayAllEvents(Model model){
        List dummyEvents = new ArrayList<>();
        dummyEvents.add("Event 1");
        dummyEvents.add("Event 2");
        dummyEvents.add("Event 3");
        model.addAttribute("dummyEvents", dummyEvents);
        return "events/index";
    }

}
