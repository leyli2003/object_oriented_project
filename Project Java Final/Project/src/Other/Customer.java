package Other;

public class Customer {
	private String customerName;
	private int customerID;
	private int customerPoints;
	private static int CUSTOMER_ID_AUTO = 1011;

	public Customer(String customerName, int customerID, int customerPoints) {
		super();
		this.customerName = customerName;
		this.customerID = customerID;
		this.customerPoints = customerPoints;
	}

	public Customer(String customerName, int customerPoints) {
		super();
		this.customerName = customerName;
		this.customerPoints = customerPoints;
		this.customerID = CUSTOMER_ID_AUTO;
		CUSTOMER_ID_AUTO++;
	}

	@Override
	public String toString() {
		return "Customer Name: " + customerName + "\nCustomer ID: " + customerID + "\nCustomer Points: "
				+ customerPoints + "\n";
	}

	public int getCustomerPoints() {
		return customerPoints;
	}

	public void setCustomerPoints(int customerPoints) {
		this.customerPoints = customerPoints;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

}
