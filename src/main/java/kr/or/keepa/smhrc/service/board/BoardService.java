package kr.or.keepa.smhrc.service.board;

import kr.or.keepa.smhrc.entity.board.Board;

import java.util.List;

public interface BoardService {
    List<Board> boardList();

    void insertBoard(Board board);

    Board detailBoard(int bno);

    void updateBoard(Board board);

}
