package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {
		String key="webdriver.edge.driver";
		String value="./msedgedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new EdgeDriver();
	}

}
//first pull
