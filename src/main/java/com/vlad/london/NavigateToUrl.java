/**
 * Created by vserbu on 07/06/2016.
 */
package com.vlad.london;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class NavigateToUrl {

    public static void main (String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Weather in London");
        searchBox.submit();
        driver.manage().window().maximize();
        driver.close();
    }

}
