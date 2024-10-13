package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SystemAndMain.CoffeeSys;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteOrderFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblOrderDeleted;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DeleteOrderFrame frame = new DeleteOrderFrame();
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
	public DeleteOrderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Order Id");
		lblNewLabel.setBounds(6, 21, 61, 16);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(79, 16, 101, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		lblOrderDeleted = new JLabel("");
		lblOrderDeleted.setBounds(20, 63, 142, 16);
		contentPane.add(lblOrderDeleted);

		JButton btnNewButton = new JButton("Delete Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CoffeeSys.deleteOrder(Integer.parseInt(textField.getText()))) {
					lblOrderDeleted.setText("Order Deleted");
				} else {
					lblOrderDeleted.setText("Order not found!");
				}
			}
		});
		btnNewButton.setBounds(6, 96, 117, 29);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 137, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
