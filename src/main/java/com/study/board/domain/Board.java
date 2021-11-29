package com.study.board.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Board extends Timestamped{

    @Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


}

