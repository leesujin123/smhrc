package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/major-businesses")
public class MajorController {
    @GetMapping(value = "")
    public String root() {
        return "redirect:/major-businesses/";
    }

    @GetMapping(value = "/")
    public String index() {
        return "major-businesses/index";
    }


}
