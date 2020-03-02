package com.sdinfo.smarthome.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.domain.RefrigeratorVo;
import com.sdinfo.smarthome.rest.domain.TvVo;
import com.sdinfo.smarthome.rest.mapper.RefrigeratorMapper;
import com.sdinfo.smarthome.rest.mapper.TvMapper;



@Service
public class TvService {
	
	@Autowired
	TvMapper tvMapper;
	
	/*TBL_REFRIGERATOR SELECT */
	public List<TvVo> getAllTv() throws Exception {
		
		List<TvVo> tvVo = null;
		
		try {
			tvVo = tvMapper.getAllTv();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tvVo;
	}
	
	/* TBL_REFRIGERATOR INSERT */
//	public RefrigeratorVo insertDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception {
//		
//		try {
//			refrigeratorMapper.insertDataRefrigerator(refrigeratorVo);
//			System.out.println(refrigeratorVo.toString());
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return refrigeratorVo;
//	}

}
