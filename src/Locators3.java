import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Locators3 {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Joca.DESKTOP-U8BO8A3\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

driver.findElement(By.xpath("(//input[@value='radio3'])[1]")).click();

driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Serbia");

driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();

driver.findElement(By.xpath("//select[@id='dropdown-class-example']/child::option[3]")).click();

driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jovica");

driver.findElement(By.id("alertbtn")).click();

driver.findElement(By.cssSelector("alertbtn")).click();








}



}