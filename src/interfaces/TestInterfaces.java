package interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterfaces {
//	public static void main(String[] args) {
//		TestInterfaces x=new TestInterfaces();
//		x.testMixedCapsString();
//		
//	}
//	@Test
//	public void testBackwardsString() {
//		SpecialString bs = new BackwardsString("This is a test");
//		System.out.println(bs.toString());
//		assertEquals("tset a si sihT", bs.toString());
//	}
	
	@Test
	public void testMixedCapsString() {
		SpecialString mcs = new MixedCapsString("This is also a test");
		//System.out.println(mcs);
		assertEquals("tHiS iS aLsO a TeSt", mcs.toString());
	}

}
