package com.thymeleafexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    
    public List<String> games = new ArrayList<>();

@GetMapping("/create")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "1") String name, Model model){

        model.addAttribute("name", name);
        games.add(name);
        return "create";
    }
    @GetMapping("/")
    public String defaultMethod(){
        return "main";
    }



    @GetMapping("/allGames")
    public String getAllGames(Model model){

    model.addAttribute("games", games);


        return "allGames";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "a", required = false, defaultValue = "1") int a,
                             @RequestParam(value = "b", required = false, defaultValue = "1") int b,
                             @RequestParam(value = "action", required = false, defaultValue = "addition") String action,
                             Model model){

    double result = 0;
    switch (action){
        case "multiplication":
            result = a * b;
            break;
        case "addition":
            result = a + b;
            break;
        case "substraction":
            result = a - b;
            break;
        case "division":
            result = a / (double)b;
            break;

    }



    model.addAttribute("result", result);

    return "calculator";
    }





}
