package kr.or.keepa.smhrc.web.controller;

import kr.or.keepa.smhrc.entity.board.Board;
import kr.or.keepa.smhrc.service.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    public ModelAndView list(ModelAndView m) {
        List<Board> boardList = boardService.boardList();
        m.addObject("boardList", boardList);
        m.setViewName("board/list");
        return m;
    }

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String write() {
        return "board/write";
    }

    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String postWrite(Board board) {
        boardService.insertBoard(board);
        return "redirect:/board/list";
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public ModelAndView detail(@RequestParam("bno") int bno, ModelAndView m) {
        Board detail = boardService.detailBoard(bno);
        m.addObject("detail", detail);
        m.setViewName("board/detail");
        return m;
    }

    @RequestMapping(value = "/updateWrite", method = RequestMethod.GET)
    public ModelAndView upWrite(Board board, ModelAndView m) {
        Board detail = boardService.detailBoard(board.getBno());
        m.addObject("detail", detail);
        m.setViewName("board/updateWrite");
        return m;
    }

    @RequestMapping(value = "/updateWrite", method = RequestMethod.POST)
    public String updateWrite(Board board) {
        boardService.updateBoard(board);
        return "redirect:/board/list";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("bno") int bno) {
        boardService.deleteBoard(bno);
        return "redirect:/board/list";

    }
}
