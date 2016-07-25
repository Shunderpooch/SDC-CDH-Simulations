public class ecBatteries extends Module implements Electrical{
	double capacity;
	
	ecBatteries(double mass, double draw, String protocol) {
		super(mass, draw, protocol);
	}
	

	/* Something that should be at the top and exist in every extremity */
	public void readycheck() {
		if (chkSysDraw() == (double)chkSysDraw() // If sysDraw is real and
				&& ApWHMeter() == (double)ApWHMeter()){ // there is an ApWH reading
			System.out.println("Current: " + chkSysDraw() + "%n"); // Print draw
			chkCurrCap(); // Run function to display charge
		}
		else{
			System.out.println("ERROR %n"); // return error
		}
	}
	
	private double chkSysDraw(){
		double draw = 0;
		
		/* I DON'T KNOW ANY OF THE PORT OR ROUTING SO THIS IS JUST SOME SHIT */
		
		// For each connected peripheral that needs power
		// Select the board port from a list of them that will be determined later
		// Check the current, if it's real add it to draw
		// Continue until list is exhausted, then done
		
		return draw;
	}
	
	private void chkCurrCap(){
		double read = ApWHMeter();
		
		/* same in the fact that I know nothing
		 * OKAY, This one is harder to do, but if I took the time it'd be done
		 * We can use an Amp/Watt hour meter that will check our charge state
		 * We can also use a table of pre-tested charge states to compare our
		 * charge to.
		 * 
		 * So like, 1 for full, 1 for empty, several in betweens.
		 */
		
		// Get a list of charge states in 10s: 100, 90, 80, etc.
		// A conditional statement, that seems more organized
		// like 10% if read == so and such print %, and so on
	}
	
	/* THIS FUNCTION IS BAD, AND IT SHOULD FEEL BAD
	 * Should be in the thermo subsection rather than the batteries themselves
	 * You can store it in the batteries, but I feel like that would waste time
	 * and resources keep duplicates.
	 * */
	private boolean chkHeat(){
		return false;
	}
	
	/* This function is good, and kind of required, unless someone tells me
	 * otherwise. 
	 * IF THERE IS A BETTER WAY, LET ME KNOW, I'M JUST A GOBBY CS MAJOR
	 * This is just an Amp/WattHour Meter for charge calculation.
	 */
	private double ApWHMeter(){
		// Some stuff I'll do later
		return 0;
	}
	
}
