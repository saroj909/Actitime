package assertAndSoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import testcaseforOrangehrm.OrangeHrmLoginPage;

public class Softassert 
{   @Test
	public void softassert() 
 {
	EdgeOptions option=new EdgeOptions();
	//option.addArguments("headless");
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("disable notification");
	System.setProperty("webdriver.chrome.silentOutput", "true");
	System.setProperty("webdriver.chrome.driver", "./driver/msedgedriver.exe");
	WebDriver driver = new EdgeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	OrangeHrmLoginPage ohmlogin= new OrangeHrmLoginPage(driver);
	ohmlogin.loginMethod();
	String actualtitle= driver.getTitle();
	//System.out.println(actualtitle);
	String exceptedtitle= "OrangeHRm";
	Softassert s = new Softassert();
	s.softassert();
	System.out.println("- both title are matching-");
	driver.quit();
 }
}
