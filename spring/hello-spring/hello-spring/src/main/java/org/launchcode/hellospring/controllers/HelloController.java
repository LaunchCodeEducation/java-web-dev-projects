package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    //make it handle requests at path /hello rather than at root path
//   @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring";
    }

    //handles requests of the form hello?name=LaunchCode
    //takes a query parameter called name with a given value



//    @RequestMapping (method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name) {
//       return "Hello, " + name + "!";
//
//    }

    //for exercises

    @RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloLanguage(@RequestParam String name, @RequestParam String language) {
             return createMessage(name, language);
    }

    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("english")) {
            greeting = "Hello";
        }
        else if (l.equals("dutch")) {
            greeting = "Hallo";
        }
        else if (l.equals("french")) {
            greeting = "Bonjour";
        }
        else if (l.equals("spanish")) {
            greeting = "Hola";
        }
        else if (l.equals("basque")) {
            greeting = "Kaixo";
        }

        return greeting + ", " + n +"!";
    }

    @GetMapping("hello1")
        @ResponseBody
    public String helloFriendWithQueryParam(@RequestParam String friend) {
        return "Hello, " + friend + "!";
    }



    //handles requests of the form hello/LaunchCode

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    //forms!

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = 'hello'>" + //submit request to path /hello AND uses handler associated with that path
                        "<input type = 'text' name = 'name' />" + //already have a handler method that can dynamically create requests with query parameter called 'name'
                        //"<input type = 'text' friend = 'name'/>" + //cannot get it to work
                        "<select name = 'language' id = 'language-select'>" +
                        "<option value = 'english'> English </option>" +
                        "<option value = 'dutch'> Dutch </option>" +
                        "<option value = 'french'> French </option>" +
                        "<option value = 'spanish'> Spanish </option>" +
                        "<option value = 'basque'> Basque </option>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }


}
