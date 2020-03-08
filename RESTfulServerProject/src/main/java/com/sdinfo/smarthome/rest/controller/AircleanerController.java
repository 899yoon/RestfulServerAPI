package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sdinfo.smarthome.rest.domain.AircleanerVo;
import com.sdinfo.smarthome.rest.service.AircleanerService;




@Controller
@RequestMapping("/smarthome/aircleaner/*")
public class AircleanerController {
	
	@Autowired
	AircleanerService aircleanerService; 
	
	// TBL_AIRCLEANER 조회
	@RequestMapping("/list")
	public @ResponseBody List<AircleanerVo> selectQuery() throws Exception {
		
		List<AircleanerVo> aircleanerVo = null; //조회한 데이터를 담을 객체
		
		try {
			aircleanerVo = aircleanerService.getAllAircleaner(); // AircleanerService로 부터 getAllAircleaner 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aircleanerVo;
	}
	
	// TBL_AIRCLEANER 삽입
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody AircleanerVo insertQuery(
			@RequestBody AircleanerVo aircleanerVo
			) throws Exception{
		
		try {
			aircleanerService.insertDataAircleaner(aircleanerVo); // AircleanerService로 부터 insertDataAircleaner 메소드를 호출
			System.out.println(aircleanerVo.toString()); // aircleanerVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return aircleanerVo;
	}
	
	// TBL_AIRCLEANER 수정
	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody AircleanerVo updateQuery(
			@RequestBody AircleanerVo aircleanerVo
			) throws Exception{
		
		try {
			aircleanerService.updateDataAircleaner(aircleanerVo); // AircleanerService로 부터 updateDataAircleaner 메소드를 호출
			System.out.println(aircleanerVo.toString()); // aircleanerVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return aircleanerVo;
	}
	
	// TBL_AIRCLEANER 삭제
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody AircleanerVo deleteQuery(
			@RequestBody AircleanerVo aircleanerVo
			) throws Exception{
		
		try {
			aircleanerService.deleteDataAircleaner(aircleanerVo); // AircleanerService로 부터 deleteDataAircleaner 메소드를 호출
			System.out.println(aircleanerVo.toString()); // aircleanerVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return aircleanerVo;
	}
	
}
