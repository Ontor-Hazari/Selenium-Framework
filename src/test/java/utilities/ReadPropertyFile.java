package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	
		FileReader fr;
fr = new FileReader("C:\\Users\\Hp\\eclipse-workspace\\TestAutomotionFrameWork\\src\\test\\resources\\configfiles\\config.properties");

   Properties p = new Properties();
   
   p.load(fr);
   
   System.out.println(p.getProperty("browser"));
   System.out.println(p.getProperty("testurl"));




	}

}
