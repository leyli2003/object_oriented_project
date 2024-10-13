package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class_IsA.Brew;
import Class_IsA.Coffee;
import Class_IsA.EspressoBased;
import Other.Bean;
import Other.Customer;
import SystemAndMain.CoffeeSys;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class addOrderFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtOrderId;
	private JTextField txtCustomerName;
	private JTextField txtTemperature;
	private JTextField txtBrewType;
	private JTextField txtBeanAcidity;
	private JTextField txtBeanAroma;
	private JTextField txtBeanOrigin;
	private JTextField txtBeanRoast;
	private JTextField txtEspressoMilkType;
	private JTextField txtEspressoNoofShots;
	private JTextField textEspressoSyrup;
	private JTextField txtWarn;

	private JComboBox<String> cbCoffeeName;
	private JComboBox<String> cbCoffeeSize;
	private JTextField txtUsedCustPoints;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					addOrderFrame frame = new addOrderFrame();
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
	public addOrderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Order ID: ");
		lblNewLabel.setBounds(6, 61, 61, 16);
		contentPane.add(lblNewLabel);

		txtOrderId = new JTextField();
		txtOrderId.setBounds(125, 56, 130, 26);
		contentPane.add(txtOrderId);
		txtOrderId.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Coffee Name:  ");
		lblNewLabel_1.setBounds(6, 165, 106, 16);
		contentPane.add(lblNewLabel_1);

		cbCoffeeName = new JComboBox<String>();
		cbCoffeeName.setBounds(125, 161, 130, 27);
		contentPane.add(cbCoffeeName);

		JLabel lblNewLabel_2 = new JLabel("Customer Name: ");
		lblNewLabel_2.setBounds(6, 91, 132, 27);
		contentPane.add(lblNewLabel_2);

		txtCustomerName = new JTextField();
		txtCustomerName.setBounds(125, 88, 130, 26);
		contentPane.add(txtCustomerName);
		txtCustomerName.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("BEAN");
		lblNewLabel_3.setBounds(316, 82, 61, 16);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Coffee Size: ");
		lblNewLabel_4.setBounds(6, 200, 106, 16);
		contentPane.add(lblNewLabel_4);

		cbCoffeeSize = new JComboBox<String>();
		cbCoffeeSize.setBounds(125, 200, 130, 27);
		contentPane.add(cbCoffeeSize);

		JLabel lblNewLabel_5 = new JLabel("Temperature: ");
		lblNewLabel_5.setBounds(6, 240, 106, 16);
		contentPane.add(lblNewLabel_5);

		txtTemperature = new JTextField();
		txtTemperature.setBounds(125, 235, 130, 26);
		contentPane.add(txtTemperature);
		txtTemperature.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Coffee Type: ");
		lblNewLabel_6.setBounds(6, 275, 106, 16);
		contentPane.add(lblNewLabel_6);

		JRadioButton rdBrew = new JRadioButton("Brew");
		buttonGroup.add(rdBrew);
		rdBrew.setBounds(125, 293, 122, 23);
		contentPane.add(rdBrew);

		JRadioButton rdEspressoBased = new JRadioButton("Espresso-Based");
		buttonGroup.add(rdEspressoBased);
		rdEspressoBased.setBounds(125, 271, 141, 23);
		contentPane.add(rdEspressoBased);
		rdEspressoBased.setSelected(true);
		// Brew Panel:

		JPanel panelBrew = new JPanel();
		panelBrew.setBackground(new Color(211, 211, 211));
		panelBrew.setBounds(6, 328, 279, 75);
		contentPane.add(panelBrew);
		panelBrew.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("Brew: ");
		lblNewLabel_7.setBounds(6, 6, 61, 16);
		panelBrew.add(lblNewLabel_7);

		JLabel brewType = new JLabel("Brew Type: ");
		brewType.setBounds(6, 27, 82, 16);
		panelBrew.add(brewType);

		txtBrewType = new JTextField();
		txtBrewType.setBounds(113, 22, 130, 26);
		panelBrew.add(txtBrewType);
		txtBrewType.setColumns(10);

		// Bean

		JLabel lblNewLabel_8 = new JLabel("Acidity (Low, Medium, High)");
		lblNewLabel_8.setBounds(258, 108, 180, 16);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Aroma (Floral, nutty, smoky)");
		lblNewLabel_9.setBounds(258, 145, 180, 16);
		contentPane.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Origin (country)");
		lblNewLabel_10.setBounds(277, 175, 106, 16);
		contentPane.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Roast(Low, Medium, High)");
		lblNewLabel_11.setBounds(263, 223, 166, 16);
		contentPane.add(lblNewLabel_11);

		txtBeanAcidity = new JTextField();
		txtBeanAcidity.setBounds(416, 104, 130, 26);
		contentPane.add(txtBeanAcidity);
		txtBeanAcidity.setColumns(10);

		txtBeanAroma = new JTextField();
		txtBeanAroma.setBounds(416, 141, 130, 26);
		contentPane.add(txtBeanAroma);
		txtBeanAroma.setColumns(10);

		txtBeanOrigin = new JTextField();
		txtBeanOrigin.setBounds(416, 171, 130, 26);
		contentPane.add(txtBeanOrigin);
		txtBeanOrigin.setColumns(10);

		txtBeanRoast = new JTextField();
		txtBeanRoast.setBounds(416, 219, 130, 26);
		contentPane.add(txtBeanRoast);
		txtBeanRoast.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(316, 253, 216, 154);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("Espresso Based");
		lblNewLabel_12.setBounds(6, 6, 129, 16);
		panel.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Milk Type: ");
		lblNewLabel_13.setBounds(6, 32, 76, 16);
		panel.add(lblNewLabel_13);

		txtEspressoMilkType = new JTextField();
		txtEspressoMilkType.setBounds(80, 27, 130, 26);
		panel.add(txtEspressoMilkType);
		txtEspressoMilkType.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("Number of Espresso Shots:");
		lblNewLabel_14.setBounds(6, 70, 170, 26);
		panel.add(lblNewLabel_14);

		txtEspressoNoofShots = new JTextField();
		txtEspressoNoofShots.setBounds(183, 70, 27, 26);
		panel.add(txtEspressoNoofShots);
		txtEspressoNoofShots.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("Syrup: ");
		lblNewLabel_15.setBounds(6, 111, 61, 16);
		panel.add(lblNewLabel_15);

		textEspressoSyrup = new JTextField();
		textEspressoSyrup.setBounds(80, 108, 130, 26);
		panel.add(textEspressoSyrup);
		textEspressoSyrup.setColumns(10);

		txtWarn = new JTextField("");
		txtWarn.setBounds(293, 21, 233, 51);
		contentPane.add(txtWarn);

		txtUsedCustPoints = new JTextField();
		txtUsedCustPoints.setBounds(155, 123, 100, 26);
		contentPane.add(txtUsedCustPoints);
		txtUsedCustPoints.setColumns(10);

		JButton btnNewButton = new JButton("Add Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdBrew.isSelected()) {
					if (txtBeanAcidity.getText().isEmpty() || txtBeanAroma.getText().isEmpty()
							|| txtBeanOrigin.getText().isEmpty() || txtBeanRoast.getText().isEmpty()
							|| cbCoffeeName.getSelectedItem().toString().isEmpty()
							|| txtCustomerName.getText().isEmpty() || txtOrderId.getText().isEmpty()
							|| cbCoffeeSize.getSelectedItem().toString().isEmpty() || txtBrewType.getText().isEmpty()
							|| txtTemperature.getText().isEmpty()) {
						txtWarn.setText("Fill All necessary Fields");
					} else {
						Bean bean = new Bean(txtBeanAcidity.getText(), txtBeanAroma.getText(), txtBeanOrigin.getText(),
								txtBeanRoast.getText());
						String CoffeType = "Brew";
						int customerPoints = 0;
						int ordrId = Integer.parseInt(txtOrderId.getText());
						Brew b = new Brew(ordrId, txtCustomerName.getText(), cbCoffeeName.getSelectedItem().toString(),
								cbCoffeeSize.getSelectedItem().toString(), CoffeType, bean, txtTemperature.getText(),
								txtBrewType.getText());
						Customer c = CoffeeSys.findCustomer(txtCustomerName.getText());
						if (c == null) {
							txtWarn.setText("Customer does not exist in the system");
							b.calculatePrice(0);
							CoffeeSys.addNewCustomer(txtCustomerName.getText(), b.earnedCustomerPoints());
						} else {
							if (c.getCustomerPoints() < Integer.parseInt(txtUsedCustPoints.getText())) {
								txtWarn.setText("Customer doesnt have enough points");

							} else {
								txtWarn.setText("The point are used!");
								customerPoints = Integer.parseInt(txtUsedCustPoints.getText());
							}

							b.calculatePrice(customerPoints);
							int existingCustPoints = c.getCustomerPoints();
							existingCustPoints = existingCustPoints - customerPoints + b.earnedCustomerPoints();
							c.setCustomerPoints(existingCustPoints);
							CoffeeSys.updateCustomer(c);
						}
						CoffeeSys.addCoffeeOrder(ordrId, b);
					}
				} else if (rdEspressoBased.isSelected()) {
					if (txtBeanAcidity.getText().isEmpty() || txtBeanAroma.getText().isEmpty()
							|| txtBeanOrigin.getText().isEmpty() || txtBeanRoast.getText().isEmpty()
							|| cbCoffeeName.getSelectedItem().toString().isEmpty()
							|| txtCustomerName.getText().isEmpty() || txtOrderId.getText().isEmpty()
							|| cbCoffeeSize.getSelectedItem().toString().isEmpty() || txtTemperature.getText().isEmpty()
							|| txtEspressoMilkType.getText().isEmpty() || txtEspressoNoofShots.getText().isEmpty()
							|| textEspressoSyrup.getText().isEmpty()) {
						txtWarn.setText("Fill All necessary Fields");
					} else {
						Bean bean = new Bean(txtBeanAcidity.getText(), txtBeanAroma.getText(), txtBeanOrigin.getText(),
								txtBeanRoast.getText());
						String CoffeType = "Espresso-Based";
						int customerPoints = 0;
						int ordrId = Integer.parseInt(txtOrderId.getText());
						EspressoBased espDrink = new EspressoBased(ordrId, txtCustomerName.getText(),
								cbCoffeeName.getSelectedItem().toString(), cbCoffeeSize.getSelectedItem().toString(),
								CoffeType, bean, txtTemperature.getText(), txtEspressoMilkType.getText(),
								textEspressoSyrup.getText(), Integer.parseInt(txtEspressoNoofShots.getText()));
						Customer c = CoffeeSys.findCustomer(txtCustomerName.getText());
						if (c == null) {
							txtWarn.setText("Customer does not exist in the system");
							espDrink.calculatePrice(0);
							CoffeeSys.addNewCustomer(txtCustomerName.getText(), espDrink.earnedCustomerPoints());
						} else {
							if (c.getCustomerPoints() < Integer.parseInt(txtUsedCustPoints.getText())) {
								txtWarn.setText("Customer doesnt have enough points");

							} else {
								txtWarn.setText("The point are used!");
								customerPoints = Integer.parseInt(txtUsedCustPoints.getText());
							}

							espDrink.calculatePrice(customerPoints);
							int existingCustPoints = c.getCustomerPoints();
							existingCustPoints = existingCustPoints - customerPoints + espDrink.earnedCustomerPoints();
							c.setCustomerPoints(existingCustPoints);
							CoffeeSys.updateCustomer(c);
						}
						CoffeeSys.addCoffeeOrder(ordrId, espDrink);
					}

				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setBounds(6, 15, 146, 29);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBeanAcidity.setText("");
				txtBeanAroma.setText("");
				txtBeanOrigin.setText("");
				txtBeanRoast.setText("");
				txtBrewType.setText("");
				txtCustomerName.setText("");
				txtEspressoMilkType.setText("");
				txtEspressoNoofShots.setText("");
				textEspressoSyrup.setText("");
				txtOrderId.setText("");
				txtTemperature.setText("");
				txtUsedCustPoints.setText("");
				cbCoffeeName.setSelectedIndex(0);
				cbCoffeeSize.setSelectedIndex(0);
				dispose();
			}
		});
		btnNewButton_1.setBounds(164, 16, 117, 29);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_16 = new JLabel("Used Customer Points: ");
		lblNewLabel_16.setBounds(6, 130, 166, 16);
		contentPane.add(lblNewLabel_16);

	}

	public JComboBox getCbCoffeeName() {
		return cbCoffeeName;
	}

	public JComboBox getCbCoffeeSize() {
		return cbCoffeeSize;
	}

}
