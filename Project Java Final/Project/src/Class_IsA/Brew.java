package Class_IsA;

import Other.Bean;

public class Brew extends Coffee {
	private String brewType;

	public Brew(int orderId, String customerName, String coffeeName, String size, String coffeType, Bean beanType,
			String temperture, String brewType) {
		super(orderId, customerName, coffeeName, size, coffeType, beanType, temperture);
		// TODO Auto-generated constructor stub
		this.brewType = brewType;
	}

	@Override
	public void calculatePrice(int usedCustPoints) {
		int price = 0;
		// TODO Auto-generated method stub
		if (Size.equalsIgnoreCase("small"))
			price = BASEPRICE_SMALL;
		else if (Size.equalsIgnoreCase("medium"))
			price = BASEPRICE_MEDIUM;
		else
			price = BASEPRICE_LARGE;

		if (brewType.equalsIgnoreCase("V60")) {
			price += 22.5;
		} else if (brewType.equalsIgnoreCase("Chemex")) {
			price += 27.5;
		} else {
			price += 30;
		}

		this.drinkPrice = price - usedCustPoints / 10;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nBrew Type: " + brewType + "\nDrink Price: " + drinkPrice + "\n";
	}

	@Override
	public int earnedCustomerPoints() {
		// TODO Auto-generated method stub
		return (int) (drinkPrice / 3);
	}

}
