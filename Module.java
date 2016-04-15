
public abstract class Module {
	
	double mass;
	double cost;
	String protocol;
	double power_capacity;
	
	//We should probably use this constructor which allows us to use 
	//super to hold all the data for every module:
	
	Module(double mass, double cost, String protocol, double power_capacity){
		this.mass = mass;
		this.cost = cost;
		this.protocol = protocol;
		this.power_capacity = power_capacity;
	}
	
}
