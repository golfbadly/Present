public class DogSim extends Behavior{

	String dogBreeds;
	String dogName;
	String dogAge;
	String dogSex;
	String dogMove;
	String dogPowers;
	int dogBlood;

	String r;
	String p;

	public DogSim(){
	}
	
	public String dogBreeds(String breeds){	
	dogBreeds = breeds;
	return breeds;	
	}
	public String dogName(String name){	
	dogName = name;
	return name;
	}
	public String dogAge(String age){	
	dogAge = age;
	return age;
	}
	public String dogSex(String sex){	
	dogSex = sex;
	return sex;
	}
	public int dogBlood(int blood){	
	dogBlood = blood;
	return blood;
	}	
	public String dogMove(String move){	
	dogMove = move;
		if(dogMove.equals("t")){
               	r = setRun(new CanRun()); 
		}else if(dogMove.equals("f")){
               	r = setRun(new NotRun()); 
                }
	return r;	
	}
	public String dogPower(String power){	
	dogPowers = power;
		if(dogPowers.equals("n")){
                p = setPower(new Empty());
                }else if(dogPowers.equals("f")){
                p = setPower(new Fire());
                }else if(dogPowers.equals("i")){
                p = setPower(new Ice());
                }
	return p;	
	}
}
