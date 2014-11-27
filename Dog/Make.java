import java.util.*;
import java.io.*;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class Make{

	static Logger log = Logger.getLogger(Make.class.getName());

	Scanner scan = new Scanner(System.in);
	DogSim dog = new DogSim();	
	DogSim dog1 = new DogSim();	
	DogSim dog2 = new DogSim();
	DogSim dog3 = new DogSim();
	DogSim dog4 = new DogSim();
	DogSim dog5 = new DogSim();	
	Menu menu = new Menu();

	String name;
	String commands;

	public Make(){
	
	}

	public void create()throws IOException,SQLException{	

		log.info("Make class");
	 	
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

	select();	
	}

	public void select()throws IOException,SQLException{
		
		log.info("Select dog.");
		
		println("Menu. Enter _m_");	
		print("Select: ");
		String select = scan.nextLine();
		scan(select);
		
		log.info(select);	
	
			if(select.equals("m")){
			menu.menu();	
			}else if(select.equals("1")){
			name = dog1.dogName("Jame");
			}else if(select.equals("2")){
			name = dog2.dogName("John");
			}else if(select.equals("3")){
                        name = dog3.dogName("Jane");
			}else if(select.equals("4")){
                        name = dog4.dogName("June");
			}else if(select.equals("5")){
                        name = dog5.dogName("Jake");	
			}else{
			println("Please select number.");
			log.warn("Selection miss");	
			create();	
			}	
			println("You select: "+name);	
		
			log.debug(name);
	
	command(name,select);
	}

	public void command(String name,String select)throws IOException,SQLException{
		
		log.info("Select command.");
		log.info("Command list: 1.Run 2.Walk 3.Eat 4.Sit 5.Bark 6.Power 7.New Selection. 8.Exit");
		
		String command = "";
		while(!(command.equals("7")) || !(command.equals("8"))){
		println("Command list: 1.Run 2.Walk 3.Eat 4.Sit 5.Bark 6.Power 7.New Selection. 8.Exit");
		print("Command: ");
		command = scan.nextLine();
		scan(command);
	
		log.debug(command);
 
			 if(command.equals("8")){
			 System.exit(0);
			 }else if(command.equals("1")){
                         	if(select.equals("5")){
				commands = dog.dogMove("f");	
				}else{	
				commands = dog.dogMove("t");
				}
                         }else if(command.equals("2")){
                         commands = dog.walk();	 
                         }else if(command.equals("3")){
                         commands = dog.eat();	 
                         }else if(command.equals("4")){
                         commands = dog.sit();  
                         }else if(command.equals("5")){
                         commands = dog.bark();       
                       	 }else if(command.equals("6")){
                        	if(select.equals("1") || select.equals("3")){ 
				commands = dog.dogPower("f"); 
	        		}else if(select.equals("2") || select.equals("4")){
				commands = dog.dogPower("i");
				}else{
				commands = dog.dogPower("n");
				} 
			 }else if(command.equals("7")){     
                         create(); 
			 }else{
                         commands = "Please select number.";
                         log.warn("Selection miss.");	 
			 }
			 println(name+": "+commands);		
	
			 log.debug(name+" "+commands);	
		}	
	}

	public void println(String str){
                System.out.println(str);
                Write text = new Write();
                text.textMake(str);    
        }

        public void print(String str){
                System.out.print(str);
                Write text = new Write();
                text.textMake(str);
        }

        public void scan(String str){
                Write text = new Write();
                text.textMake(str);

        }







}
