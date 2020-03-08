package com.sdinfo.smarthome.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.domain.RefrigeratorVo;
import com.sdinfo.smarthome.rest.mapper.RefrigeratorMapper;



@Service
public class RefrigeratorService {
	
	@Autowired
	RefrigeratorMapper refrigeratorMapper;
	
	// TBL_REFRIGERATOR 조회
	public List<RefrigeratorVo> getAllRefrigerator() throws Exception {
		
		List<RefrigeratorVo> refrigeratorVo = null; // 조회한 데이터를 담을 객체 선언
		
		try {
			refrigeratorVo = refrigeratorMapper.getAllRefrigerator(); // RefrigeratorMapper로 부터 getAllRefrigerator 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refrigeratorVo;
	}
	
	// TBL_REFRIGERATOR 삽입
	public RefrigeratorVo insertDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception {
		
		try {
			refrigeratorMapper.insertDataRefrigerator(refrigeratorVo); // RefrigeratorMapper로 부터 insertDataRefrigerator 메소드를 호출
			System.out.println(refrigeratorVo.toString()); // refrigeratorVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return refrigeratorVo;
	}
	
	//  TBL_REFRIGERATOR 수정
	public RefrigeratorVo updateDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception {
		
		try {
			refrigeratorMapper.updateDataRefrigerator(refrigeratorVo); // RefrigeratorMapper로 부터 updateDataRefrigerator 메소드를 호출
			System.out.println(refrigeratorVo.toString()); // refrigeratorVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return refrigeratorVo;
	}

	// TBL_REFRIGERATOR 삭제
	public RefrigeratorVo deleteDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception {
	
		try {
			refrigeratorMapper.deleteDataRefrigerator(refrigeratorVo); // RefrigeratorMapper로 부터 deleteDataRefrigerator 메소드를 호출
			System.out.println(refrigeratorVo.toString()); // refrigeratorVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return refrigeratorVo;
	}

}
