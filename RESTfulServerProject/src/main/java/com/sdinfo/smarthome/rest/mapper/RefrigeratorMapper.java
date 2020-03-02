package com.sdinfo.smarthome.rest.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.domain.RefrigeratorVo;

public interface RefrigeratorMapper {
	
	public List<RefrigeratorVo> getAllRefrigerator() throws Exception;
	
	public void insertDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception;
	
}
