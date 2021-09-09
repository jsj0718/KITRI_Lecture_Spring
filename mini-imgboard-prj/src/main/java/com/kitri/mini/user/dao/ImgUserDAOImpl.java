package com.kitri.mini.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kitri.mini.user.vo.ImgUserVO;

@Repository
public class ImgUserDAOImpl implements ImgUserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ImgUserVO selectImgUser(ImgUserVO iuvo) {
		
		return sqlSession.selectOne("img_user.selectImgUser", iuvo);
	}

	@Override
	public int insertImgUser(ImgUserVO iuvo) {
		
		return sqlSession.insert("img_user.insertImgUser", iuvo);
	}

	@Override
	public int selectIdCheck(String id) {
		return sqlSession.selectOne("img_user.selectIdCheck", id);
	}
}
