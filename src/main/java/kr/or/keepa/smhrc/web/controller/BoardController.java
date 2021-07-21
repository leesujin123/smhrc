package kr.or.keepa.smhrc.web.controller;

import kr.or.keepa.smhrc.entity.board.Board;
import kr.or.keepa.smhrc.service.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(ModelAndView mv) {
        System.out.println("게시판 list 들어와?");
        List<Board> boardList = boardService.boardList();
        mv.addObject("boardList", boardList);
        mv.setViewName("board/list");

        System.out.println(boardList);
        return mv;
    }

    @RequestMapping(value = "/write")
    public String write() {
        return "board/write";
    }
}
