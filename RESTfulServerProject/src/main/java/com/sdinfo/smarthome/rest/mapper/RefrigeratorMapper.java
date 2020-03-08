package com.sdinfo.smarthome.rest.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.domain.RefrigeratorVo;

public interface RefrigeratorMapper {
	
	// 조회
	public List<RefrigeratorVo> getAllRefrigerator() throws Exception;
	
	// 삽입
	public void insertDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception;
	
	// 수정
	public void updateDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception;
	
	// 삭제
	public void deleteDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception;
	
}
