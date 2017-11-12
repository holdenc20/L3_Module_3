package interfaces;

import java.util.ArrayList;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public  String funkifyText(String x) {
		String y="";
		for(int i=x.length();i>0;i--) {
			y+=x.substring(i-1,i);
		}
		return y;
	}
	
}
