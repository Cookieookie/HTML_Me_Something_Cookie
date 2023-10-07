package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

@RequestMapping(value = "namer", method = {RequestMethod.GET, RequestMethod.POST})
@ResponseBody
public String namerWithQueryParam(@RequestParam String name, @RequestParam String language, @RequestParam String language2, @RequestParam String language3) {
    if (name == null) {
        name = "This user";
    }

    return name + "'s favorite coding languages: " + System.lineSeparator() +
        "1. " + favoriteCodingLanguages(language) + System.lineSeparator() +
        "2. " + favoriteCodingLanguages(language2) + System.lineSeparator() +
        "3. " + favoriteCodingLanguages(language3) + System.lineSeparator();
}

public static String favoriteCodingLanguages(String lang) {
    String codingLanguage = "";

    if(lang.equals("java")) {
        codingLanguage = "Java";
    } else if (lang.equals("javascript")) {
        codingLanguage = "JavaScript";
    } else if (lang.equals("python")) {
        codingLanguage = "Python";
    }
    return codingLanguage;
}

@GetMapping
@ResponseBody
public String skillsTrackerList() {
    String html =
            "<html>" +
                    "<h1>" + "Skills Tracker" + "</h1>" +
                    "<h2>" + "We have a few skills we would like to learn. Here is the list!" + "</h2>" +
                    "<ol>" +
                    "<li>" + "Java" + "</li>" +
                    "<li>" + "JavaScript" + "</li>" +
                    "<li>" + "Python" + "</li>" +
                    "</ol>" +
                    "</html>";
    return html;
}

@GetMapping("form")
@ResponseBody
public String skillsForm() { //form that lets user enter their name and choose their 1st, 2nd, and 3rd fav coding language.
    return "<html>" +
            "<body>" +
            "<form action = 'namer' method = 'post'>" +
            "<p>" + "Name:" + "</p>" +
                "<input type='text' name='name'>" +
            "<p>" + "My favorite language is:" + "</p>" +
                "<select name='language'>" +
                    "<option value='java'>" + "Java" + "</option>" +
                    "<option value='javascript'>" + "JavaScript" + "</option>" +
                    "<option value='python'>" + "Python" + "</option>" +
                "</select>" +
            "<p>" + "My second favorite language is:" + "</p>" +
                "<select name='language2'>" +
                    "<option value='java'>" + "Java" + "</option>" +
                    "<option value='javascript'>" + "JavaScript" + "</option>" +
                    "<option value='python'>" + "Python" + "</option>" +
                "</select>" +
            "<p>" + "My third favorite language is:" + "</p>" +
                "<select name='language3'>" +
                    "<option value='java'>" + "Java" + "</option>" +
                    "<option value='javascript'>" + "JavaScript" + "</option>" +
                    "<option value='python'>" + "Python" + "</option>" +
                "</select>" +
            "<input type ='submit' value='submit'>" +
            "</form>" +
            "</body>" +
            "</html>";
}






}
