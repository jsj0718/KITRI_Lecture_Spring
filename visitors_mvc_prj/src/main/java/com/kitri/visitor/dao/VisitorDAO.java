package com.kitri.visitor.dao;

import java.util.ArrayList;

import com.kitri.visitor.vo.VisitorVO;

public interface VisitorDAO {
	public ArrayList<VisitorVO> selectVisitors();
	public int insertVisitor(VisitorVO vvo);
	public int updateVisitor(VisitorVO vvo);
	public int deleteVisitor(int vno);
}