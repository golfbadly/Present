import java.util.*;
import java.io.*;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class Arena{

	static Logger log = Logger.getLogger(Arena.class.getName());
	
	Scanner scan = new Scanner(System.in);
        DogSim dog = new DogSim();
        DogSim dog1 = new DogSim();
        DogSim dog2 = new DogSim();
        DogSim dog3 = new DogSim();
        DogSim dog4 = new DogSim();
        DogSim dog5 = new DogSim();
        Menu menu = new Menu(); 

        String name;
        String name2; 
	String redDog;
	String blueDog;
	int blood;
	int blood2;	
	String power;	
	String power2;
	int damageRed;
	int damageBlue;
	
	public Arena(){
	
	}
	public void selectDog()throws IOException,SQLException{
		
		log.info("Arena class");

		println("Dog list:");	
		
                println("1."+ 
                dog1.dogName("Jame")+" "+
                dog1.dogBreeds("Poodle")+" "+
                dog1.dogAge("Adult")+" "+
                dog1.dogSex("Male")+" "+
                dog1.dogBlood(1000)+" "+
               	dog1.dogPower("f") 
		);
 
                println("2."+
                dog2.dogName("John")+" "+
                dog2.dogBreeds("Labrador")+" "+
                dog2.dogAge("Children")+" "+
                dog2.dogSex("Male")+" "+
                dog2.dogBlood(1600)+" "+
                dog2.dogPower("i")
                );

                println("3."+
                dog3.dogName("Jane")+" "+
                dog3.dogBreeds("Beagle")+" "+
                dog3.dogAge("Adult")+" "+
                dog3.dogSex("Female")+" "+
                dog3.dogBlood(1300)+" "+
                dog3.dogPower("f")
                );

                println("4."+
                dog4.dogName("June")+" "+
                dog4.dogBreeds("Pitbull")+" "+
                dog4.dogAge("Adult")+" "+
                dog4.dogSex("Male")+" "+
                dog4.dogBlood(1700)+" "+
                dog4.dogPower("i")
                );

                println("5."+
                dog5.dogName("Jake")+" "+
                dog5.dogBreeds("Bulldog")+" "+
                dog5.dogAge("Old")+" "+
                dog5.dogSex("Male")+" "+
                dog5.dogBlood(1400)+" "+
                dog5.dogPower("n")
                );	
	
	selectFight();	
	}
	public void selectFight()throws IOException,SQLException{
		
		log.info("Select dog to fight.");
		log.info("Menu. Enter _m_\nExit. Enter _q_");

		println("Menu. Enter _m_");	
		println("Exit. Enter _q_");	
		print("Select RedDog: ");
		String select = scan.nextLine();
		scan(select);
		log.debug(select);

			if(select.equals("q")){
			System.exit(0);	
			}else if(select.equals("m")){
			menu.menu();	
			}else if(select.equals("1")){
			name = dog1.dogName("Jame");
			blood = dog1.dogBlood(1000); 
			power = dog1.dogPower("f");
			damageRed = 100; 	
			}else if(select.equals("2")){
			name = dog2.dogName("John");
			blood = dog2.dogBlood(1600); 
			power = dog2.dogPower("i");	
			damageRed = 160;	
			}else if(select.equals("3")){
                        name = dog3.dogName("Jane");
			blood = dog3.dogBlood(1300); 
			power = dog3.dogPower("f");
			damageRed = 130;
			}else if(select.equals("4")){
                        name = dog4.dogName("June");
			blood = dog4.dogBlood(1700); 
			power = dog4.dogPower("i");
			damageRed = 170;
			}else if(select.equals("5")){
                        name = dog5.dogName("Jake");
			blood = dog5.dogBlood(1400);
			power = dog5.dogPower("n");
			damageRed = 14;			
			}else{
			println("Please select number.");
			log.warn("Selection miss");	
			selectDog();	
			}	
			println("RedDog: "+name);
			
			log.debug(name);
	
                print("Select BlueDog: ");
                String select2 = scan.nextLine();
       		scan(select2);
		log.debug(select2);
 
	               	if(select2.equals("q")){
			System.exit(0);	
			}else if(select2.equals("m")){
			menu.menu();	
			}else if(select2.equals("1")){
			name2 = dog1.dogName("Jame");
			blood2 = dog1.dogBlood(1000); 
			power2 = dog1.dogPower("f");
			damageBlue = 100;	
			}else if(select2.equals("2")){
			name2 = dog2.dogName("John");
			blood2 = dog2.dogBlood(1600); 
			power2 = dog2.dogPower("i");
			damageBlue = 160;	
			}else if(select2.equals("3")){
                        name2 = dog3.dogName("Jane");
			blood2 = dog3.dogBlood(1300); 
			power2 = dog3.dogPower("f");
			damageBlue = 130;
			}else if(select2.equals("4")){
                        name2 = dog4.dogName("June");
			blood2 = dog4.dogBlood(1700); 
			power2 = dog4.dogPower("i");
			damageBlue = 170;
			}else if(select2.equals("5")){
                        name2 = dog5.dogName("Jake");
			blood2 = dog5.dogBlood(1400);
			power2 = dog5.dogPower("n");
			damageBlue = 14;		
			}else{
			println("Please select number.");
			log.warn("Selection miss");	
			selectDog();	
			}	 
			println("BlueDog: "+name2);

			log.debug(name2);

	fight(name,name2,blood,blood2,power,power2,damageRed,damageBlue);	
	}
	
	public void fight(String name,String name2,int blood,int blood2,String power,String power2,int damageRed,int damageBlue)
	throws IOException,SQLException{
	
		log.info("Dog fighting");
	
		if(name != name2){	
		println("Result");
		println("RedDog:"+name+" "+power+" "+blood);
		println("BlueDog:"+name2+" "+power2+" "+blood2);
		}else{
		println("You can't select dog duplicate.\nPlease new selection.");
		log.warn("Selection miss");	
		selectDog();
		}
	
		int hpRed = blood;
		int hpBlue = blood2;
	
		String loop = "";	
			while(!(loop.equals("0"))){	
				hpRed = hpRed - damageBlue;
                                hpBlue = hpBlue - damageRed;

				if(hpRed < 0){
                                break;
                                }else if(hpBlue < 0){
                                break;
                                }

				println("RedDog: "+name+" "+power+" "+damageRed+" damage. Hp: "+hpRed);
                                println("BlueDog: "+name2+" "+power2+" "+damageBlue+" damage. Hp: "+hpBlue);	
			}	
			if(hpBlue < 0){	
			println("\nWinner: RedDog "+name+"\n");
			log.debug(name+" win.");	
			}else if(hpRed < 0){
			println("\nWinner: BlueDog "+name2+"\n");
			log.debug(name2+" win.");	
			}	

	selectDog();	
	}

	public void println(String str){
                System.out.println(str);
                Write text = new Write();
                text.textArena(str);    
        }

        public void print(String str){
                System.out.print(str);
                Write text = new Write();
                text.textArena(str);
        }

        public void scan(String str){
                Write text = new Write();
                text.textArena(str);

        }




}
