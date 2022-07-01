package buggy_cars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\knish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("123456aA!");
		driver.findElement(By.className("btn-success")).click();
		driver.findElement(By.className("img-fluid")).click();
		driver.findElement(By.className("comments")).click();
//		driver.findElement(by.ti)
	}

}
