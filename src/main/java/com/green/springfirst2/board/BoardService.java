package com.green.springfirst2.board;

import com.green.springfirst2.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service            // 빈등록 > 객체생성을 spring container가 함
@RequiredArgsConstructor                                    // 빈등록 >> 객체생성을 대리로 spring container에게 맞김
public class BoardService {                                     // 객체화(객체화할때 DI)한 그친구의 주소값을 달라고 언제든 요청가능
                                                                // spring에서 DI가능한 이유 spring 이 ioc를 따르고 있기때문
    private final BoardMapper mapper;                           // ioc >> inversion of control
                                                               // Vo(밸류 오브젝트:값 객체)는 setter가 없다
    public List<BoardVo> getBoard() {                          // DTO(data transfor object) 데이터를 옮길때 쓰는 객체
        return mapper.selBoardList();                          // DTO 는 setter있음,
    }

    public BoardDatailVo getBoardById(int iboard) {
        return mapper.selBoardById(iboard);
    }

    public int postBoard(BoardInsDto dto) { // 이름은 아무거나
        return mapper.insBoard(dto); }

    public int delBoard(int result) {
        return mapper.delBoard(result);
    }
    public int putBoard(BoardUpdDto dto) {
        return mapper.updBoard(dto);
    }

}
