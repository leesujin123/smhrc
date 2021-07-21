package kr.or.keepa.smhrc.mapper.board;

import kr.or.keepa.smhrc.entity.board.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> boardList();

    void write(Board board);
}
