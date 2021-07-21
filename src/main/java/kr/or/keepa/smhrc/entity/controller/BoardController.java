package kr.or.keepa.smhrc.entity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
        @GetMapping(value = "")
        public String root() {
            return "redirect:/board/";
        }

        @RequestMapping(value = "/list")
        public String list() {
            return "board/list";
        }
}
