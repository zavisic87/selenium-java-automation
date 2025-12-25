package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Joca\\Downloads\\chromedriver-win64\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]

		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText());
		
		driver.switchTo().window(parentId);
		
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText());

	}
}