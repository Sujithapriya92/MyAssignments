package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCode {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

	}

}
