import java.io.*;
import java.util.*;

public class Write{
	 
	public Write(){
	}
		
	public void textMake(String data){
               
		try{

                File file =new File("outMake.txt");

                if(!file.exists()){
                        file.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(file.getName(),true);
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(data);
                bufferWritter.newLine();
		bufferWritter.close();

                }catch(IOException e){
                e.printStackTrace();
                }
        }     

	public void textArena(String data){
                try{

                File file =new File("outArena.txt");

                if(!file.exists()){
                        file.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(file.getName(),true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(data);
                bufferWritter.newLine();
		bufferWritter.close();

                }catch(IOException e){
                e.printStackTrace();
                }
        }

	public void textMenu(String data){
                try{

                File file =new File("outMenu.txt");

                if(!file.exists()){
                        file.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(file.getName(),true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(data);
                bufferWritter.newLine();
                bufferWritter.close();

                }catch(IOException e){
                e.printStackTrace();
                }
        }

}
