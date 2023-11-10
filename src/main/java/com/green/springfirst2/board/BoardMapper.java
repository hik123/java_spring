package com.green.springfirst2.board;

import com.green.springfirst2.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {      //
    int insBoard(BoardInsDto dto);
    List<BoardVo> selBoardList();
    BoardDatailVo selBoardById(int iboard);
    int delBoard(int ddd);
    int updBoard(BoardUpdDto dto);

}
// mybatis

