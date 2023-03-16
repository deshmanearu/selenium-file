package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);
		
		//Multipliction 
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='×']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='=']")).click();
		Thread.sleep(2000);
		
		//Division
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='=']")).click();
		Thread.sleep(2000);
		
		//Addition
		driver.findElement(By.xpath(".//span[text()='AC']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='–']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='+']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='=']")).click();
		Thread.sleep(2000);
		
		//Substraction
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='–']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='–']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='=']")).click();
		Thread.sleep(2000);
	}

}
