package com.study.board.service;

import com.study.board.domain.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write (Board board) {

        boardRepository.save(board);

    }

    // 게시글 리스트 처리하는 곳

    public Page<Board> boardList(Pageable pageable){

        return boardRepository.findAll(pageable);
    }

    public Board boardView(Long id){

        return boardRepository.findById(id).get();
    }

    public void boardDelete(long id){

        boardRepository.deleteById(id);
    }
}
