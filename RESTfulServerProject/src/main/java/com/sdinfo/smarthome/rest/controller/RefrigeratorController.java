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
	
	@RequestMapping("/list")
	public @ResponseBody List<RefrigeratorVo> selectQuery() throws Exception {
		
		List<RefrigeratorVo> refrigeratorVo = null;
		
		try {
			refrigeratorVo = refrigeratorService.getAllRefrigerator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refrigeratorVo;
	}
	
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody RefrigeratorVo insertQuery(
			@RequestBody RefrigeratorVo refrigeratorVo
			) throws Exception{
		
		try {
			refrigeratorService.insertDataRefrigerator(refrigeratorVo);
			System.out.println(refrigeratorVo.toString());
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return refrigeratorVo;
	}
	
}
