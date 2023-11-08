package com.green.springfirst.board;

import com.green.springfirst.ResVo;
import com.green.springfirst.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // json 리턴할때씀
@RequiredArgsConstructor   // service에 boardservice 주소값이 들어옴
public class BoardController {

    @Autowired
    private final BoardService service;

    @GetMapping("/board")                                       // get방식 일때 쿼리스트링으로
    public List<BoardVo> getBoard() {
        return service.getBoard();
    }

    @GetMapping("/board/{iboard}")
    public BoardDatailVo getBoardDatailVo(@PathVariable int iboard) {
        System.out.println(iboard);
        return service.getBoardById(iboard);
    }

    @PostMapping("/board") // 같은 주소값이라도 날리는 방식(get방식, post)에 따라 다름
    public ResVo insBoard(@RequestBody BoardInsDto dto) {
        System.out.println(dto);                  //dto 서블릿? 서블릿이  BoardInsDto객체화
        int result = service.postBoard(dto);
        System.out.println("result : " + result);
        return new ResVo(result);                       // postmapping으로 날릴때 리턴값 1
    }
    @DeleteMapping("/board/{iboard}")
    public ResVo delBoard(@PathVariable int iboard) {
        System.out.println(iboard);
        int result =  service.DelBoard(iboard);
        return new ResVo(result);
    }
    @PutMapping("/board")
    public ResVo updBoard(@RequestBody BoardUpdDto dto) {
        int result = service.putBoard(dto);
        return new ResVo(result);
    }
}

