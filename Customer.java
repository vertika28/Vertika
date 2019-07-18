package bean;

public class Customer {
	private int customerid;
	private String customerType;
	private String customerName;
	private String favouriteroute;
	
	public int getCustomerid() {
		return customerid;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFavouriteroute() {
		return favouriteroute;
	}

	public void setFavouriteroute(String favouriteroute) {
		this.favouriteroute = favouriteroute;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	

}
