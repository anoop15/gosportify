package com.gosportify;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_FB {
  
		WebDriver driver =new FirefoxDriver();
		LoginObjects logobj=new LoginObjects();
	
	@BeforeTest
	public void Siteload(){
		driver.get("https://gosportify.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	/*@Test
  public void loginfb() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	logobj.clickonlogin(driver).click();
	logobj.clickonfacebook(driver).click();
	driver.findElement(By.xpath(".//*[@id='mainheader']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	driver.findElement(By.xpath(".//*[@id='myModalTwo']/div/div/div[2]/form/p[1]/a")).click();
	String Uname=childwindow();
	System.out.println(Uname);
	if (Uname.equals("  Anoop Sharma")){
		System.out.println("Test Pass ");
	}
	else
		System.out.println("Test fail");
	driver.close();
	
	}
	
	
	
	
	public String childwindow(){
		String parent_window = driver.getWindowHandle();
		Set<String>s1 =  driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext()){
			String child_window= i1.next();
			if (!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				driver.findElement(By.id("email")).sendKeys("anooprthe@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("123anoop");
				driver.findElement(By.id("u_0_2")).click();
			}
		}
		driver.switchTo().window(parent_window);
		String username= driver.findElement(By.xpath(".//*[@id='mainheader']/div[1]/div/div/div[2]/ul/li[5]/a")).getText();
		return username;
		}
	*/
	
	@Test
	public void googlelogin()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		logobj.clickonlogin(driver).click();
		logobj.clickongoogle(driver).click();
		//driver.findElement(By.xpath(".//*[@id='myModalTwo']/div/div/div[2]/form/p[3]/a")).click();
		driver.findElement(By.id("Email")).sendKeys("anooprthe@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("anoop123#");
		driver.findElement(By.id("signIn")).click();
		//String Uname=childwindowgoogle("anooprthe@gmail.com", "anoop#123");
		String username= driver.findElement(By.xpath(".//*[@id='mainheader']/div[1]/div/div/div[2]/ul/li[5]/a")).getText();
		System.out.println(username);
		if (username.equals("  Anoop Sharma")){
			System.out.println("Test Pass ");
		}
		else
			System.out.println("Test fail");
		driver.close();
	}
	
	
	
}
