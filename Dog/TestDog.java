import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDog {
	
	DogSim dog = new DogSim();

   	@Test
   	public void testdog() {

		dog.dogName("Jame");
                dog.dogBreeds("Poodle");
                dog.dogAge("Adult");
                dog.dogSex("Male");
                dog.dogBlood(1000);
               	dog.dogPower("f");
		dog.dogMove("f");				
		dog.dogMove("t");
                dog.walk();	 
                dog.eat();	 
                dog.sit();  
                dog.bark();       
		dog.dogPower("f"); 
		dog.dogPower("i");
		dog.dogPower("n");
 
   	}

}
