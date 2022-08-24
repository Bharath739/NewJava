package Com.Practiece;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	static Properties pro=null;
	
	static FileInputStream fi=null;
	
	public static void readPropertiesFile(String path) {
		try {
			fi=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		public static void load() {
			
			
			
			
			
			
		}
		
		
		
	}
	
	
}
