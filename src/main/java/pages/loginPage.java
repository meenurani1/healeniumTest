package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.healenium.SelfHealingDriver;

public class loginPage {

	SelfHealingDriver driver;
	
	public loginPage(SelfHealingDriver driver2) {
		this.driver=driver2;
	}
	
	public void enterUserName(String userName) {
		System.out.println("Enter User name");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		System.out.println("Enter password");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		System.out.println("Click login button");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@class='module'][text()='Vendor Manager Suite ']")));
	}
}
