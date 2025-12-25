import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

public class Assignment_login_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Joca\\Downloads\\chromedriver-win64\\chromedriver-win64\\\\chromedriver.exe"
		 );

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// String[] itemsNeeded = { "iphone", "Samsung", "Nokia", "Blackberry" };

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		// addItems(driver, itemsNeeded);

		// Thread.sleep(3000);

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		// wait time implement
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		// driver.findElement(By.xpath("(//select[@class='form-control'])[1]")).click();

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));

		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        
		//select option from dropdown menu item
		Select dropdown = new Select(options);

		dropdown.selectByValue("consult");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		//System.out.println(driver.findElement(By.partialLinkText("Checkout")).getText());

		//make item list then list out all List items, add to cart
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();

	}

}
