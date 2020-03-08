package com.sdinfo.smarthome.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sdinfo.smarthome.rest.domain.TvVo;
import com.sdinfo.smarthome.rest.mapper.TvMapper;



@Service
public class TvService {
	
	@Autowired
	TvMapper tvMapper;
	
	// TBL_TV 조회
	public List<TvVo> getAllTv() throws Exception {
		
		List<TvVo> tvVo = null; // 조회한 데이터를 담을 객체 선언
		
		try {
			tvVo = tvMapper.getAllTv(); // TvMapper로 부터 getAllTv 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tvVo;
	}
	
	// TBL_TV 삽입
	public TvVo insertDataTv(TvVo tvVo) throws Exception {
		
		try {
			tvMapper.insertDataTv(tvVo); // TvMapper로 부터 insertDataTv 메소드를 호출
			System.out.println("tvService : " + tvVo.toString()); // tvVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tvVo;
	}
	
	// TBL_TV 수정
	public TvVo updateDataTv(TvVo tvVo) throws Exception {
		
		try {
			tvMapper.updateDataTv(tvVo); // TvMapper로 부터 updateDataTv 메소드를 호출
			System.out.println("tvService : " + tvVo.toString()); // tvVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tvVo;
	}

	// TBL_TV 삭제
	public TvVo deleteDataTv(TvVo tvVo) throws Exception {
	
	try {
		tvMapper.deleteDataTv(tvVo); // TvMapper로 부터 deleteDataTv 메소드를 호출
		System.out.println("tvService : " + tvVo.toString()); // tvVo 객체에 담긴 데이터 확인
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return tvVo;
}

}
