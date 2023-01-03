package webFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.epam.healenium.SelfHealingDriver;

public class BaseClass {

	protected SelfHealingDriver driver;
	
	@BeforeTest
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		options.addArguments("--window-size=1920,1080");
		
		//declare delegate
		WebDriver delegate = new ChromeDriver(options);
		//create Self-healing driver
		driver = SelfHealingDriver.create(delegate);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:////Users/meenu.rani/eclipse-workspace/healeniumt/simple-login-page-in-html/index.html");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
