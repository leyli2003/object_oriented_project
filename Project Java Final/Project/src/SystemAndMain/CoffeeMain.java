package SystemAndMain;

import GUI.MainFrameCoffee;

public class CoffeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeSys.readFromFile();
		MainFrameCoffee mainFr = new MainFrameCoffee();
		mainFr.setVisible(true);

	}

}
