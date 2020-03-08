package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdinfo.smarthome.rest.domain.ElecMeterVo;
import com.sdinfo.smarthome.rest.service.ElecMeterService;


@Controller
@RequestMapping("/smarthome/elecmeter/*")
public class ElecMeterController {
	
	@Autowired
	ElecMeterService elecMeterService;
	
	/* TBL_ELEC_METER 조회 */
	@RequestMapping("/list")
	public @ResponseBody List<ElecMeterVo> selectQuery() throws Exception {
		
		List<ElecMeterVo> elecMeterVo = null; //조회한 데이터를 담을 객체 선언
		
		try {
			elecMeterVo = elecMeterService.getAllElecMeter(); // ElecMeterService로 부터 getAllElecMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elecMeterVo;
	}
	
	
	/* TBL_ELEC_METER 삽입 */
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ElecMeterVo insertQuery(
			@RequestBody ElecMeterVo elecMeterVo
			) throws Exception{
		
		try {
			elecMeterService.insertDataElecMeter(elecMeterVo); // ElecMeterService로 부터 insertDataElecMeter 메소드를 호출
			System.out.println(elecMeterVo.toString()); // waterMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return elecMeterVo;
	}
	
	
	/* TBL_ELEC_METER 수정 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ElecMeterVo updateQuery(
			@RequestBody ElecMeterVo elecMeterVo
			) throws Exception{
		
		try {
			elecMeterService.updateDataElecMeter(elecMeterVo); // ElecMeterService로 부터 updateDataElecMeter 메소드를 호출
			System.out.println(elecMeterVo.toString()); // elecMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return elecMeterVo;
	}
	
	
	/* TBL_ELEC_METER 삭제 */
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ElecMeterVo deleteQuery(
			@RequestBody ElecMeterVo elecMeterVo
			) throws Exception{
		
		try {
			elecMeterService.deleteDataElecMeter(elecMeterVo); // ElecMeterService로 부터 deleteDataElecMeter 메소드를 호출
			System.out.println(elecMeterVo.toString()); // elecMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return elecMeterVo;
	}
	
}
