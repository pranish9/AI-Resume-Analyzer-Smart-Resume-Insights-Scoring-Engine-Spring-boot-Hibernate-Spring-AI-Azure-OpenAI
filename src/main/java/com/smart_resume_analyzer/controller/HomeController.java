package com.smart_resume_analyzer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/upload")
    public String uploadForm() {
        return "UploadFile";
    }
    @GetMapping("/listofresult")
    public String listofresults() {
        return "/listofresult";
    }
    @GetMapping("/result")
    public String showResult() {

        return "result";
    }


}
