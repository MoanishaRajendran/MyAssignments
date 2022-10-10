package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AsgmtCreatLead {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/contro;/main");
	driver.manage().window().maximize();
	 WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	elementLeads.click();
	WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	elementCreateLead.click();
	WebElement elementcompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	elementcompanyName.sendKeys("Cognizant");
	WebElement elementfirstName = driver.findElement(By.id("createLeadForm_firstName"));
	elementfirstName.sendKeys("Moanisha");
	WebElement elementlastName = driver.findElement(By.id("createLeadForm_lastName"));
	elementlastName.sendKeys("Rajendran");
	WebElement elementfirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	elementfirstNameLocal.sendKeys("Nisha");
	WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
	elementdepartmentName.sendKeys("IT");
	WebElement elementdescription = driver.findElement(By.id("createLeadForm_description"));
	elementdescription.sendKeys("Automation testing and Manual testing");
	WebElement elementprimaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
	elementprimaryEmail.sendKeys("misha@gmail.com");
	WebElement CreateLead = driver.findElement(By.className("smallSubmit"));
	CreateLead.click();
	System.out.println("The title is:" + driver.getTitle());
}
}