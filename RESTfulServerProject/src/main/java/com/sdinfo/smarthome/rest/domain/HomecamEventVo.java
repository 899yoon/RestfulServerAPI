package com.sdinfo.smarthome.rest.domain;

public class HomecamEventVo {
	private String home_code;
	private String mdate;
	private String camera_id;
	private int event;
	private String rdate;
	
	
	public String getHome_code() {
		return home_code;
	}
	public void setHome_code(String home_code) {
		this.home_code = home_code;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	public String getCamera_id() {
		return camera_id;
	}
	public void setCamera_id(String camera_id) {
		this.camera_id = camera_id;
	}
	public int getEvent() {
		return event;
	}
	public void setEvent(int event) {
		this.event = event;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	@Override
	public String toString() {
		return "HomecamEventVo [home_code=" + home_code + ", mdate=" + mdate + ", camera_id=" + camera_id + ", event="
				+ event + ", rdate=" + rdate + "]";
	}	
}
