package org.launchcode.codingevents.controllers;

import jakarta.validation.Valid;
import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("events")
public class EventController {
    //private static List<String> dummyEvents = new ArrayList<>();
    //private static Map<String, String> actualEvents = new HashMap<>();
    //private static List<Event> events = new ArrayList<>(); - commented out once EventData class is made

    @Autowired
    private EventRepository eventRepository;
    //lets try findall, save and findbyid
    @GetMapping
    public String displayAllEvents(@RequestParam(required = false) Integer categoryId, Model model){
          if(categoryId == null) {
              model.addAttribute("events", eventRepository.findAll());
              model.addAttribute("title", "All Events");
          } else {
              Optional<EventCategory> result = eventCategoryRepository.findById(categoryId);
              if(result.isEmpty()) {
              model.addAttribute("title", "Invalid Category ID: " + categoryId);
              } else {
                  EventCategory category = result.get();
                  model.addAttribute("title", "Events in Category: " + category.getName());
                  model.addAttribute("events", category.getEvents());
              }
          }


        return "events/index";
    }

    @Autowired
    private EventCategoryRepository eventCategoryRepository;
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        model.addAttribute("event", new Event());
        model.addAttribute("categories", eventCategoryRepository.findAll());

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

        eventRepository.save(newEvent);
        return "redirect:/events";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
        if(eventIds != null) {
            for (int eventId : eventIds) {
                eventRepository.deleteById(eventId);
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
            eventToEdit.getEventDetails().setDescription(description);
            //does not seem like it will work
        return "redirect:/events";
    }
}
