package com.sdinfo.smarthome.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.domain.GasMeterVo;
import com.sdinfo.smarthome.rest.domain.WaterMeterVo;
import com.sdinfo.smarthome.rest.mapper.WaterMeterMapper;



@Service
public class WaterMeterService {
	
	@Autowired
	WaterMeterMapper waterMeterMapper;
	
	// TBL_WATER_METER 조회
	public List<WaterMeterVo> getAllWaterMeter() throws Exception {
		
		List<WaterMeterVo> waterMeterVo = null; // 조회한 데이터를 담을 객체 선언
		
		try {
			waterMeterVo = waterMeterMapper.getAllWaterMeter(); // WaterMeterMapper로 부터 getAllWaterMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return waterMeterVo;
	}
	
	// TBL_WATER_METER 삽입
	public WaterMeterVo insertDataWaterMeter(WaterMeterVo waterMeterVo) throws Exception {
		
		try {
			waterMeterMapper.insertDataWaterMeter(waterMeterVo); // WaterMeterMapper로 부터 insertDataWaterMeter 메소드를 호출
			System.out.println("WaterMeterService : " + waterMeterVo.toString()); // waterMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return waterMeterVo;
	}
	
	// TBL_WATER_METER 삽입
	public WaterMeterVo updateDataWaterMeter(WaterMeterVo waterMeterVo) throws Exception {
			
		try {
			waterMeterMapper.updateDataWaterMeter(waterMeterVo); // WaterMeterMapper로 부터 updateDataWaterMeter 메소드를 호출
			System.out.println("WaterMeterService : " + waterMeterVo.toString()); // waterMeterVo 객체에 담긴 데이터 확인
				
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return waterMeterVo;
		}
		
	// TBL_WATER_METER 삽입
	public WaterMeterVo deleteDataWaterMeter(WaterMeterVo waterMeterVo) throws Exception {
			
		try {
			waterMeterMapper.deleteDataWaterMeter(waterMeterVo); // WaterMeterMapper로 부터 deleteDataWaterMeter 메소드를 호출
			System.out.println("WaterMeterService : " + waterMeterVo.toString()); // waterMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return waterMeterVo;
		}
	
}
