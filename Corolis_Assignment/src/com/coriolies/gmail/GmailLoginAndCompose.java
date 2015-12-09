package com.coriolies.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GmailLoginAndCompose {
public static void main(String[] args) {
// Create a new instance of the Firefox driver
WebDriver driver = new FirefoxDriver();
GmailLoginAndCompose gmaillogin = new GmailLoginAndCompose();
gmaillogin.getUrl(driver);
gmaillogin.login(driver);
gmaillogin.composeEmail(driver);
//driver.close();
}
public  void getUrl(WebDriver driver)
{

driver.get("https://mail.google.com/mail/u/0/h/1xzmvph84ddku/");// Maximize the window.
driver.manage().window().maximize();
	
}
public  void login(WebDriver driver)
{
	driver.findElement(By.id("Email")).sendKeys("pathik09@gmail.com");
	driver.findElement(By.id("next")).click();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = wait.until(
	    ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

	// Enter Password
	driver.findElement(By.name("Passwd")).sendKeys("PATHIK@09");

	// Click on 'Sign In' button
	driver.findElement(By.id("signIn")).click();//.clickk on Compose Mail.
	
}
public void composeEmail(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@accesskey='c']")).click();
	driver.findElement(By.name("body")).sendKeys("NAME:PATHIK SUTARIA");
	driver.findElement(By.name("body")).sendKeys("CONTACT NO:09833579056");
//https://github.com/pathik09/CoriolisAssignment
	driver.findElement(By.name("body")).sendKeys("GIT HUB URL : https://github.com/pathik09/CoriolisAssignment");
	
}
}

