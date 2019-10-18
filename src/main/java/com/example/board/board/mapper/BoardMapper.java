package com.example.board.board.mapper;

import com.example.board.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
@Mapper
public class BoardMapper {
    List<BoardDto> selectBoardList() throws Exception {

        return new ArrayList<BoardDto>();
    }
}
*/
@Repository
@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;

}
