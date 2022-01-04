package Code.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week1testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		    
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    // Click on Leads
	 	driver.findElement(By.linkText("Leads")).click();
	 		
	 	// Click on Create Lead
	 	driver.findElement(By.linkText("Create Lead")).click();
	 		
	 	// Enter Company Name
	 	
	 	
	 	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 		
	 	// Enter First Name
	 	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");
	 	
	 	String firstName = driver.findElement(By.id("createLeadForm_firstName")).getText();
	 		
	 	// Enter Last NAme
	 	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
	 	String lastName = driver.findElement(By.id("createLeadForm_lastName")).getText();
	 	
	 	driver.findElement(By.name("submitButton")).click();	
	 	
	 	String tit=driver.getTitle();
		System.out.println(tit);
		System.out.println(firstName);
		System.out.println(lastName);	
		
		driver.close();
	    

	}

}
