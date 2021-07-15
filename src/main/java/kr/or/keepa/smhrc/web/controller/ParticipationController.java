package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/participation")
public class ParticipationController {

    //교육신청
    @GetMapping("/edu-application")
    public String application() { return "participation/edu-application"; }

    //이수증출력 및 만족도 조사
    @GetMapping("/edu-qualification")
    public String qualification() {
        return "participation/edu-qualification";
    }

    //설문조사
    @GetMapping("/servey")
    public String servey() {
        return "participation/servey";
    }

    //질문과답변
    @GetMapping("/qna")
    public String qna() {
        return "participation/qna";
    }

    //자주묻는질문
    @GetMapping("/faq")
    public String faq() {
        return "participation/faq";
    }

}