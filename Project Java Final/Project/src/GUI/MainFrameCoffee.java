package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SystemAndMain.CoffeeSys;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrameCoffee extends JFrame {

	private JPanel contentPane;
	addOrderFrame addOrderfr = new addOrderFrame();
	addMenuItemFrame addMenuItfr = new addMenuItemFrame();
	DeleteOrderFrame deletefr = new DeleteOrderFrame();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrame frame = new MainFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MainFrameCoffee() {
		String[] size = { "Small", "Medium", "Large" };

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 24, 298, 192);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JButton displayCustomersButton = new JButton("Display Customers");
		displayCustomersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CoffeeSys.getHmCustomers() == null) {
					textArea.setText("There are no customers!");
				} else {
					textArea.setText(CoffeeSys.displayCustomers());
				}
			}
		});
		displayCustomersButton.setBounds(289, 228, 143, 29);
		contentPane.add(displayCustomersButton);

		JButton displayOrdersButton = new JButton("Display All Orders");
		displayOrdersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CoffeeSys.getHmOrders() == null) {
					textArea.setText("There are no orders");
				} else {
					textArea.setText(CoffeeSys.displayAllOrders());
				}
			}
		});
		displayOrdersButton.setBounds(17, 228, 153, 29);
		contentPane.add(displayOrdersButton);

		JButton newOrderBtn = new JButton("New Order");
		newOrderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrderfr.getCbCoffeeName().setModel(new DefaultComboBoxModel<String>(CoffeeSys.getMenuItems()));
				addOrderfr.getCbCoffeeSize().setModel(new DefaultComboBoxModel<String>(size));
				addOrderfr.setVisible(true);
			}
		});
		newOrderBtn.setBounds(327, 24, 117, 51);
		contentPane.add(newOrderBtn);

		JButton newMenuItemBtn = new JButton("New Menu Item");
		newMenuItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenuItfr.setVisible(true);
			}
		});
		newMenuItemBtn.setBounds(311, 91, 143, 51);
		contentPane.add(newMenuItemBtn);

		JButton btnNewButton = new JButton("Delete Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletefr.setVisible(true);
			}
		});
		btnNewButton.setBounds(327, 152, 117, 51);
		contentPane.add(btnNewButton);

		JButton displayMenuButton = new JButton("Display Menu");
		displayMenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CoffeeSys.getHmMenu() == null) {
					textArea.setText("The Menu is Empty.");
				} else {
					textArea.setText(CoffeeSys.displayMenu());
				}
			}
		});
		displayMenuButton.setBounds(174, 228, 117, 29);
		contentPane.add(displayMenuButton);
	}
}
