/**
@author Matthew C. Morgan - 3430092
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GPACalculatorGUI extends JFrame implements ActionListener {

	private JTextField gradeInputField, creditHourInputField;
	private JLabel gradeInputLabel, creditHourInputLabel;
	private JComboBox gradeInputBox;
	
	public GPACalculatorGUI() {
		JLabel gradeInputLabel = new JLabel ("Enter Grade or Select from Dropdown Box:");
		gradeInputField = new JTextField(5);
		gradeInputField.setHorizontalAlignment(JTextField.CENTER);

		JLabel creditHourInputLabel = new JLabel ("The credit hours earned for the course are: ");
		creditHourInputField = new JTextField(5);
		creditHourInputField.setHorizontalAlignment(JTextField.CENTER);
		
		String[] grades = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F", "WF"};
		gradeInputBox = new JComboBox(grades);
		
		ImageIcon icon = new ImageIcon("compute_icon.jpg");
		JButton calcButton = new JButton("Calculate!");
		calcButton.setIcon(icon);
		calcButton.setHorizontalTextPosition(SwingConstants.CENTER);
		calcButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		calcButton.addActionListener(this);
				
		JPanel gradeInputPanel = new JPanel();
		JPanel creditHourInputPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		gradeInputPanel.add(gradeInputLabel);
		gradeInputPanel.add(gradeInputField);
		gradeInputPanel.add(gradeInputBox);
		
		creditHourInputPanel.add(creditHourInputLabel);
		creditHourInputPanel.add(creditHourInputField);

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
