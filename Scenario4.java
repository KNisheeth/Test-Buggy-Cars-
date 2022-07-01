package buggy_cars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scenario4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\knish\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("login")).sendKeys("qwert");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.className("btn-success")).click();
//		driver.close();
	}

}
