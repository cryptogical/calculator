import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int operation = 0;
	int temp1 = 0, temp2 = 0;
	String operationChoosed = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setTitle("Calculatrice");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel textOperation = new JLabel("");
		panel_1.add(textOperation);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setVisible(false);
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setVisible(false);
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setVisible(false);
		panel.add(btnNewButton_12);
		
		JButton minus = new JButton("-");
		panel.add(minus);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0) {
					return;
				}
				else {
					operationChoosed = "-";
				}
			}
		});
		
		JButton n7 = new JButton("7");
		panel.add(n7);
		n7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n7.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n7.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n7.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton n8 = new JButton("8");
		panel.add(n8);
		n8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n8.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n8.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n8.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton n9 = new JButton("9");
		panel.add(n9);
		n9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n9.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n9.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n9.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton plus = new JButton("+");
		panel.add(plus);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0) {
					return;
				}
				else {
					operationChoosed = "+";
				}
			}
		});
		
		JButton n4 = new JButton("4");
		panel.add(n4);
		n4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n4.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n4.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n4.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton n5 = new JButton("5");
		panel.add(n5);
		n5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n5.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n5.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n5.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton n6 = new JButton("6");
		panel.add(n6);
		n6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n6.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n6.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n6.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton times = new JButton("x");
		panel.add(times);
		
		// Add actionEvent on
		
		times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0) {
					return;
				}
				else {
					operationChoosed = "x";
				}
			}
		});
		
		JButton n1 = new JButton("1");
		panel.add(n1);
		n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n1.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n1.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n1.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton n2 = new JButton("2");
		panel.add(n2);
		n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n2.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n2.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n2.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
		JButton n3 = new JButton("3");
		panel.add(n3);
		
		JButton cancel = new JButton("C");
		panel.add(cancel);
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp1 = temp2 = 0;
				textOperation.setText("");
			}
		});
		
		n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 == 0 && temp2 == 0) { // Si aucun nombre a été choisi
					temp1 = Integer.parseInt(n3.getText());
					textOperation.setText(String.valueOf(temp1));
					
				}
				else if (temp1 != 0 && temp2 == 0 && !operationChoosed.equalsIgnoreCase("")) { // Si le premier a été choisi, on choisit le second
					temp2 = Integer.parseInt(n3.getText());
					switch(operationChoosed) {
						case "+": {
							operation = temp1 + temp2;
							break;
						}
						case "-": {
							operation = temp1 - temp2;
							break;
						}
						case "x": {
							operation = temp1 * temp2;
							break;
						}
					}
					textOperation.setText(textOperation.getText() + " " + operationChoosed + " " + String.valueOf(temp2) + " = " + operation);
					
				}
				else {
					temp1 = Integer.parseInt(n2.getText()); textOperation.setText(String.valueOf(temp1)); operationChoosed = ""; temp2 = 0;
				}
			}
		});
		
	}

}
