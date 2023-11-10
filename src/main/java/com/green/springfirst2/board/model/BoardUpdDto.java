package com.green.springfirst2.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardUpdDto {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
}
