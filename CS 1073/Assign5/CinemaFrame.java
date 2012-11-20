/**
@author Matthew C. Morgan - 3430092
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
public class CinemaFrame extends JFrame implements ActionListener {
	private NumberFormat f1 = NumberFormat.getCurrencyInstance();	
	private JButton redeemButton, nextCustomerButton;
	private JTextField couponValueField;
	private JLabel topLabel, couponLabel, totalLabel;
	private double totalPrice = 0.0;
	public CinemaFrame(){
		topLabel = new JLabel("Click on the products that the customer wishes to purchase:");
		topLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		ProductButton adultTicket = new ProductButton("Adult Ticket", 12.50);
		adultTicket.addActionListener(this);
		ProductButton childTicket = new ProductButton("Child Ticket", 6.25);
		childTicket.addActionListener(this);
		ProductButton seniorTicket = new ProductButton("Senior Ticket", 8.75);
		seniorTicket.addActionListener(this);
		ProductButton popcorn = new ProductButton("Popcorn", 5.50);
		popcorn.addActionListener(this);
		ProductButton pop = new ProductButton("Pop", 2.75);
		pop.addActionListener(this);
		ProductButton candy = new ProductButton("Candy", 3.25);
		candy.addActionListener(this);
		
		couponLabel = new JLabel("Coupon: $");
		couponValueField = new JTextField(5);
		couponValueField.setHorizontalAlignment(JTextField.CENTER);
		redeemButton = new JButton("Redeem");
		redeemButton.addActionListener(this);
		totalLabel = new JLabel("Current total: " + f1.format(totalPrice));
		nextCustomerButton = new JButton("Next Customer");
		nextCustomerButton.addActionListener(this);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		topPanel.add(topLabel, BorderLayout.WEST);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2,3));
		buttonPanel.add(adultTicket);
		buttonPanel.add(childTicket);
		buttonPanel.add(seniorTicket);
		buttonPanel.add(popcorn);
		buttonPanel.add(pop);
		buttonPanel.add(candy);
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.add(couponLabel);
		bottomPanel.add(couponValueField);
		bottomPanel.add(redeemButton);
		bottomPanel.add(totalLabel);		
		bottomPanel.add(nextCustomerButton);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(topPanel, BorderLayout.NORTH);
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == nextCustomerButton){
			totalPrice = 0.0;
		}else if(e.getSource() == redeemButton){
			double discount = Double.parseDouble(couponValueField.getText());
			totalPrice = totalPrice - discount;
			couponValueField.setText(""); 
		}else{
		ProductButton i = (ProductButton)(e.getSource());
		totalPrice += i.getPrice();
		}
		totalLabel.setText("Current total: " + f1.format(totalPrice));
	}
	public static void main(String[] args){
		CinemaFrame frame = new CinemaFrame();
		frame.setSize(640, 480);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}