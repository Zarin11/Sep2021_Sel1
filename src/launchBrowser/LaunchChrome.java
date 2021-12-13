package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;/// it is an interface
import org.openqa.selenium.chrome.ChromeDriver;/// implementing from the interface

public class LaunchChrome {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\flora\\Selenium2021\\Selenium_Project_1\\ch\\chromedriver_win32\\chromedriver.exe");//key,value
	WebDriver driver=new ChromeDriver();//// launches chrome
	driver.manage().window().maximize();// checks the browser window is maximized
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");///checks if the name selenium turns up in the search bar
	//driver.findElement(By.name("btnK")).click();///checks if the user can hit /click the search button/takes the user in the search page
	Thread.sleep(3000);/// need to put this before close so it does not close too quickly for 3000ms or 3s
driver.close();/// cchecks is the browser closes
	
}
}
