package seleniumprogram;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver {
	public static void main(String[] args) {
	
	String path1="C:\\Users\\Admin\\eclipse-workspace\\selenium\\executable\\chromedriver.exe";
	String path2=System.getProperty("user.dir")+"\\\\executable\\\\chromedriver.exe";
	
	System.out.println(System.setProperty("webdriver.chrome.driver", path2));
	ChromeDriver cdriver=new ChromeDriver();
}
}
