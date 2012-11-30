/**
	@author Matthew Morgan, Scott Warren
*/

public class JuniorCardHolder extends CardHolder{
	private String name;
	
	public JuniorCardHolder(String nameIn, int aptNum, String phoneNum, String guardian){
		super(aptNum, phoneNum, guardian);
		name = nameIn;
	}
	
	public String getGuardian(){
		return guardian;
	}
	
}