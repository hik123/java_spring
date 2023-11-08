package com.green.springfirst3.board;

import com.green.springfirst3.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selBoardList();
}
