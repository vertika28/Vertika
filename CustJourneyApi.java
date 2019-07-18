package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import bean.CustJourney;
import bean.Customer;
import resource.CustomerType;
import service.FareServiceImpl;
@Path("/api")
public class CustJourneyApi{
 	@POST
 	@Path("/addUser")
	public Response addUser(
		@FormParam("customerName") int customerName,
		@FormParam("customerType") String customerType,
		@FormParam("favouriteroute") String favouriteroute) {
 
 		
FareServiceImpl fareServiceImpl= new FareServiceImpl();
		
		//To add customer
		Customer customer= new Customer();
		customer.setCustomerName("Cust XYZ");
		customer.setCustomerType(customerType);
		customer.setFavouriteroute(favouriteroute);
		
		Integer customerId=fareServiceImpl.createnewUser(customer);
		System.out.println("Customer created with customer id: "+ customerId);
			
		return Response.status(200)
			.entity(" Customer added successfuly!<br> customer: "+customerId)
			.build();
 	}
 	
 	@Path("/addJourney")
	public Response addJourney(
		@FormParam("customerId") int customerId,
		@FormParam("journeyStartDatTime") String setJourneyStartDatTime,
		@FormParam("routename") String routename) {
 		
 		FareServiceImpl fareServiceImpl= new FareServiceImpl();
 		
 		// To add Journey
		CustJourney cJourney= new CustJourney();
		cJourney.setCustomerid(customerId);
		
	
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		Date date = formatter.parse(setJourneyStartDatTime);
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		
		cJourney.setJourneyStartDatTime(calender);
		cJourney.setRoutename(routename);
		
 		Double fare=fareServiceImpl.addJourney(cJourney);
		System.out.println("Journey added and fare is: "+ fare);
		
		return Response.status(200)
			.entity("Journey added and fare is: "+fare)
			.build();
 	}
}