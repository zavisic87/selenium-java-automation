import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selen {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//Safari - SafariDriver -> Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		//chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joca.DESKTOP-U8BO8A3\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Joca.DESKTOP-U8BO8A3\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Edge Launch
		//webdriver.msedge.driver
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Joca.DESKTOP-U8BO8A3\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();

	}

}
