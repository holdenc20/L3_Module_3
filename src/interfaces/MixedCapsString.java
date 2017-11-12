package interfaces;

import java.util.ArrayList;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String x) {
		String y="";
		int counter=0;
		for(int i=0;i<x.length()+2;i++) {
			counter++;
			if(x.charAt(i)==' ') {
				counter--;
				y+=" ";
			}
			else if(counter%2==0) {
				//System.out.println(x.charAt(i));
				//y=""+x.charAt(i);
				y+=x.substring(i, i+1).toUpperCase();
			}
			else {
				y+=x.substring(i, i+1).toLowerCase();
			}
			System.out.println(y);
			if(i+1==x.length()) {
				return y;
			}
		}
		System.out.println(y);
		return y;
	}
	
}
