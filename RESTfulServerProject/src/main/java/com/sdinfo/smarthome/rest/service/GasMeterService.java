package com.sdinfo.smarthome.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sdinfo.smarthome.rest.domain.GasMeterVo;
import com.sdinfo.smarthome.rest.mapper.GasMeterMapper;



@Service
public class GasMeterService {
	
	@Autowired
	GasMeterMapper gasMeterMapper;
	
	// TBL_GAS_METER 조회
	public List<GasMeterVo> getAllGasMeter() throws Exception {
		
		List<GasMeterVo> gasMeterVo = null; // 조회한 데이터를 담을 객체 선언
		
		try {
			gasMeterVo = gasMeterMapper.getAllGasMeter(); // GasMeterMapper로 부터 getAllGasMeter 메소드를 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gasMeterVo;
	}
	
	// TBL_GAS_METER 삽입
	public GasMeterVo insertDataGasMeter(GasMeterVo gasMeterVo) throws Exception {
		
		try {
			gasMeterMapper.insertDataGasMeter(gasMeterVo); // GasMeterMapper로 부터 insertDataGasMeter 메소드를 호출
			System.out.println("Service : " + gasMeterVo.toString()); // gasMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return gasMeterVo;
	}
	
	// TBL_GAS_METER 수정 
	public GasMeterVo updateDataGasMeter(GasMeterVo gasMeterVo) throws Exception {
		
		try {
			gasMeterMapper.updateDataGasMeter(gasMeterVo); // GasMeterMapper로 부터 insertDataGasMeter 메소드를 호출
			System.out.println("Service : " + gasMeterVo.toString()); // gasMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return gasMeterVo;
	}
	
	// TBL_GAS_METER 삭제
	public GasMeterVo deleteDataGasMeter(GasMeterVo gasMeterVo) throws Exception {
		
		try {
			gasMeterMapper.deleteDataGasMeter(gasMeterVo); // GasMeterMapper로 부터 deleteDataGasMeter 메소드를 호출
			System.out.println("Service : " + gasMeterVo.toString()); // gasMeterVo 객체에 담긴 데이터 확인
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return gasMeterVo;
	}

}
