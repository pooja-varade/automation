package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gekodriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String path=System.getProperty("user.dir")+"\\executable\\geckodriver.exe";
		System.out.println(System.setProperty("webdriver.gecko.driver", path));
		
		WebDriver driver=new FirefoxDriver();
	}

}
