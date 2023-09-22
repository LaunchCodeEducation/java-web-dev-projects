package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String skillsBody() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                        "<li>JavaScript</li>" +
                        "<li>HTML</li>" +
                        "<li>Java</li>" +
                        "</ol>" +
                        "<p>Click <a href = '/form'>here</a> to select your fave!!!</p>" +
                        "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("/form")
    public String skillsChoiceForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<div id = 'name'>" +
                        "<h2>Name:</h2>" +
                        "</div>"+
                        "<form method = 'POST' action = '/results'>" +
                        "<input type = 'text' name = 'name'>" +
                        "<h2>My Favorite Language:</h2>" +
                        "<select name = 'first'>" +
                        "<option value = 'javascript'> JavaScript </option>" +
                        "<option value = 'html'> HTML </option>" +
                        "<option value = 'java'> Java </option>" +
                        "</select>"+
                        "<h2>My Second Favorite Language:</h2>" +
                        "<select name = 'second'>" +
                        "<option value = 'javascript'> JavaScript </option>" +
                        "<option value = 'html'> HTML </option>" +
                        "<option value = 'java'> Java </option>" +
                        "</select>"+
                        "<h2>My Third Favorite Language:</h2>" +
                        "<select name = 'third'>" +
                        "<option value = 'javascript'> JavaScript </option>" +
                        "<option value = 'html'> HTML </option>" +
                        "<option value = 'java'> Java </option>" +
                        "</select>"+"<br />"+
                        "<input type ='submit' value = 'Submit'/>" +
                        "</form>"+
                        "</body>" +
                "</html>";
        return html;
    }

    //@RequestMapping(value="form", method = RequestMethod.POST)
    @PostMapping("/results")
    public String postChoice(@RequestParam String name, String first, String second, String third){

        return createAnswers(name, first, second, third);

        //return name;
        }

    public static String createAnswers(String name, String firstChoice, String secondChoice,
                                       String thirdChoice){
        String answer =
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<h3>Favorite Languages:</h3>" +
                        "<ol><li>" + firstChoice + "</li>" +
                        "<li>" + secondChoice + "</li>" +
                        "<li>" + thirdChoice + "</li></ol>" +
                        "</body>" +
                "</html>";
        return answer;
    }
}
