package com.sdinfo.smarthome.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sdinfo.smarthome.rest.domain.AircleanerVo;
import com.sdinfo.smarthome.rest.mapper.AircleanerMapper;


@Service
public class AircleanerService {
	
	@Autowired
	AircleanerMapper aircleanerMapper;
	
	// TBL_AIRCLEANER 조회
	public List<AircleanerVo> getAllAircleaner() throws Exception {
		
		List<AircleanerVo> aircleanerVo = null; // 조회한 데이터를 담을 객체 선언
		
		try {
			aircleanerVo = aircleanerMapper.getAllAircleaner(); // AircleaneMapper로 부터 getAllAircleaner 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aircleanerVo;
	}
	
	// TBL_AIRCLEANER 삽입
	public AircleanerVo insertDataAircleaner(AircleanerVo aircleanerVo) throws Exception {
		
		try {
			aircleanerMapper.insertDataAircleaner(aircleanerVo); // AircleaneMapper로 부터 insertDataAircleaner 메소드를 호출
			System.out.println(aircleanerVo.toString()); // aircleanerVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return aircleanerVo;
	}
	
	// TBL_AIRCLEANER 수정
	public AircleanerVo updateDataAircleaner(AircleanerVo aircleanerVo) throws Exception {
		
		try {
			aircleanerMapper.updateDataAircleaner(aircleanerVo); // AircleaneMapper로 부터 updateDataAircleaner 메소드를 호출
			System.out.println(aircleanerVo.toString()); // aircleanerVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return aircleanerVo;
	}
	
	// TBL_AIRCLEANER 삭제
	public AircleanerVo deleteDataAircleaner(AircleanerVo aircleanerVo) throws Exception {
		
		try {
			aircleanerMapper.deleteDataAircleaner(aircleanerVo); // AircleaneMapper로 부터 deleteDataAircleaner 메소드를 호출
			System.out.println(aircleanerVo.toString()); // aircleanerVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return aircleanerVo;
	}

}
