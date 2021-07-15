package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agency-news")
public class AgencyNewsController {
    @GetMapping(value = "")
    public String root() {
        return "redirect:/agency-news/";
    }

    @GetMapping(value = "/")
    public String index() {
        return "agency-news/index";
    }

    @GetMapping(value = "/notice")
    public String notice() {
        return "agency-news/notice";
    }

    @GetMapping(value = "/album")
    public String album() {
        return "agency-news/album";
    }

    @GetMapping(value = "/bid")
    public String bid() {
        return "agency-news/bid";
    }
}
