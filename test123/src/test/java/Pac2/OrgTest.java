package Pac2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createorgTest() {String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser","chrome");
	String UN = System.getProperty("username");
	String PW = System.getProperty("password");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(UN);
	System.out.println(PW);
		
		System.out.println("EXECUTE createorgTest");

	}
	@Test
	public void modifyorgTest() {
		
		
		System.out.println("EXECUTE modifyorgTest");

	}
}
