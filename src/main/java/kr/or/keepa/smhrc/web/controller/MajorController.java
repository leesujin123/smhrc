package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/majorBusinesses")
public class MajorController {
    @GetMapping(value = "/MajorBusinesses")
    public String majorBusinesses() {
        return "majorBusinesses/MajorBusinesses";
    }
}
