package com.sdinfo.smarthome.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sdinfo.smarthome.rest.domain.TvVo;
import com.sdinfo.smarthome.rest.service.TvService;




@Controller
@RequestMapping("/smarthome/tv/*")
public class TvController {
	
	@Autowired
	TvService tvService; 
	
	// TBL_TV 조회
	@RequestMapping("/list")
	public @ResponseBody List<TvVo> selectQuery() throws Exception {
		
		List<TvVo> tvVo = null; //조회한 데이터를 담을 객체 선언
		
		try {
			tvVo = tvService.getAllTv(); // TvService로 부터 getAllAircleaner 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tvVo;
	}
	
	// TBL_TV 삽입
	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody TvVo insertQuery(
			@RequestBody TvVo tvVo
			) throws Exception{
		
		try {
			tvService.insertDataTv(tvVo); // TvService로 부터 insertDataTv 메소드를 호출
			System.out.println("tvController : " + tvVo.toString()); // tvVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return tvVo;
	}
	
	// TBL_TV 수정
	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody TvVo updateQuery(
			@RequestBody TvVo tvVo
			) throws Exception{
		
		try {
			tvService.updateDataTv(tvVo); // TvService로 부터 updateDataTv 메소드를 호출
			System.out.println("tvController : " + tvVo.toString()); // tvVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return tvVo;
	}
	
	
	// TBL_TV 삭제
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody TvVo deleteQuery(
			@RequestBody TvVo tvVo
			) throws Exception{
		
		try {
			tvService.deleteDataTv(tvVo); // TvService로 부터 deleteDataTv 메소드를 호출
			System.out.println("tvController : " + tvVo.toString()); // tvVo 객체에 담긴 데이터 확인
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		return tvVo;
	}
	
}
