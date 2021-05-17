package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
//    // lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

    // lives /hello/hello
    //Handles request of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    //Handles request of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    // /hello/form
    @RequestMapping(method = RequestMethod.GET)
    public String helloForm() {
        return "<form method='post'>" +
                "<input type='text' name='name'>" +
                "<select name ='language'>" +
                "<option value = 'english'> English </option>" +
                "<option value = 'french'> French </option>" +
                "<option value = 'spanish'> Spanish </option>" +
                "<option value = 'italian'> Italian </option>" +
                "<option value = 'german'> German </option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>";

    }

    @RequestMapping(method = RequestMethod.POST)
    public String createMessage(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }

        String greeting = "";

        if (language.equals("english")) {
            greeting = "Hello, ";
        } else if (language.equals("french")) {
            greeting = "Bonjour, ";
        } else if (language.equals("spanish")) {
            greeting = "Hola, ";
        } else if (language.equals("italian")) {
            greeting = "Ciao, ";
        } else if (language.equals("german")) {
            greeting = "Halo, ";
        }

        return "<p style='color: red; text-align: center; margin-top: 28vh; font-size: 38px'>" + greeting + name + "</p>";
    }
}



