package com.green.springfirst.board;

import com.green.springfirst.ResVo;
import com.green.springfirst.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service            // 빈등록 > 객체생성을 spring container가 함
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;

    public List<BoardVo> getBoard() {
        return mapper.selBoardList();
    }

    public BoardDatailVo getBoardById(int iboard) {
        return mapper.selBoardById(iboard);
    }

    public int postBoard(BoardInsDto dto) { // 이름은 아무거나
        return mapper.insBoard(dto); }

    public int DelBoard(int result) {
        return mapper.delBoard(result);
    }
    public int putBoard(BoardUpdDto dto) {
        return mapper.updBoard(dto);
    }

}
