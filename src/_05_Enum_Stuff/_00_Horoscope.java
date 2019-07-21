package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void Horoscope(Zodiac z) {
		if(z==Zodiac.ARIES) {
			JOptionPane.showMessageDialog(null, "a");
		}
		if(z==Zodiac.AQUARIUS) {
			JOptionPane.showMessageDialog(null, "b");
		}
		if(z==Zodiac.CANCER) {
			JOptionPane.showMessageDialog(null, "c");
		}
		if(z==Zodiac.CAPRICORN) {
			JOptionPane.showMessageDialog(null, "d");
		}
		if(z==Zodiac.GEMINI) {
			JOptionPane.showMessageDialog(null, "e");
		}
		if(z==Zodiac.LEO) {
			JOptionPane.showMessageDialog(null, "f");
		}
		if(z==Zodiac.LIBRA) {
			JOptionPane.showMessageDialog(null, "g");
		}
		if(z==Zodiac.PISCES) {
			JOptionPane.showMessageDialog(null, "h");
		}
		if(z==Zodiac.SAGITTARIUS) {
			JOptionPane.showMessageDialog(null, "i");
		}
		if(z==Zodiac.SCORPIO) {
			JOptionPane.showMessageDialog(null, "j");
		}
		if(z==Zodiac.TAURUS) {
			JOptionPane.showMessageDialog(null, "k");
		}
		if(z==Zodiac.VIRGO) {
			JOptionPane.showMessageDialog(null, "l");
		}
	}

	
	// 3. Make a main method to test your method

	public static void main(String[] args) {
	
	}	
}





