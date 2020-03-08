package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdinfo.smarthome.rest.domain.RefrigeratorVo;
import com.sdinfo.smarthome.rest.domain.WaterMeterVo;
import com.sdinfo.smarthome.rest.service.WaterMeterService;




@Controller
@RequestMapping("/smarthome/watermeter/*")
public class WaterMeterController {
	
	@Autowired
	WaterMeterService waterMeterService; 
	
	// TBL_WATER_METER 조회
	@RequestMapping("/list")
	public @ResponseBody List<WaterMeterVo> selectQuery() throws Exception {
		
		List<WaterMeterVo> waterMeterVo = null; //조회한 데이터를 담을 객체 선언
		
		try {
			waterMeterVo = waterMeterService.getAllWaterMeter(); // WaterMeterService로 부터 getAllWaterMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return waterMeterVo;
	}
	
	// TBL_WATER_METER 삽입
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody WaterMeterVo insertQuery(
			@RequestBody WaterMeterVo waterMeterVo
			) throws Exception{
		
		try {
			waterMeterService.insertDataWaterMeter(waterMeterVo); // WaterMeterService로 부터 insertDataWaterMeter 메소드를 호출
			System.out.println("WaterMeterController : " + waterMeterVo.toString()); // waterMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return waterMeterVo;
	}
	
	// TBL_WATER_METER 수정
	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody WaterMeterVo updateQuery(
			@RequestBody WaterMeterVo waterMeterVo
			) throws Exception{
			
		try {
			waterMeterService.updateDataWaterMeter(waterMeterVo); // WaterMeterService로 부터 updateDataWaterMeter 메소드를 호출
			System.out.println("WaterMeterController : " + waterMeterVo.toString()); // waterMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
			
		return waterMeterVo;
		}
		
	// TBL_WATER_METER 삭제
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody WaterMeterVo deleteQuery(
				@RequestBody WaterMeterVo waterMeterVo
				) throws Exception{
			
		try {
			waterMeterService.deleteDataWaterMeter(waterMeterVo); // WaterMeterService로 부터 deleteDataWaterMeter 메소드를 호출
			System.out.println("WaterMeterController : " + waterMeterVo.toString()); // waterMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
			
		return waterMeterVo;
		}
	
}
