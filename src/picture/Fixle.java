package picture;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fixle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C://Users//EMTI//eclipse-workspace//Iframe_handle//DRIVER//geckodriver.exe");
//System.setProperty("webdriver.chrome.driver", "C://Users//EMTI//eclipse-workspace//Iframe_handle//DRIVER//chromedriver.exe");		
	WebDriver driver = new FirefoxDriver();	
	driver.get("http://demo.guru99.com/test/guru99home");
	System.out.println("Webpage open successfully by Emtiaz Ahmed");
	Thread.sleep(2000);
		
	//Scrolling window down
	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)", "");
		//jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	//Handle iframe
	List<WebElement> iframecount= driver.findElements(By.tagName("iframe"))	;
	System.out.println("The total iframe in this page is:"+iframecount.size());
	
	//driver.switchTo().frame(0);//by index
	driver.switchTo().frame("a077aa5e");//by id
	//driver.switchTo().defaultContent();
		
	// TODO Auto-generated method stub

	}

}
