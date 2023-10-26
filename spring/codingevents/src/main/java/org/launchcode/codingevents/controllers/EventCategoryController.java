package org.launchcode.codingevents.controllers;


import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventCategory;
import org.launchcode.codingevents.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.Errors;


@Controller
@RequestMapping("eventCategories")
public class EventCategoryController {
    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @GetMapping()
    public String displayAllCategories(Model model) {
        model.addAttribute("categories", eventCategoryRepository.findAll());
        model.addAttribute("title", "All Categories");

        return "eventCategories/index";
    }

    @GetMapping("create")
    public String renderCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute("category", new EventCategory());

        return "eventCategories/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm(@ModelAttribute EventCategory newEventCategory, Errors errors, Model model) {
        if(errors.hasErrors()){
            model.addAttribute("title", "Create Category");
            model.addAttribute("category", new EventCategory());
            return "eventCategories/create";
        }

        eventCategoryRepository.save(newEventCategory);
        return "eventCategories/create";

    }
}
