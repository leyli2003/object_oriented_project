package SystemAndMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import Class_IsA.Coffee;
import Other.Customer;

public class CoffeeSys {
	private static HashMap<String, String[]> hmMenu = new HashMap();
	private static HashMap<Integer, Customer> hmCustomers = new HashMap();
	private static LinkedHashMap<Integer, Coffee> hmOrders = new LinkedHashMap();

	public static void readFromFile() {
		File f = new File("menu.txt");
		Scanner input = null;
		try {
			input = new Scanner(f);
			while (input.hasNext()) {
				String key = input.next().toString();
				String[] ingredients = input.nextLine().split(",");
				hmMenu.put(key, ingredients);
			}

			f = new File("customers.txt");
			input = new Scanner(f);
			String[] all = null;
			Customer c = null;

			while (input.hasNext()) {
				all = input.nextLine().split(" ");
				String nameSurname = all[1] + " " + all[2];
				int custId = Integer.parseInt(all[0]);
				int custPoints = Integer.parseInt(all[3]);
				c = new Customer(nameSurname, custId, custPoints);
				hmCustomers.put(custId, c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (input != null)
				input.close();
		}
	}

	public static boolean addCoffeeOrder(int orderId, Coffee coffeOrder) {

		if (hmOrders.get(orderId) == null) {
			hmOrders.put(orderId, coffeOrder);
			return true;
		}
		return false;
	}

	public static void addNewCustomer(String customerName, int CustomerPoints) {
		Customer c = new Customer(customerName, CustomerPoints);
		int customerId = c.getCustomerID();
		hmCustomers.put(customerId, c);
	}

	public static void updateCustomer(Customer c) {
		hmCustomers.put(c.getCustomerID(), c);
	}

	public static boolean addMenuItem(String itemName, String[] itemIngredients) throws IOException {
		String res = "";
		File f = new File("menu.txt");
		PrintWriter pw = null;
		if (hmMenu.get(itemName) == null) {
			pw = new PrintWriter(new FileWriter(f, true));
			hmMenu.put(itemName, itemIngredients);
			res += itemName + " ";
			for (int i = 0; i < itemIngredients.length; i++) {
				res += itemIngredients[i] + ",";
			}
			pw.println(res.substring(0, res.length() - 1) + "\n");
			pw.close();
			return true;
		}
		return false;
	}

	public static String displayAllOrders() {
		String res = "Orders: " + "\n";
		int i = 1;
		Set<Integer> keyId = hmOrders.keySet();
		Iterator<Integer> key = keyId.iterator();
		Coffee c = null;
		while (key.hasNext()) {
			int keyorderId = key.next();
			c = hmOrders.get(keyorderId);
			res += "\n\nOrder " + i + ": \n" + c;
			i++;
		}

		return res;
	}

	public static String displayCustomers() {
		String res = "Customers: " + "\n";
		Set<Integer> keyId = hmCustomers.keySet();
		Iterator<Integer> key = keyId.iterator();
		Customer cust = null;
		while (key.hasNext()) {
			int keyCustId = key.next();
			cust = hmCustomers.get(keyCustId);
			res += cust + "\n\n";
		}
		return res;
	}

	public static String displayMenu() {
		String res = "Menu: " + "\n";
		Set<String> keyId = hmMenu.keySet();
		Iterator<String> key = keyId.iterator();
		String[] ing = null;
		while (key.hasNext()) {
			String itemname = key.next();
			res += itemname + "\n";
			ing = hmMenu.get(itemname);
			for (int i = 0; i < ing.length; i++) {
				res += "\t" + ing[i] + "\n";
			}
		}

		return res;
	}

	public static String[] getMenuItems() {

		int i = 0;
		Set itemNames = hmMenu.keySet();
		Iterator<String> keys = itemNames.iterator();
		String[] allMenuItems = new String[itemNames.size()];
		while (keys.hasNext()) {
			allMenuItems[i] = keys.next().toString();
			i++;
		}

		return allMenuItems;
	}

	public static boolean deleteOrder(int orderid) {
		Set<Integer> keyId = hmOrders.keySet();
		Iterator<Integer> key = keyId.iterator();
		while (key.hasNext()) {
			int orderIdkey = key.next();
			if (orderIdkey == orderid) {
				hmOrders.remove(orderIdkey);
				return true;
			}
		}
		return false;

	}

	public static Customer findCustomer(String CustomerName) {
		String res = "Customers: " + "\n";
		Set<Integer> keyId = hmCustomers.keySet();
		Iterator<Integer> key = keyId.iterator();
		Customer cust = null;
		while (key.hasNext()) {
			int keyCustId = key.next();
			cust = hmCustomers.get(keyCustId);
			if (cust.getCustomerName().equalsIgnoreCase(CustomerName)) {
				return cust;
			}
		}
		return null;

	}

	public static HashMap<String, String[]> getHmMenu() {
		return hmMenu;
	}

	public static HashMap<Integer, Customer> getHmCustomers() {
		return hmCustomers;
	}

	public static LinkedHashMap<Integer, Coffee> getHmOrders() {
		return hmOrders;
	}

}
