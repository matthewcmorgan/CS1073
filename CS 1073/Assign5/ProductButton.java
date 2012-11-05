/**
@author Matthew C. Morgan - 3430092
*/

public class ProductButton{
	private JButton button;
	private String label;
	private ImageIcon icon;
	
	public ProductButton(JButton buttonIn, String labelIn, ImageIcon iconIn){
		button = new JButton(labelIn, iconIn);
	}
	
	public JButton getButton(){
		return button;
	}
	
	public String getLabel(){
		return label;
	}
	
	public ImageIcon getIcon(){
		return icon;
	}
	
	public void setButton(JButton buttonIn){
		button = buttonIn;
	}
	
	public void setLabel(JLabel labelIn){
		label = labelIn;
	}
	
	public void setIcon(ImageIcon iconIn){
		icon = iconIn;
	}
}