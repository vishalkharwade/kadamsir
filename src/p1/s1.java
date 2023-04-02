package p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class s1 {public static void main(String[] args) throws InterruptedException {
String exp="redmi note 11";
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions Z=new ChromeOptions();
	Z.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(Z);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://google.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
List<WebElement> all = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
for(WebElement opt:all) {
String act = opt.getText();
if(act.equals(exp)) {
	opt.click();
	break;
}
}


}

}
