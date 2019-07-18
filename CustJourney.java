package bean;

import java.util.Calendar;

public class CustJourney {
	private int customerid;
	private Calendar journeyStartDatTime;
	private String routename;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getRoutename() {
		return routename;
	}
	public void setRoutename(String routename) {
		this.routename = routename;
	}
	public Calendar getJourneyStartDatTime() {
		return journeyStartDatTime;
	}
	public void setJourneyStartDatTime(Calendar journeyStartDatTime) {
		this.journeyStartDatTime = journeyStartDatTime;
	}
	
	
}
