package com.green.springfirst2.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardDatailVo {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAt;
}
