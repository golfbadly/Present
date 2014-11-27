import java.util.*;
import java.io.*;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class Menu{

	static Logger log = Logger.getLogger(Menu.class.getName());

	public Menu(){

	}

        public void menu()throws IOException,SQLException{

		log.info("Menu class");
		log.info("Play with dog. Enter _s_\nGo to arena. Enter _a_\nExit. Enter _q_");

                Scanner scan = new Scanner(System.in);
                Make make = new Make();
                Arena arena = new Arena();

                String s = "";
                while(!(s.equals("q"))){
                println("Play with dog. Enter _s_\nGo to arena. Enter _a_\nExit. Enter _q_");
                print("Enter: ");
                s = scan.nextLine();
		scan(s);

		log.debug(s);

                if(s.equals("s")){
                make.create();
                log.info("Call class Make"); 
		}else if(s.equals("a")){
                arena.selectDog();
                log.info("Call class Arena"); 
		}else if(s.equals("q")){
               	log.info("Exit"); 
		System.exit(0);
                }else{
                println("Please new select.");
                log.warn("Selection miss."); 
		}
                }
        }

	public void println(String str){
                System.out.println(str);
                Write text = new Write();
                text.textMenu(str);
        }

        public void print(String str){
                System.out.print(str);
                Write text = new Write();
                text.textMenu(str);
        }

        public void scan(String str){
                Write text = new Write();
                text.textMenu(str);

        }

}

