package com.green.springfirst3.board;

import com.green.springfirst3.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;

    public List<BoardVo> getBoard() {
        return mapper.selBoardList();
    }
}
