package com.green.springfirst2.board;

import com.green.springfirst2.ResVo;
import com.green.springfirst2.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // json 리턴할때씀   // 서블릿과 연계된 객체생성
@RequiredArgsConstructor   // 요청된,필수적인 아규먼트 생성자 > 멤버필드에서 값이 무조건 들어와야하는 final // final붙은 애들만 외부에서 값을 받을수있는 생성자를 만들어줌
@RequestMapping("/board") //모든 메소드 앞에 board 붙은거랑 같음
public class BoardController {              //final은 객체생성할때 값이 들어와야됨      //@NoArgsConstructor 기본생성자 만들어줌
                                            // 빈등록된 객체 주소값만 DI가능
    @Autowired                              // http통신할때 보낼수있는 메소드종류? get, post, put/patch, delete   >>get방식때 쿼리스트링만 이용해서 데이터 날릴수있음 / post는 데이터 숨겨서보낼수있음 / 로그인은 get방식 x 주소창에 나타남/ post방식은 쿼리스트링 안쓸수있기때문에 서버에 패킷 보내는데 헤더와 바디중에 바디에 담아서 요청을 보냄
    private final BoardService service; // service에 Boardservice 주소값이 들어옴                               //get이 처리속도가 더 빠름 / 작성하는게 안보였으면할때, 많은 데이터 보내야할때, post 방식 사용(회원가입, 로그인 할때) / 이미지 업로드할때도 post

    @GetMapping                                     // get방식 일때 쿼리스트링으로
    public List<BoardVo> getBoard() {
        return service.getBoard();
    }

    @GetMapping("/{iboard}")
                public BoardDatailVo getBoardDatailVo(@PathVariable int iboard) {
        System.out.println(iboard);
        return service.getBoardById(iboard);
    }

    @PostMapping    // 같은 주소값이라도 날리는 방식(get방식, post)에 따라 다름
    public ResVo insBoard(@RequestBody BoardInsDto dto) {
        System.out.println(dto);                  //dto 서블릿? 서블릿이  BoardInsDto객체화
        int result = service.postBoard(dto);
        System.out.println("result : " + result);
        return new ResVo(result);                       // postmapping으로 날릴때 리턴값 1
    }
    @DeleteMapping("/{iboard}")  //@RequestMapping("/board")
    public ResVo delBoard(@PathVariable int iboard) {  //        del/get(e.g.레코드1개만보낼때re) 만 @PathVariable사용
        System.out.println(iboard);                                                     //레코드 2개이상이 될수있는 상황일때, 여러개일때  List씀
        int result =  service.delBoard(iboard);
        return new ResVo(result);
    }
    @PutMapping // @RequestMapping("/board")
    public ResVo updBoard(@RequestBody BoardUpdDto dto) {  //@RequestBody
        int result = service.putBoard(dto);
        return new ResVo(result);
    }
}

