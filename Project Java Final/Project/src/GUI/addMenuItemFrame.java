package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import SystemAndMain.CoffeeSys;

public class addMenuItemFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNameofItem;
	private JLabel lblNewLabel_1;
	private JTextField txtItemIngredients;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JLabel lblWarning;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					addMenuItemFrame frame = new addMenuItemFrame();
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
	public addMenuItemFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Name of the Drink: ");
		lblNewLabel.setBounds(33, 42, 124, 16);
		contentPane.add(lblNewLabel);

		txtNameofItem = new JTextField();
		txtNameofItem.setBounds(186, 37, 130, 26);
		contentPane.add(txtNameofItem);
		txtNameofItem.setColumns(10);

		lblNewLabel_1 = new JLabel("Ingredients (separate with -): ");
		lblNewLabel_1.setBounds(10, 67, 169, 33);
		contentPane.add(lblNewLabel_1);

		txtItemIngredients = new JTextField();
		txtItemIngredients.setBounds(132, 93, 184, 26);
		contentPane.add(txtItemIngredients);
		txtItemIngredients.setColumns(10);

		lblWarning = new JLabel("");
		lblWarning.setBounds(142, 110, 61, 16);
		contentPane.add(lblWarning);

		btnNewButton = new JButton("Add Menu Item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNameofItem.getText().isEmpty() || txtItemIngredients.getText().isEmpty()) {
					lblWarning.setText("Fill all the necessary Fields");
				} else {
					String itemName = txtNameofItem.getText();
					String[] ingredients = txtItemIngredients.getText().split("-");
					try {
						if (CoffeeSys.addMenuItem(itemName, ingredients)) {
							lblWarning.setText("Item was added.");
						} else {
							lblWarning.setText("Item alreadt exists.");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setBounds(33, 137, 169, 29);
		contentPane.add(btnNewButton);

		lblNewLabel_2 = new JLabel("MENU ITEM");
		lblNewLabel_2.setBounds(33, 6, 124, 16);
		contentPane.add(lblNewLabel_2);

		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtItemIngredients.setText("");
				txtNameofItem.setText("");
				dispose();
			}
		});
		btnNewButton_1.setBounds(214, 138, 117, 29);
		contentPane.add(btnNewButton_1);

	}

}
