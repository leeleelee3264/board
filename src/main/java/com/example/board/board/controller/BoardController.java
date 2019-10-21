package com.example.board.board.controller;

import com.example.board.board.dto.BoardDto;
import com.example.board.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("board/openBoardList.do")
    public ModelAndView openBoardList() throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        List<BoardDto> list = boardService.selectBoardList();
        modelAndView.setViewName("boardList");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

}
