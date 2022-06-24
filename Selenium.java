package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	 public static void main(String[] args)
	 {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 WebElement usernameElement = driver.findElement(By.id("username"));
		 usernameElement.sendKeys("Demosalesmanager");
		 WebElement passwordElement = driver.findElement(By.id("password"));
		 passwordElement.sendKeys("crmsfa");
		 WebElement LoginElement = driver.findElement(By.className("decorativeSubmit"));
		 LoginElement.click();
		 WebElement CrmlinkElement = driver.findElement(By.linkText("CRM/SFA"));
		 CrmlinkElement.click();
		 WebElement LeadsElement = driver.findElement(By.linkText("Leads"));
		 LeadsElement.click();
		 WebElement CreateleadElement = driver.findElement(By.linkText("Create Lead"));
		 CreateleadElement.click();
		 WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		 companyNameElement.sendKeys("Wipro");
		 WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		 firstnameElement.sendKeys("sasi");
		 WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		 lastnameElement.sendKeys("M");
		 WebElement firstnameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 firstnameLocalElement.sendKeys("Sasi");
		 WebElement DepartmentElement = driver.findElement(By.id("createLeadForm_departmentName"));
		 DepartmentElement.sendKeys("IT");
		 WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
		 descriptionElement.sendKeys("Welcome to Wipro");
		 WebElement emailAddressElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		 emailAddressElement.sendKeys("Sasikumar.manivel@gmail.com");
		 WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dr = new Select(stateElement);
		 dr.selectByVisibleText("New York");
		 WebElement submitElement = driver.findElement(By.className("smallSubmit"));
		 submitElement.click();
		 System.out.println("The title is :"+driver.getTitle());
	     WebElement editElement = driver.findElement(By.linkText("Edit"));
		 editElement.click();
		 WebElement removeElement = driver.findElement(By.id("updateLeadForm_description"));
		 removeElement.clear();
		 WebElement importantElement = driver.findElement(By.id("updateLeadForm_importantNote"));
	     importantElement.sendKeys("Hello All");
	     WebElement updateElement = driver.findElement(By.className("smallSubmit"));
	     updateElement.click();
	     System.out.println("The title is :"+driver.getTitle());
	     WebElement duplicateElement = driver.findElement(By.linkText("Duplicate Lead"));
	     duplicateElement.click();
	     WebElement companyrenameElement = driver.findElement(By.id("createLeadForm_companyName"));
	     companyrenameElement.clear();
	     companyrenameElement.sendKeys("Wipro Technology");
	     WebElement firstnamerenameElement = driver.findElement(By.id("createLeadForm_firstName"));
	     firstnamerenameElement.clear();
	     firstnamerenameElement.sendKeys("Sasikumar");
	     WebElement LeadElement = driver.findElement(By.className("smallSubmit"));
	     LeadElement.click();
	     System.out.println("The title is :"+driver.getTitle());
	     
	     
	 }	 
	 

	 
	  
	 
}

