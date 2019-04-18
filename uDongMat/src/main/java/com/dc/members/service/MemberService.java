package com.dc.members.service;

import java.util.List;
import java.util.Map;

import com.dc.members.vo.MemberVo;


public interface MemberService {
	
	public List<MemberVo> memberSelectList();					//회원보기 
	
	public MemberVo memberSelectOne(int memberNo);				//회원 한명보기
	public MemberVo memberExist(Map<String, Object> paramMap);	
	
	public int memberUpdateOne(MemberVo memberVo);				//회원 수정하기
}	
