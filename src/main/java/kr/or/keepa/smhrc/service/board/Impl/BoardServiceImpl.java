package kr.or.keepa.smhrc.service.board.Impl;

import kr.or.keepa.smhrc.entity.board.Board;
import kr.or.keepa.smhrc.mapper.board.BoardMapper;
import kr.or.keepa.smhrc.service.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardMapper boardMapper;


    public List<Board> boardList() {
        System.out.println("게시판 list service 까지는 들어와?");
        return boardMapper.boardList();

    }
}
