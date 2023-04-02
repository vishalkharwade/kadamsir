package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class New {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions Z=new ChromeOptions();
	Z.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(Z);
	
}
}
