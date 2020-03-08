package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sdinfo.smarthome.rest.domain.HomecamEventVo;
import com.sdinfo.smarthome.rest.service.HomecamEventService;




@Controller
@RequestMapping("/smarthome/homecamevent/*")
public class HomecamEventController {
	
	@Autowired
	HomecamEventService homecamEventService; 
	
	/* TBL_HOMECAM_EVENT 조회 */
	@RequestMapping("/list")
	public @ResponseBody List<HomecamEventVo> selectQuery() throws Exception {
		
		List<HomecamEventVo> homecamEventVo = null; //조회한 데이터를 담을 객체 선언
		
		try {
			homecamEventVo = homecamEventService.getAllHomecamEvent(); // HomecamEventService로 부터 getAllWaterMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return homecamEventVo;
	}
	
	/* TBL_HOMECAM_EVENT 삽입 */
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody HomecamEventVo insertQuery(
			@RequestBody HomecamEventVo homecamEventVo
			) throws Exception{
		
		try {
			homecamEventService.insertDataHomecamEvent(homecamEventVo); // HomecamEventService로 부터 insertDataHomecamEvent 메소드를 호출
			System.out.println("HomecamEventController : " + homecamEventVo.toString()); // homecamEventVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return homecamEventVo;
	}
	
	/* TBL_HOMECAM_EVENT 수정 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody HomecamEventVo updateQuery(
			@RequestBody HomecamEventVo homecamEventVo
			) throws Exception{
		
		try {
			homecamEventService.updateDataHomecamEvent(homecamEventVo); // HomecamEventService로 부터 updateDataHomecamEvent 메소드를 호출
			System.out.println("HomecamEventController : " + homecamEventVo.toString()); // homecamEventVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return homecamEventVo;
	}
	
	/* TBL_HOMECAM_EVENT 삭제 */
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody HomecamEventVo deleteQuery(
			@RequestBody HomecamEventVo homecamEventVo
			) throws Exception{
		
		try {
			homecamEventService.deleteDataHomecamEvent(homecamEventVo); // HomecamEventService로 부터 deleteDataHomecamEvent 메소드를 호출
			System.out.println("HomecamEventController : " + homecamEventVo.toString()); // homecamEventVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return homecamEventVo;
	}
	
}
