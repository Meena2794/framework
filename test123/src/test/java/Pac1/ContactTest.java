package Pac1;

import org.testng.annotations.Test;

public class ContactTest {

@Test
public void createcontactTest() {
	
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser","chrome");
	String UN = System.getProperty("username");
	String PW = System.getProperty("password");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(UN);
	System.out.println(PW);
	System.out.println("EXECUTE createcontactTest");

}
public void modifycontactTest() {
	
	
	System.out.println("EXECUTE modifycontactTest");

}
}
