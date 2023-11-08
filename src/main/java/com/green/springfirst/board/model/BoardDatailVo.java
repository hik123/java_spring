package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDatailVo {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAt;
}
