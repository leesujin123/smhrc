package kr.or.keepa.smhrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

import static java.io.File.pathSeparator;

@Controller
@RequestMapping("/introdution")
public class IntrodutionController {

    @GetMapping(value = "")
    public String root() {
        return "redirect:/introdution/";
    }

    @GetMapping(value = "/")
    public String index() {
        return "introdution/index";
    }

    //인사말
    @GetMapping(value="/greeting")
    public String greeting() {
        System.out.println("greeting");
        return "introdution/greeting";
    }

    //연혁
    @GetMapping(value="/history")
    public String history() {
        System.out.println("history");
        return "introdution/history";
    }

    //미션과 비젼
    @GetMapping(value="/vision")
    public String vision() {
        System.out.println("vision");
        return "introdution/vision";
    }

    //조직도
    @GetMapping(value="/org-chart")
    public String orgChart() {
        System.out.println("orgChart");
        return "introdution/org-chart";
    }

    //센터로고
    @GetMapping(value="/logo")
    public String logo() {
        System.out.println("logo");
        return "introdution/logo";
    }

    //찾아오시는 길
    @GetMapping(value="/visit")
    public String visit() {
        System.out.println("visit");
        return "introdution/visit";
    }

    //---------------------------------------------------------------------

    //파일업로드 /introdution/file/upload
    @PostMapping(value = "/file/upload")
    public String fileUpload(MultipartFile uploadFile) {
        //MultipartFile 클래스 :
        System.out.println("file안에 뭐들음? " + uploadFile);
        System.out.println("파일컨텐츠 유형 " + uploadFile.getContentType());
        System.out.println("multipart형식의 매개변수 이름 " + uploadFile.getName());
        System.out.println("원본파일이름 " + uploadFile.getOriginalFilename());
        System.out.println("파일크기 " + uploadFile.getSize() + "바이트");

        //파일저장경로설정
        String path = "C:\\downexam";
        //원본파일이름
        String originalFile = uploadFile.getOriginalFilename();

        File file = new File(path + "\\" + originalFile);
        try {
            uploadFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "introdution/logo";
    }
}
