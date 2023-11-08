package com.green.springfirst3.board;

import com.green.springfirst3.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/board")
    public List<BoardVo> getBoard() {
        return service.getBoard();
    }


}
