package kr.or.keepa.smhrc.web.controller;

import kr.or.keepa.smhrc.entity.board.Board;
import kr.or.keepa.smhrc.service.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService boardService;

        @GetMapping(value = "")
        public String root() {
            return "redirect:/board/";
        }

        /*@RequestMapping(value = "/list")
        public String list() {
            return "board/list";
        }*/


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(ModelAndView mv){
        System.out.println("게시판 list 들어와?" );
        List<Board> boardList = boardService.boardList();
        //ModelAndView mv = new ModelAndView("board/list","boardList",boardList);
        List<String> test = new ArrayList<>();
        test.add("A");
        test.add("B");
        test.add("C");
        test.add("D");
        mv.addObject("boardList", boardList);
        mv.addObject("test", test);
        mv.setViewName("board/list");

        System.out.println(boardList);
        return mv;
    }
}
