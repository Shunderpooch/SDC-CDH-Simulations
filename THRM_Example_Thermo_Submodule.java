/**
 * 
 */

/**
 * @author qwertey6
 *
 */
public class THRM_Example_Thermo_Submodule extends Module implements THRM {

	/**
	 * 
	 */
	public THRM_Example_Thermo_Submodule(double mass, double cost, String protocol, double powerCapacity) {
		// We fill out all of the super-ed fields.
		
		
		//super(mass); // do we need to super?
		//-> If we're using module as a superclass, then yes we should use super like this:
		super(mass, cost, protocol, powerCapacity);
	}

	/* (non-Javadoc)
	 * @see Thermo#get_thermal_reading()
	 */
	
	//shouldn't we make get_thermal_reading a method in the Thermo interface shared by 
	//all Thermo related objects?
	@Override
	public double get_thermal_reading() {
		// TODO Auto-generated method stub
		
		//this would return the parts thermal reading
		
		return 0;
	}

}
