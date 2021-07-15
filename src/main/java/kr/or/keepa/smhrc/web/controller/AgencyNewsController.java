package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agencynews")
public class AgencyNewsController {

    @GetMapping(value = "/AgencyNews")
    public String agencyNews() {
        return "agencynews/AgencyNews";
    }
    @GetMapping(value = "/notice")
    public String notice() {
        return "agencynews/notice";
    }
    @GetMapping(value = "/album")
    public String album() {
        return "agencynews/album";
    }
    @GetMapping(value = "/bid")
    public String bid() {
        return "agencynews/bid";
    }
}
