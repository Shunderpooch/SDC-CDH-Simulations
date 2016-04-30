
public class TH_Thermistor extends Module{
	double inputVoltage;
	double current; 
	double outputVoltage;
	double temperature;//of component its connected to
	double resistance;
	
	public TH_Thermistor(double mass, double cost, String protocol, double powerCapacity){
		super(mass, cost, protocol, powerCapacity);
		this.inputVoltage = 0.0;
		this.outputVoltage = 0.0;
		this.temperature = 0.0;
		this.current = 0.0;
		this.resistance = 0.0;
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
	
	public double getTemperature(double resistance){
		return (-44.86*java.lang.Math.log(resistance) + 504.91);
		//R^2 = 0.9801
		//based on data sheet in google drive
	}
	
	public double getResistance(double temp){
		return 1*Math.pow(10, -8)*Math.pow(temp, 6) - 1*Math.pow(10, -5)*Math.pow(temp, 5) 
				+ 0.0035*Math.pow(temp, 4) - 0.6207*Math.pow(temp, 3) + 57.223*Math.pow(temp, 2) 
				- 2919.1*temp + 82158;
		
		//R^2 = 0.99889
	}
	
}
