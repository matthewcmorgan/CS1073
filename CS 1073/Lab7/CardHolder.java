/**
	@author Matthew Morgan, Scott Warren
*/
public class CardHolder{
	private String name;
	private int aptNum;
	private String phoneNum;
	private static int memberNumIn = 1000;
	private int memberNum;
	protected int numberCheckedOut;
	protected LendingItem[] signedOut;
	
	public CardHolder(String nameIn, int aptNumIn, String phoneNumIn){
		name = nameIn;
		aptNum = aptNumIn;
		phoneNum = phoneNumIn;
		memberNum = memberNumIn;
		memberNumIn++;
		numberCheckedOut = 0;
	}
	public String getName(){
		return name;
	}
	public int getAptNumber(){
		return aptNum;
	}
	public void setPhoneNumber(String phoneNumIn){
		phoneNum = phoneNumIn;
	}
	public String getPhoneNumber(){
		return phoneNum;
	}
	public int getMembershipNumber(){
		return memberNum;
	}
	public boolean signOut(LendingItem itemOut){
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
	public boolean returnItem(LendingItem itemIn){
		if(numberCheckedOut == 1){
			signedOut[0] = null;
			numberCheckedOut--;
			return true;
		} else {
			for(int i = 0; i < signedOut.length; i++){
				if(signedOut[i] == itemIn){
					signedOut[i] = signedOut[numberCheckedOut-1];
					signedOut[numberCheckedOut-1] = null;
					numberCheckedOut--;
					return true;
				}
			}
		}
		return false;
	}
	public LendingItem[] getSignedOutItems(){
		LendingItem[] temp = new LendingItem[numberCheckedOut];
		for(int i = 0; i < numberCheckedOut; i++){
			temp[i] = signedOut[i];
		}
		return temp;
	}
}