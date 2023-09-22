package org.launchcode.Controllers.Studio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {


    @GetMapping("/")
    public String languages(){
       return "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languageForm(){
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<label for='name'>What is your name?</label>" +
                "<input type='text' name='name' label='What is your name?'>" +
                "<br /><label for='languages'>Which is your favorite language?</label><br />" +
                "<select name='lang1' id='lang1'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br /><label for='languages'>Which is your second favorite language?</label><br />" +
                "<select name='lang2' id='lang2'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br /><label for='languages'>Which is your third favorite language?</label><br />" +
                "<select name='lang3' id='lang3'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br /><input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
            }

    @PostMapping("form")
    public String formReturn(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                "<body>" +
                "<h1>" + name +"</h1>" +
                "<table>" +
                "<tr>" +
                "<th>#1 Favorite</th>" +
                "<th>Second Favorite</th>" +
                "<th>Third Favorite</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" + lang1 +"</td>" +
                "<td>" + lang2 + "</td>" +
                "<td>" + lang3 + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";

    }
}
