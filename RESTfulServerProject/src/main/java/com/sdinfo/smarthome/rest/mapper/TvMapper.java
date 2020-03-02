package com.sdinfo.smarthome.rest.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.domain.TvVo;



public interface TvMapper {
	
	public List<TvVo> getAllTv() throws Exception;
	
	public void insertDataTv(TvVo TvVo) throws Exception;
	
}
