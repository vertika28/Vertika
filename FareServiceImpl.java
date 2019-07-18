package service;

import bean.CustJourney;
import bean.Customer;
import dao.FareDaoImpl;


public class FareServiceImpl {

	public Integer createnewUser(Customer customer) {
		Integer userId=null;
		FareDaoImpl fareDaoImpl= new FareDaoImpl();
		
		userId=fareDaoImpl.createnewUser(customer);
		
		return userId;
		
	}
	
	public Double addJourney(CustJourney cJourney) {
		
		FareDaoImpl fareDaoImpl= new FareDaoImpl();
		Customer customer=fareDaoImpl.getCustomer(cJourney.getCustomerid());
		
		double fare=2;
		if(!customer.getCustomerType().equalsIgnoreCase(
				"PERSON NON GRATA")) {
			
			double pricePercent = (customer.getFavouriteroute()== cJourney.getRoutename()) ? 0.7:1;
			
			pricePercent-= ( fareDaoImpl.getJourneyCount(cJourney.getCustomerid())>2) ? pricePercent-0.1: pricePercent;
			
			if(customer.getCustomerType().equalsIgnoreCase("VIP")) {
				fare=1;
				fare= fare*pricePercent;
			}
			else {
				fare=2;
				fare= fare*pricePercent;
			}
		}
		Double finalPrice=new FareDaoImpl().saveJourney(cJourney, fare);
		return finalPrice;
	}
}
