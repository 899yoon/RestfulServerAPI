package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sdinfo.smarthome.rest.domain.RefrigeratorVo;
import com.sdinfo.smarthome.rest.service.RefrigeratorService;




@Controller
@RequestMapping("/smarthome/refrigerator/*")
public class RefrigeratorController {
	
	@Autowired
	RefrigeratorService refrigeratorService;
	
	// TBL_REFRIGERATOR 조회
	@RequestMapping("/list")
	public @ResponseBody List<RefrigeratorVo> selectQuery() throws Exception {
		
		List<RefrigeratorVo> refrigeratorVo = null; //조회한 데이터를 담을 객체
		
		try {
			refrigeratorVo = refrigeratorService.getAllRefrigerator(); // RefrigeratorService로 부터 getAllRefrigerator 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refrigeratorVo;
	}
	
	// TBL_REFRIGERATOR 삽입
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody RefrigeratorVo insertQuery(
			@RequestBody RefrigeratorVo refrigeratorVo
			) throws Exception{
		
		try {
			refrigeratorService.insertDataRefrigerator(refrigeratorVo); // RefrigeratorService로 부터 insertDataRefrigerator 메소드를 호출
			System.out.println(refrigeratorVo.toString()); // RefrigeratorVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return refrigeratorVo;
	}
	
	// TBL_REFRIGERATOR 수정
	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody RefrigeratorVo updateQuery(
			@RequestBody RefrigeratorVo refrigeratorVo
			) throws Exception{
		
		try {
			refrigeratorService.updateDataRefrigerator(refrigeratorVo); // RefrigeratorService로 부터 updateDataRefrigerator 메소드를 호출
			System.out.println(refrigeratorVo.toString()); // RefrigeratorVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return refrigeratorVo;
	}
	
	// TBL_REFRIGERATOR 삭제
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody RefrigeratorVo deleteQuery(
			@RequestBody RefrigeratorVo refrigeratorVo
			) throws Exception{
		
		try {
			refrigeratorService.deleteDataRefrigerator(refrigeratorVo); // RefrigeratorService로 부터 deleteDataRefrigerator 메소드를 호출
			System.out.println(refrigeratorVo.toString()); // RefrigeratorVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return refrigeratorVo;
	}
	
}
