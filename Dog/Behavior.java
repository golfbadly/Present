public abstract class Behavior{
	Run dogRun;
	Power dogPower;

	public Behavior(){

	}

	public String setRun(Run r){
	dogRun = r;	
	return dogRun.run();
	}
	public String walk(){
	return "Walk";
	}
	public String eat(){
	return "Eat";
	}	
	public String sit(){
	return "Sit";
	}
	public String bark(){
	return "Bark";
	}
	public String setPower(Power p){
	dogPower = p;	
	return dogPower.power();
	}
}
