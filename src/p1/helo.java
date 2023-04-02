package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions Z=new ChromeOptions();
		Z.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Z);
		//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://sbi.co.in/");
	driver.findElement(By.xpath("//a[text()='Loans'")).click();
	
}}