package com.dor.springcourse0710.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model)
    {
        //System.out.println(name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam("a") int a,
                                 @RequestParam("b") int b,
                                 @RequestParam("operation") String operation,
                                 Model model){
        double sum = 0;
        if(operation.equals("multiplication")){sum = a * b;}
        else if(operation.equals("addition")){sum = a + b;}
        else if(operation.equals("subtraction")){sum = a - b;}
        else{sum = a / (double)b;}
        model.addAttribute("calc", a + " " + operation + " " + b + " = " + sum);
        return "first/calculator";
    }
}
