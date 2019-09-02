package com.maria.mvc.model.dao;

import java.util.List;

import com.maria.mvc.model.dto.BoardDto;

public interface BoardDao {

	String namespace="board.";
	
	public List<BoardDto> selectList();
	public BoardDto selectOne(String id);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(String id);
	
}
