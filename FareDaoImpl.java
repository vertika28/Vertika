package dao;

import bean.CustJourney;
import bean.Customer;


public class FareDaoImpl {
	public Integer createnewUser(Customer customer) {
		Integer userId=null;
		
		
		// DB Persistence goes here
		/** 
		 *  Can use JDBC or Hibernate for persistence
		**/
		
		// Return successful customer creation status, if creation was successful.
		
		//Taking dummy status
		userId=1234;
		
		return userId;
		
	}
	
	public Customer getCustomer(int customerId) {
		Customer customer=null;
		
		
		// DB fetch goes here
		/** Select query is below
		 
		 select * from customer where customer_Id= : cust_id ;
		 
		**/	

		//Taking dummy customer
		customer= new Customer();
		customer.setCustomerid(customerId);
		customer.setCustomerName("Cust XYZ");
		customer.setCustomerType("VIP");
		customer.setFavouriteroute("Route-1");
		
		return customer;
		
	}
	public int getJourneyCount(int customerId) {
		
		int count=0;
		
		// DB fetch goes here
		// Query can be used on table consider journey which will contain columns
		// customer_Id, route_name, journey_date_time
		
		/** Select query is below
		 
		 select count(route_name) from journey where customer_Id= : cust_id and route_name= :route_name
		 and journey_date_time>= (sysdate-48);
		 
		 Then can set the value to variable count
		**/		 	
		//Taking dummy customer
		count=3;
		
		return count;
		
	}
	
	public Double saveJourney(CustJourney custJourney, double fare) {
		
		Double price=null;
		
		
		// DB Persistence goes here
		/** 
		 *  Can use JDBC or Hibernate for persistence to save journey and price
		**/
		
		// Return successful customer creation status, if creation was successful.
		
		//Taking dummy status
		price=fare;
		
		return price;
		
	}

}
