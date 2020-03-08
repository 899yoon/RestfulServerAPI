package com.sdinfo.smarthome.rest.mapper;

import java.util.List;
import com.sdinfo.smarthome.rest.domain.WaterMeterVo;


public interface WaterMeterMapper {
	
	// 조회
	public List<WaterMeterVo> getAllWaterMeter() throws Exception;
	
	// 삽입
	public void insertDataWaterMeter(WaterMeterVo waterMeterVo) throws Exception;
	
	// 수정
	public void updateDataWaterMeter(WaterMeterVo waterMeterVo) throws Exception;
	
	// 삭제
	public void deleteDataWaterMeter(WaterMeterVo waterMeterVo) throws Exception;
	
}
