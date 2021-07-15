package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/introdution")
public class IntrodutionController {

    //인사말
    @GetMapping("/greeting")
    public String greeting() {
        System.out.println("greeting");
        return "introdution/greeting";
    }

    //연혁
    @GetMapping("/history")
    public String history() {
        System.out.println("history");
        return "introdution/history";
    }

    //미션과 비젼
    @GetMapping("/vision")
    public String vision() {
        System.out.println("vision");
        return "introdution/vision";
    }

    //조직도
    @GetMapping("/orgChart")
    public String orgChart() {
        System.out.println("orgChart");
        return "introdution/organization_chart";
    }

    //센터로고
    @GetMapping("/logo")
    public String logo() {
        System.out.println("logo");
        return "introdution/logo";
    }

    //찾아오시는 길
    @GetMapping("/visit")
    public String visit() {
        System.out.println("visit");
        return "introdution/visit";
    }
}
