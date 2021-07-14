package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Introdution")
public class IntrodutionController {

    @GetMapping("/Greeting")
    public String greeting() {
        System.out.println("greeting");
        return "introdution/greeting";
    }
}
