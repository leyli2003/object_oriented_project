package Class_IsA;

import Other.Bean;
import Other.CalculatePrice;

public abstract class Coffee implements CalculatePrice {
	protected String Size;
	protected String coffeType;
	protected Bean beanType;
	protected String temperture;
	protected String coffeeName;
	protected String customerName;
	protected int orderId;
	protected double drinkPrice = 0;
	protected static int BASEPRICE_SMALL = 40;
	protected static int BASEPRICE_MEDIUM = 50;
	protected static int BASEPRICE_LARGE = 60;

	public Coffee(int orderId, String customerName, String coffeeName, String size, String coffeType, Bean beanType,
			String temperture) {
		this.coffeeName = coffeeName;
		this.Size = size;
		this.customerName = customerName;
		this.coffeType = coffeType;
		this.beanType = beanType;
		this.temperture = temperture;
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return customerName + "'s " + coffeeName + "\nSize: " + Size + "\nCoffeType: " + coffeType + "\nBeanType: "
				+ beanType + "\nTemperture: " + temperture + "\n";
	}

	public abstract int earnedCustomerPoints();

}
