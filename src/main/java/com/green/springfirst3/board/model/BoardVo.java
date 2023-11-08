package com.green.springfirst3.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVo {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAt;
}
