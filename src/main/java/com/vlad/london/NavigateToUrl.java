/**
 * Created by vserbu on 07/06/2016.
 */
package com.vlad.london;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigateToUrl {

    public static void main (String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.vouchercodes.co.uk");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Sky");
        searchBox.submit();
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div/section[2]/div/button[2]")).click();
        driver.manage().window().maximize();
        driver.close();
    }

}
