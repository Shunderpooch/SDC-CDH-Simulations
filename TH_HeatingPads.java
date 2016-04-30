
public class TH_HeatingPads extends Module implements TH{
	
	double inputVoltage;
	//double current; 
	double outputVoltage;
	double temperature;
	
	public TH_HeatingPads(double mass, double cost, String protocol, double powerCapacity){
		super(mass, cost, protocol, powerCapacity);
		this.inputVoltage = 0.0;
		this.outputVoltage = 0.0;
		this.temperature = 0.0;
	}
	
	public void setInputVoltage(double input){
		this.inputVoltage = input;
	}
	
	public double getSetOutVoltage(){
		this.outputVoltage = 1; //insert equation mapping input voltage to output voltage
		return this.outputVoltage;
	}
	
	public double get_thermal_reading() {
		// TODO Auto-generated method stub
		
		//this would return the thermistor's thermal reading
		
		return 0;
	}

}
