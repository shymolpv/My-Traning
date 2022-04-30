package BaseFun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
	public WebDriver driver;;
public WebDriver initilizebrwser()
{
	System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
	}
}
