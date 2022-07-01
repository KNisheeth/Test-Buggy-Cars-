package buggy_cars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\knish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).sendKeys("testAR");
		driver.findElement(By.name("password")).sendKeys("12345678aA!");
		driver.findElement(By.className("btn-success")).click();
		driver.findElement(By.cssSelector("a[href='/overall']")).click();
		driver.findElement(By.cssSelector("img[src='/img/cars/spider.jpg']")).click();
		driver.findElement(By.cssSelector("button[class='btn-success']")).click();
	}

}
