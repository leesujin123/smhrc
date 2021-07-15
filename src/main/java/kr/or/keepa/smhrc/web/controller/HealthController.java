package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/health")
public class HealthController {
    @GetMapping(value = "/Health")
    public String health() {
        return "health/Health";
    }
    @GetMapping(value = "/video")
    public String video() {
        return "health/video";
    }
    @GetMapping(value = "/content")
    public String content() {
        return "health/content";
    }
}
