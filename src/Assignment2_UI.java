import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Joca.DESKTOP-U8BO8A3\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Zorzika");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("papadubika@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456BABA");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();

		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();

		// Thread.sleep(2000L);
		driver.findElement(By.xpath("//option[normalize-space()='Male']")).click();

		driver.findElement(By.xpath("//label[normalize-space()='Student']")).click();

		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01/01/1990");

		// Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

		/*
		 * Instructor solution
		 * driver.get("https://rahulshettyacademy.com/angularpractice/");
		 * 
		 * driver.findElement(By.name("name")).sendKeys("rahul");
		 * 
		 * driver.findElement(By.name("email")).sendKeys("hello@abc.com");
		 * 
		 * driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		 * 
		 * driver.findElement(By.id("exampleCheck1")).click();
		 * 
		 * WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		 * 
		 * Select abc = new Select(dropdown);
		 * 
		 * abc.selectByVisibleText("Female");
		 * 
		 * driver.findElement(By.id("inlineRadio1")).click();
		 * 
		 * driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		 * 
		 * driver.findElement(By.cssSelector(".btn-success")).click();
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(".alert-success")).
		 * getText());
		 */

	}

}
