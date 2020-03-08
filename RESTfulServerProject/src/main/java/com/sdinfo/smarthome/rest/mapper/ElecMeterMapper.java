package com.sdinfo.smarthome.rest.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.domain.ElecMeterVo;


public interface ElecMeterMapper {
	
	public List<ElecMeterVo> getAllElecMeter() throws Exception; // 조회
	
	public void insertDataElecMeter(ElecMeterVo elecMeterVo) throws Exception; // 삽입
	
	public void updateDataElecMeter(ElecMeterVo elecMeterVo) throws Exception; // 수정
	
	public void deleteDataElecMeter(ElecMeterVo elecMeterVo) throws Exception; // 삭제
	
}
