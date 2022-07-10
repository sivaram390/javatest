package section14_set_157;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class Selenium_Test {
	@After
    public static void endSelenium(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Tonik\\Siva\\chromedriver\\geckodriver.exe");
		//WebDriver driver  = new ChromeDriver();
		WebDriver fireDriver  = new FirefoxDriver();
		fireDriver.close();
        try{
        	fireDriver.quit();
        }catch (Exception e){
            System.out.println("Browser closed already, " +
                            "did not need to quit after all");
            e.printStackTrace();
        }
    }

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Tonik\\Siva\\chromedriver\\chromedriver.exe");
		//Selenium_Test driverQuit = new Selenium_Test();
		System.setProperty("webdriver.gecko.driver", "C:\\Tonik\\Siva\\chromedriver\\geckodriver.exe");
		//WebDriver driver  = new ChromeDriver();
		WebDriver fireDriver  = new FirefoxDriver();
		String currentUrl = fireDriver.getCurrentUrl();
		
		//WebDriver driver2  = new WebDriver();
		//fireDriver.navigate().to("http://www.google.com");
		fireDriver.manage().window().maximize();
		fireDriver.manage().deleteAllCookies();
		fireDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MILLISECONDS);
		fireDriver.manage().timeouts().implicitlyWait(3, TimeUnit.MILLISECONDS);
		fireDriver.get("https://www.google.com/");
		System.out.println(currentUrl);
		Selenium_Test.endSelenium();
		
		/*
		 * fireDriver.close(); fireDriver.quit();
		 */
		
		

	}

}
