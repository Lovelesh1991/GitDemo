package qaclickacademy;

import org.testng.annotations.Test;

public class SeleniumTest {
     //Triggering TestNG File From Maven
	//How to execute all test cases from Test Folder with Maven- mvn test
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
	}

	@Test
	public void elementsUi() {
		System.out.println("elementsUi");
	}
}
