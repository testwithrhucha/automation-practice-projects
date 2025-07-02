package com.search.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class SearchPage {

    private WebDriver driver;

   
    private By searchBox = By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/input");
    private By resultTitles = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/h4");
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    
    

    public void enterSearchTerm(String term) {
        driver.findElement(searchBox).sendKeys(term, Keys.ENTER);
    }

    public List<WebElement> getResults() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(resultTitles));
        return driver.findElements(resultTitles);
    }

    public String getFirstResultTitle() {
        List<WebElement> results = getResults();
        if (!results.isEmpty()) {
            return results.get(0).getText();
        }
        return "";
    }

    public int getResultsCount() {
        return getResults().size();
    }
}
