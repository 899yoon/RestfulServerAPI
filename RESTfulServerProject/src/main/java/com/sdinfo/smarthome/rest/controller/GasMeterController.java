package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdinfo.smarthome.rest.domain.GasMeterVo;
import com.sdinfo.smarthome.rest.service.GasMeterService;




@Controller
@RequestMapping("/smarthome/gasmeter/*")
public class GasMeterController {
	
	@Autowired
	GasMeterService gasMeterService; 
	
	/* TBL_GAS_METER 조회 */
	@RequestMapping("/list")
	public @ResponseBody List<GasMeterVo> selectQuery() throws Exception {
		
		List<GasMeterVo> gasMeterVo = null; //조회한 데이터를 담을 객체 선언
		
		try {
			gasMeterVo = gasMeterService.getAllGasMeter(); // GasMeterService로 부터 getAllGasMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gasMeterVo;
	}
	
	/* TBL_GAS_METER 삽입 */
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody GasMeterVo insertQuery(
			@RequestBody GasMeterVo gasMeterVo
			) throws Exception{
		
		try {
			gasMeterService.insertDataGasMeter(gasMeterVo); // GasMeterService로 부터 insertDataGasMeter 메소드를 호출
			System.out.println("Controller : " + gasMeterVo.toString()); // gasMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return gasMeterVo;
	}
	
	/* TBL_GAS_METER 수정 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody GasMeterVo updateQuery(
			@RequestBody GasMeterVo gasMeterVo
			) throws Exception{
		
		try {
			gasMeterService.updateDataGasMeter(gasMeterVo); // GasMeterService로 부터 updateDataGasMeter 메소드를 호출
			System.out.println("Controller : " + gasMeterVo.toString()); // gasMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return gasMeterVo;
	}
	
	/* TBL_GAS_METER 삭제 */
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody GasMeterVo deleteQuery(
			@RequestBody GasMeterVo gasMeterVo
			) throws Exception{
		
		try {
			gasMeterService.deleteDataGasMeter(gasMeterVo); // GasMeterService로 부터 deleteDataGasMeter 메소드를 호출
			System.out.println("Controller : " + gasMeterVo.toString()); // gasMeterVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return gasMeterVo;
	}
	
}