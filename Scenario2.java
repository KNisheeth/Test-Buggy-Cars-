package buggy_cars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\knish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-success-outline")).click();
		driver.findElement(By.name("confirmPassword")).click();
		driver.findElement(By.name("username")).sendKeys("abcd");
		driver.findElement(By.name("firstName")).sendKeys("ab");
		driver.findElement(By.name("lastName")).sendKeys("cd");
		driver.findElement(By.id("password")).sendKeys("123456aA!");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456aA!");
		driver.findElement(By.className("btn-default")).click();
	}

}
