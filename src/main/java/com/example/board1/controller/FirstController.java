package com.example.board1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {


    @ResponseBody
    @RequestMapping("/HelloWorld")
    public String HelloWorld() {

        return "Hello World";
    }

}
