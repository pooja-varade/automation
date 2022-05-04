package seleniumprogram;

public class browsingoperation {

	public static void main(String[] args) {
		String path1="C:\\Users\\Admin\\eclipse-workspace\\selenium\\executable\\chromedriver.exe";
		String path2=System.getProperty("user.dir")+"\\\\executable\\\\chromedriver.exe";
		
		System.out.println(System.setProperty("webdriver.crome.driver", path2));
		ChromeDriver cd=new ChromeDriver();
		

	}

}
