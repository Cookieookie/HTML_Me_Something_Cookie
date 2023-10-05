package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    //lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode - this is a query parameter - Static
    @RequestMapping(method ={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
    // Handles requests of the form /hello/LaunchCode - this is a path parameter - Dynamic
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
    // Handles requests for changing language of hello
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }

        return createMessage(name, language);
    }

    public static String createMessage(String n, String lang) {
        String greeting = "";

        if(lang.equals("english")) {
            greeting = "Hello";
        } else if (lang.equals("french")) {
            greeting = "Bonjour";
        } else if (lang.equals("italian")) {
            greeting = "Bonjorno";
        } else if (lang.equals("spanish")) {
            greeting = "Hola";
        } else if (lang.equals("german")) {
            greeting = "Hallo";
        }
        return greeting + " " + n;
    }

    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method='post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                    "<option value='english'>" + "English" + "</option>" +
                    "<option value='french'>" + "French" + "</option>" +
                    "<option value='italian'>" + "Italian" + "</option>" +
                    "<option value='spanish'>" + "Spanish" + "</option>" +
                    "<option value='german'>" + "German" + "</option>" +
                "</select>" +
                "<input type ='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
