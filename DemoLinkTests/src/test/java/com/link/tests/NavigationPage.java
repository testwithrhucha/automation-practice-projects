package com.link.tests;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {
    WebDriver driver;

    
    By homeLink = By.xpath("//*[@id=\"ctl00_udHeaderMenu_rptLevel1_ctl01_liParent\"]/a");
    By aboutLink = By.xpath("//*[@id=\"ctl00_udHeaderMenu_rptLevel1_ctl02_liParent\"]/a");
    By servicesLink = By.xpath("//*[@id=\"ctl00_udHeaderMenu_rptLevel1_ctl03_liParent\"]/a");
    By quickLink = By.xpath("//*[@id=\"ctl00_udHeaderMenu_rptLevel1_ctl07_liParent\"]/a");
    By contactLink = By.xpath("//*[@id=\"ctl00_udHeaderMenu_rptLevel1_ctl08_liParent\"]/a");

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHome() {
        driver.findElement(homeLink).click();
    }

    public void clickAbout() {
        driver.findElement(aboutLink).click();
    }

    public void clickServices() {
        driver.findElement(servicesLink).click();
    }

    public void clickquicklinks() {
        driver.findElement(quickLink).click();
    }

    public void clickContact() {
        driver.findElement(contactLink).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean verifyTextPresent(String expectedText) {
        return driver.getPageSource().contains(expectedText);
    }
}

