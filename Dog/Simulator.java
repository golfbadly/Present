import java.util.*;
import java.io.*;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class Simulator{

	static Logger log = Logger.getLogger(Simulator.class.getName());

	public static void main(String[] args)throws IOException,SQLException{
	
		log.info("Wellcome to DogSimulator.");
		
		Menu m = new Menu();
		m.menu();
		
	}

}
