import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes_exercise {

	public static void main(String[] args) {
		// 1. Check the first Checkbox and verify if it is successfully checked and
		// Uncheck it again to verify if it is successfully Unchecked
		// 2. How to get the Count of number of check boxes present in the page

		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Joca\\Downloads\\chromedriver-win64\\chromedriver-win64\\\\chromedriver.exe"
		 );
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// ***1***

		/*
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ----my old way to check ;
		 * 
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * 
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 */

		driver.findElement(By.id("checkBoxOption1")).click();

		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("Checkbox is successfully checked.");

		driver.findElement(By.id("checkBoxOption1")).click();

		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("Checkbox is successfully unchecked now.");

		// ***2***

		List<WebElement> options = driver.findElements(By.cssSelector("input[type='checkbox']"));

		for (WebElement option : options)

		{

			if (true)

			{

				System.out.println("Number of checkboxes on page is "
						+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());

				break;

			}

		}

	}

}
