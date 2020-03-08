package com.sdinfo.smarthome.rest.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.domain.HomecamEventVo;

public interface HomecamEventMapper {
	
	public List<HomecamEventVo> getAllHomecamEvent() throws Exception; // 조회
	
	public void insertDataHomecamEvent(HomecamEventVo homecamEventVo) throws Exception; // 삽입
	
	public void updateDataHomecamEvent(HomecamEventVo homecamEventVo) throws Exception; // 수정
	
	public void deleteDataHomecamEvent(HomecamEventVo homecamEventVo) throws Exception; // 수정
	
}
