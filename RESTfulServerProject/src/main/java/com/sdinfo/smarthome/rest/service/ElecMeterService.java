package com.sdinfo.smarthome.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sdinfo.smarthome.rest.domain.ElecMeterVo;
import com.sdinfo.smarthome.rest.mapper.ElecMeterMapper;



@Service
public class ElecMeterService {
	
	@Autowired
	ElecMeterMapper elecMeterMapper;
	
	/*TBL_ELEC_METER 조회 */
	public List<ElecMeterVo> getAllElecMeter() throws Exception {
		
		List<ElecMeterVo> elecMeterVo = null; // 조회한 데이터를 담을 객체 선언
		
		try {
			elecMeterVo = elecMeterMapper.getAllElecMeter(); // ElecMeterMeterMapper로 부터 getAllElecMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elecMeterVo;
	}
	
	/* TBL_ELEC_METER 삽입 */
	public ElecMeterVo insertDataElecMeter(ElecMeterVo elecMeterVo) throws Exception {
		
		try {
			elecMeterMapper.insertDataElecMeter(elecMeterVo); // ElecMeterMapper로 부터 insertDataElecMeter 메소드를 호출
			System.out.println("Service : " + elecMeterVo.toString()); // gasMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return elecMeterVo;
	}
	
	
	/* TBL_ELEC_METER 수정 */
	public ElecMeterVo updateDataElecMeter(ElecMeterVo elecMeterVo) throws Exception {
		
		try {
			elecMeterMapper.updateDataElecMeter(elecMeterVo); // ElecMeterMapper로 부터 updateDataElecMeter 메소드를 호출
			System.out.println("Service : " + elecMeterVo.toString()); // elecMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return elecMeterVo;
	}
	
	
	/* TBL_ELEC_METER 삭제 */
	public ElecMeterVo deleteDataElecMeter(ElecMeterVo elecMeterVo) throws Exception {
		
		try {
			elecMeterMapper.deleteDataElecMeter(elecMeterVo); // ElecMeterMapper로 부터 deleteDataElecMeter 메소드를 호출
			System.out.println("Service : " + elecMeterVo.toString()); // elecMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return elecMeterVo;
	}

}
