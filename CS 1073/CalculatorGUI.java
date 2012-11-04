/**
@author Matthew C. Morgan - 3430092
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorGUI extends JFrame implements ActionListener {

	private JTextField operandOneField, operandTwoField, resultField;
	private JLabel operandOneLabel, operandTwoLabel, operatorLabel;
	private JComboBox operatorBox;
	
	public CalculatorGUI() {
		JLabel operandOneLabel = new JLabel ("First Number: ");
		JLabel operandTwoLabel = new JLabel ("Second Number: ");
		JLabel operatorLabel = new JLabel ("Operation to Perform ");

		operandOneField = new JTextField();
		operandOneField.setHorizontalAlignment(JTextField.CENTER);
		operandTwoField = new JTextField();
		operandTwoField.setHorizontalAlignment(JTextField.CENTER);
		resultField = new JTextField(25);
		resultField.setHorizontalAlignment(JTextField.CENTER);
		
		String[] operations = {"+", "-", "*", "/", "^"};
		operatorBox = new JComboBox(operations);
		ImageIcon icon = new ImageIcon("compute_icon.jpg");
		JButton calcButton = new JButton("Calculate!");
		calcButton.setIcon(icon);
		calcButton.setHorizontalTextPosition(SwingConstants.CENTER);
		calcButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		calcButton.addActionListener(this);
				
		JPanel operandPanel = new JPanel();
		operandPanel.setLayout(new GridLayout(2,3));
		JPanel resultPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		operandPanel.add(operandOneLabel);
		operandPanel.add(operatorLabel);
		operandPanel.add(operandTwoLabel);
		operandPanel.add(operandOneField);
		operandPanel.add(operatorBox);
		operandPanel.add(operandTwoField);

		resultPanel.add(resultField);	
		buttonPanel.add(calcButton);	
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(operandPanel, BorderLayout.NORTH);
		contentPane.add(resultPanel, BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e) {
		double result = 0;
		double operandOne = Double.parseDouble(operandOneField.getText());
		double operandTwo = Double.parseDouble(operandTwoField.getText());
		String operation = (String)operatorBox.getSelectedItem();
		if(operation == "+"){
			result = operandOne + operandTwo; 
		}else if (operation == "-"){
			result = operandOne - operandTwo;
		}else if (operation == "*"){
			result = operandOne * operandTwo;
		}else if (operation == "/"){
			result = operandOne / operandTwo;
		}else if (operation == "^"){
			result = Math.pow(operandOne, operandTwo);
		}
		resultField.setText(operandOne + " " + operation + " " + operandTwo + " = " + result);
	}
	public static void main(String[] args){
		CalculatorGUI frame = new CalculatorGUI();
		frame.setSize(450, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
