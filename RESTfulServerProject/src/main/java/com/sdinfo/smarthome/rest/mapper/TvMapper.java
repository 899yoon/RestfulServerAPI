package com.sdinfo.smarthome.rest.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.domain.TvVo;



public interface TvMapper {
	
	// 조회
	public List<TvVo> getAllTv() throws Exception;
	
	// 삽입
	public void insertDataTv(TvVo TvVo) throws Exception;
	
	// 수정
	public void updateDataTv(TvVo TvVo) throws Exception;
	
	// 삭제
	public void deleteDataTv(TvVo TvVo) throws Exception;
	
}
