package com.dc.members.dao;

import java.util.List;
import java.util.Map;

import com.dc.members.vo.MemberVo;

public interface MemberDao {

	public List<MemberVo> memberSelectList();					//회원 전체보기 
	
	public MemberVo memberSelectOne(int memberNo);				//회원 상세보기
	public MemberVo memberExist(Map<String, Object> paramMap);	
	
	public int memberUpdateOne(MemberVo memberVo);				//회원 수정
}
