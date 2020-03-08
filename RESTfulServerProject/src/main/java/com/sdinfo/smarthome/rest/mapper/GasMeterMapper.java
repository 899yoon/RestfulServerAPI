package com.sdinfo.smarthome.rest.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.domain.GasMeterVo;


public interface GasMeterMapper {
	
	public List<GasMeterVo> getAllGasMeter() throws Exception; // 조회
	
	public void insertDataGasMeter(GasMeterVo gasMeterVo) throws Exception; // 삽입
	
	public void updateDataGasMeter(GasMeterVo gasMeterVo) throws Exception; // 수정
	
	public void deleteDataGasMeter(GasMeterVo gasMeterVo) throws Exception; // 삭제
	
}
