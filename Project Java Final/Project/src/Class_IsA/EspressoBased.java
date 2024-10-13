package Class_IsA;

import Other.Bean;

public class EspressoBased extends Coffee {
	private String milkType;
	private String syrup;
	private int numberofShots;

	public EspressoBased(int orderId, String customerName, String coffeeName, String size, String coffeType,
			Bean beanType, String temperture, String milkType, String syrup, int noOfShots) {
		super(orderId, customerName, coffeeName, size, coffeType, beanType, temperture);
		this.milkType = milkType;
		this.syrup = syrup;
		this.numberofShots = noOfShots;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Milk Type: " + milkType + "\nSyrup: " + syrup + "\nDrink Price: " + drinkPrice;
	}

	@Override
	public void calculatePrice(int usedCustPoints) {
		// TODO Auto-generated method stub
		int price = 0;
		if (Size.equalsIgnoreCase("small"))
			price = BASEPRICE_SMALL;
		else if (Size.equalsIgnoreCase("medium"))
			price = BASEPRICE_MEDIUM;
		else
			price = BASEPRICE_LARGE;

		if (milkType.equalsIgnoreCase("Plant Based")) {
			price += 10;
		}

		if (!syrup.equalsIgnoreCase("No Syrup")) {
			price += 7.5;
		}

		price += 3 * (numberofShots - 2);
		this.drinkPrice = price - usedCustPoints / 10;

	}

	@Override
	public int earnedCustomerPoints() {
		// TODO Auto-generated method stub
		return (int) (drinkPrice / 4);
	}

}
