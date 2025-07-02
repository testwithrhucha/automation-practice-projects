package com.search.tests;



import com.search.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.search.tests.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    public void testValidSearch() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);

       
        searchPage.enterSearchTerm("brinjal");

        Thread.sleep(5000); 

        int count = searchPage.getResultsCount();
        System.out.println("Number of products found: " + count);
        Assert.assertTrue(count > 0, "No products found!");

        String firstTitle = searchPage.getFirstResultTitle();
        System.out.println("First product title: " + firstTitle);
        Assert.assertTrue(firstTitle.contains("Brinjal") || firstTitle.contains("kg"),"First product does not contain expected keyword!");

        Thread.sleep(3000);
    }
}
