public class AllTheColorsOfTheRainbow {

	int anIntegerRepresentingColors;

	void ChangeTheHueOfTheColor(int newHue){
		
		anIntegerRepresentingColors = newHue;
		System.out.println("input newHue : " + anIntegerRepresentingColors);
	}

	public static void main (String [] args)
	{
		/* code */
		AllTheColorsOfTheRainbow mAllTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
		mAllTheColorsOfTheRainbow.ChangeTheHueOfTheColor(1);
	}
}
