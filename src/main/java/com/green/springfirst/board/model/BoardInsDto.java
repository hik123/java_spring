package com.green.springfirst.board.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardInsDto {       // 제목 내용 작성자
    private String title;
    private String ctnts;
    private String writer;
}
