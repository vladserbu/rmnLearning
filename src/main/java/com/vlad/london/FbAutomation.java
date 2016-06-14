package com.vlad.london;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FbAutomation {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("vlad.serbu@icloud.com");
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("/Chisinau2015");
        By.xpath(".//*[@id='loginbutton']']").findElement(driver).click();

    }


}
