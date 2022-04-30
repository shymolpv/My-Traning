package SchoolTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseFun.Baseclass;

public class SchoolTestcases  extends Baseclass
{
public WebDriver driver;
@BeforeMethod
public void intilizesetup() 
{
driver=	initilizebrwser();

}
@Test
public void Tc001 () throws InterruptedException
{
	//driver.get("https://www.javatpoint.com/");
	//driver.findElement(By.id("gsc-i-id2")).sendKeys("java");
	//driver.findElement(By.name("search")).sendKeys("java");
	//driver.navigate().to("http://automationpractice.com/index.php");
	//driver.navigate().back(); 
	//driver.navigate().forward(); 
	//driver.navigate().refresh();
	//driver.close(); 
	//driver.quit();
	
	//driver.get("https://www.amazon.in/");
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	//List<WebElement> products=driver.findElements(By.xpath("//div[@class='a-section']//span[@class='a-size-medium a-color-base a-text-normal']"));
	//System.out.println(products.size());
	//for(int i=0;i<=products.size();i++) {
	//System.out.println(products.get(i).getText());
	//String  S1= "Apple iPhone 12 (128GB) - Blue";
	//String  S2 = products.get(i).getText();
	//if(products.get(i).getText()== S2){
		//products.get(i).click();
//}
//}
	
	driver.get("https://www.amazon.in/");	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	driver.findElement(By.id("nav-search-submit-button")).click();	
	driver.navigate().to("https://www.goibibo.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='sc-gsNilK dImRia' and text()='One-way']")).click();
	//driver.findElement(By.xpath("//span[@class='sc-gsNilK dImRia' and text()='Round-trip']")).click();
	//driver.navigate().to("https://www.amazon.in/Auto-Hub-Motorcycle-Washing-Cleaning/dp/B07BCB8519?ref_=Oct_d_omwf_d_5257496031&pd_rd_w=8LrTS&pf_rd_p=434d119d-9748-44f8-9f20-db43f557cf30&pf_rd_r=Z5T2JWGZ434BFCY2TYNF&pd_rd_r=9dbc88fe-30c5-4ca5-90a9-7fa982166224&pd_rd_wg=aeddC&pd_rd_i=B07BCB8519");
    //driver.findElement(By.id("landingImage")).click();
	//driver.navigate().to("https://www.amazon.in/Redgear-MP35-Speed-Type-Gaming-Mousepad/dp/B01J1CFO5I/ref=sr_1_1?qid=1651080970&s=computers&sr=1-1&th=1");
    //driver.findElement(By.id("landingImage")).click();
    
    driver.navigate().to("https://www.amazon.in/b?node=1389401031");
    driver.findElement(By.xpath("//span[text()='Made for Amazon']//preceding::input[@type='checkbox']")).click();
    
    
}
}
