/**
	@author Matthew Morgan, Scott Warren
*/

public class JuniorCardHolder extends CardHolder{
	private String name;
	
	public JuniorCardHolder(String nameIn, int aptNumIn, String phoneNumIn, String guardian){
		super(guardian, aptNumIn, phoneNumIn);
		name = nameIn;
		numberCheckedOut = 0;
	}
	
	public String getGuardian(){
		return super.getName();
	}
	
	public String getName(){
		return name;
	}
	
	public boolean signOut(LendingItem itemOut){
		if(itemOut.isRestricted()){
			return false;
		}
		if(numberCheckedOut == 0){
			signedOut = new LendingItem[1];
			signedOut[0] = itemOut;
			numberCheckedOut++;
			return true;
		} else if (numberCheckedOut > 0 && numberCheckedOut < 7){
			LendingItem[] temp = new LendingItem[numberCheckedOut+1];
			for (int i = 0; i < numberCheckedOut; i++){
				temp[i] = signedOut[i];
			}
			signedOut = temp;
			signedOut[numberCheckedOut] = itemOut;
			numberCheckedOut++;
			return true;
		}
		return false;
	}
}