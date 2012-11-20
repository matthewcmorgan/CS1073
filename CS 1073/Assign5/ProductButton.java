import java.awt.*;
import javax.swing.*;
import java.text.NumberFormat;
/**
 A ProductButton is a special kind of JButton,
 used to display products for sale.
 @author Natalie Webber
 @author Matthew Morgan - 3430092
*/
public class ProductButton extends JButton {
   /**
    The name of the product.
   */
   private String productName;
   /**
    The price for which we will sell the product
   */
   private double productPrice;
   /**
    Creates a button that will display an image of the product
    (assumed to be stored in a file starting with the specified
    name and ending with ".jpg"), the specified product name,
    and the specified price (formatted properly); the text is 
    displayed below the image and is centered.
    @param name The product name.
    @param price The selling price for this product.
   */
   public ProductButton (String name, double price) {
      /* Add code here (& only here) to complete this class. */
			super(name);
			productName = name;
			productPrice = price;
			ImageIcon icon = new ImageIcon(productName + ".jpg");
			this.setIcon(icon);
			NumberFormat f1 = NumberFormat.getCurrencyInstance();
			this.setText(name + ":\t" + f1.format(price));
			this.setHorizontalTextPosition(SwingConstants.CENTER);
			this.setVerticalTextPosition(SwingConstants.BOTTOM);
   }
   /**
    Retrieves the product name.
    @return The product name.
   */
   public String getName() { 
      return productName; 
   }
   /**
    Retrieves the selling price.
    @return The price for which we will sell the product.
   */
   public double getPrice() { 
      return productPrice; 
   }
}