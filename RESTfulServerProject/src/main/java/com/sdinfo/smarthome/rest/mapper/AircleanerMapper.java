package com.sdinfo.smarthome.rest.mapper;

import java.util.List;
import com.sdinfo.smarthome.rest.domain.AircleanerVo;


public interface AircleanerMapper {
	
	// 조회
	public List<AircleanerVo> getAllAircleaner() throws Exception;
	
	// 삽입
	public void insertDataAircleaner(AircleanerVo aircleanerVo) throws Exception;
	
	// 수정
	public void updateDataAircleaner(AircleanerVo aircleanerVo) throws Exception;
		
	// 삭제
	public void deleteDataAircleaner(AircleanerVo aircleanerVo) throws Exception;
}
