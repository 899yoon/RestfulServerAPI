package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sdinfo.smarthome.rest.domain.TvVo;
import com.sdinfo.smarthome.rest.service.TvService;




@Controller
@RequestMapping("/smarthome/tv/*")
public class TvController {
	
	@Autowired
	TvService tvService; 
	
	@RequestMapping("/list")
	public @ResponseBody List<TvVo> selectQuery() throws Exception {
		
		List<TvVo> tvVo = null;
		
		try {
			tvVo = tvService.getAllTv();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tvVo;
	}
	
//	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
//	public @ResponseBody RefrigeratorVo insertQuery(
//			@RequestBody RefrigeratorVo refrigeratorVo
//			) throws Exception{
//		
//		try {
//			tvService.insertDataTv(refrigeratorVo);
//			System.out.println(refrigeratorVo.toString());
//		} catch (Exception e) {
//			 e.printStackTrace();
//		}
//		
//		return refrigeratorVo;
//	}
	
}
