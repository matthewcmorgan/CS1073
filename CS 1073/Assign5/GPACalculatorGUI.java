/**
@author Matthew C. Morgan - 3430092
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
public class GPACalculatorGUI extends JFrame implements ActionListener {
	private JTextField gradeInputField, creditHourInputField;
	private JLabel pointsLabel, cumulativeGPALabel;
	private JButton addButton, clearButton;
	private double cumulativePoints, cumulativeCreditHours, cumulativeGPA;
	
	public GPACalculatorGUI() {
		JLabel gradeInputLabel = new JLabel ("Course letter grade:");
		gradeInputField = new JTextField(5);
		gradeInputField.setHorizontalAlignment(JTextField.CENTER);

		JLabel creditHourInputLabel = new JLabel ("Course credit hours: ");
		creditHourInputField = new JTextField(5);
		creditHourInputField.setHorizontalAlignment(JTextField.CENTER);
		
		addButton = new JButton("Add to GPA");
		addButton.setHorizontalTextPosition(SwingConstants.CENTER);
		addButton.setVerticalTextPosition(SwingConstants.CENTER);
		addButton.addActionListener(this);
		
		clearButton = new JButton("Clear GPA");
		clearButton.setHorizontalTextPosition(SwingConstants.CENTER);
		clearButton.setVerticalTextPosition(SwingConstants.CENTER);
		clearButton.addActionListener(this);
		
		pointsLabel = new JLabel ("Welcome to my GPA Calculator!");
		cumulativeGPALabel = new JLabel ("Enter your 1st grade & credit hrs.");		
		
		JPanel gradeInputPanel = new JPanel();
		JPanel creditHourInputPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		
		gradeInputPanel.add(gradeInputLabel);
		gradeInputPanel.add(gradeInputField);
				
		creditHourInputPanel.add(creditHourInputLabel);
		creditHourInputPanel.add(creditHourInputField);
		
		buttonPanel.add(addButton);
		buttonPanel.add(clearButton);
		
		labelPanel.add(pointsLabel);
		labelPanel.add(cumulativeGPALabel);
			
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(gradeInputPanel);
		contentPane.add(creditHourInputPanel);
		contentPane.add(buttonPanel);
		contentPane.add(pointsLabel);
		contentPane.add(cumulativeGPALabel);
	}
	public void actionPerformed(ActionEvent e) {
		NumberFormat f1 = NumberFormat.getNumberInstance();
		f1.setMinimumFractionDigits(1);
		f1.setMaximumFractionDigits(2);
		if (e.getSource() == addButton){
			String letterGrade = gradeInputField.getText().toUpperCase();
			double creditHour = Double.parseDouble(creditHourInputField.getText());
			double points = 0;
			if (letterGrade.equals("A+")){points = creditHour * 4.3;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("A")){points = creditHour * 4.0;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("A-")){points = creditHour * 3.7;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("B+")){points = creditHour *3.3;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("B")){points = creditHour * 3.0;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("B-")){points = creditHour * 2.7;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("C+")){points = creditHour * 2.3;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("C")){points = creditHour * 2.0;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("D")){points = creditHour * 1.0;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("F")){points = creditHour * 0.0;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else if (letterGrade.equals("WF")){points = creditHour * 0.0;
					pointsLabel.setText("Points for this course: " + f1.format(points));
				}else { pointsLabel.setText("Invalid grade - GPA not changed.");
				creditHour = 0;
				points = 0;
			}
			cumulativeCreditHours += creditHour;
			cumulativePoints += points;
			cumulativeGPA = cumulativePoints / cumulativeCreditHours;
			cumulativeGPALabel.setText("Your cumulative GPA is: " + f1.format(cumulativeGPA));
		}else if(e.getSource() == clearButton){
			cumulativeGPA = 0.0;
			cumulativePoints = 0.0;
			cumulativeCreditHours = 0.0;
			pointsLabel.setText("Totals have been reset.");
			cumulativeGPALabel.setText("Enter your 1st grade & credit hrs.");
			gradeInputField.setText("");
			creditHourInputField.setText("");
		}
	}
	public static void main(String[] args){
		GPACalculatorGUI frame = new GPACalculatorGUI();
		frame.setSize(250, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}