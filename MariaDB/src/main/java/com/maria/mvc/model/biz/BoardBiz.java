package com.maria.mvc.model.biz;

import java.util.List;

import com.maria.mvc.model.dto.BoardDto;

public interface BoardBiz {

	public List<BoardDto> selectList();
	public BoardDto selectOne(String id);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(String id);
	
}
