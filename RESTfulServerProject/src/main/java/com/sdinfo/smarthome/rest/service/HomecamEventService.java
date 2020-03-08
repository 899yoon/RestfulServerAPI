package com.sdinfo.smarthome.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sdinfo.smarthome.rest.domain.HomecamEventVo;
import com.sdinfo.smarthome.rest.mapper.HomecamEventMapper;



@Service
public class HomecamEventService {
	
	@Autowired
	HomecamEventMapper homecamEventMapper;
	
	/*TBL_HOMECAM_EVENT 조회 */
	public List<HomecamEventVo> getAllHomecamEvent() throws Exception {
		
		List<HomecamEventVo> homecamEventVo = null; // 조회한 데이터를 담을 객체 선언
		
		try {
			homecamEventVo = homecamEventMapper.getAllHomecamEvent(); // WaterMeterMapper로 부터 getAllWaterMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return homecamEventVo;
	}
	
	/*TBL_HOMECAM_EVENT 삽입 */
	public HomecamEventVo insertDataHomecamEvent(HomecamEventVo homecamEventVo) throws Exception {
		
		try {
			homecamEventMapper.insertDataHomecamEvent(homecamEventVo); // HomecamEventMapper로 부터 insertDataHomecamEvent 메소드를 호출
			System.out.println("HomecamEventService : " + homecamEventVo.toString()); // homecamEventVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return homecamEventVo;
	}
	
	/*TBL_HOMECAM_EVENT 수정 */
	public HomecamEventVo updateDataHomecamEvent(HomecamEventVo homecamEventVo) throws Exception {
		
		try {
			homecamEventMapper.updateDataHomecamEvent(homecamEventVo); // HomecamEventMapper로 부터 updateDataHomecamEvent 메소드를 호출
			System.out.println("HomecamEventService : " + homecamEventVo.toString()); // homecamEventVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return homecamEventVo;
	}
	
	/*TBL_HOMECAM_EVENT 삭제 */
	public HomecamEventVo deleteDataHomecamEvent(HomecamEventVo homecamEventVo) throws Exception {
		
		try {
			homecamEventMapper.deleteDataHomecamEvent(homecamEventVo); // HomecamEventMapper로 부터 deleteDataHomecamEvent 메소드를 호출
			System.out.println("HomecamEventService : " + homecamEventVo.toString()); // homecamEventVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return homecamEventVo;
	}

}
