package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

@RequestMapping(value="hello")
public class HelloController {
    //hello path
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
//goodbye route
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //create handler to handle requests of the form /hello?name=LaunchCode
@RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="hello")
    public String helloWithQueryParam(@RequestParam String name, Model model){
    String greeting = "Hello " + name + "!";
    model.addAttribute("greeting", greeting);
    return "hello";
    }
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model){
        String greeting = "Hello " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }
    @GetMapping("form")
    public String helloWithForm(){
        return "form";

//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" + //maps the input to source/hello works b/c query param method above
//                "<input type='text' name='name'></input>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</input>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("JavaScript");
        names.add("Java");
        model.addAttribute("names", names);
        return "hello-list";
    }

}
