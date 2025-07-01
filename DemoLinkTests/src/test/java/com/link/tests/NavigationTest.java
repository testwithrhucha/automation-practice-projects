package com.link.tests;



import com.link.tests.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.link.tests.*;

public class NavigationTest extends BaseTest {

    private String title;

	@Test 
    public void testHomeLink() throws InterruptedException {
        NavigationPage nav = new NavigationPage(driver);
        nav.clickHome();
        Thread.sleep(2000);
        String title = nav.getPageTitle();
        Assert.assertTrue(title.contains("Hamad"), "Home page title check failed");
    }

    @Test
    public void testAboutLink() throws InterruptedException {
        NavigationPage nav = new NavigationPage(driver);
        nav.clickAbout();
        Thread.sleep(2000);
        String title = nav.getPageTitle();
        Assert.assertTrue(nav.verifyTextPresent(" About Us") , "About page title check failed");
    }

    @Test
    public void testServicesLink() throws InterruptedException {
        NavigationPage nav = new NavigationPage(driver);
        nav.clickServices();
        Thread.sleep(2000);
        String title = nav.getPageTitle();
        Assert.assertTrue(nav.verifyTextPresent(" Hospitals and Services") , "Services page check failed");
    }

    @Test
    public void testPatientsLink() throws InterruptedException {
        NavigationPage nav = new NavigationPage(driver);
        nav.clickquicklinks();
        Thread.sleep(2000);
        String title=nav.getPageTitle();
        Assert.assertTrue(title.contains("Quick Links") || nav.verifyTextPresent("Links"), "Quick links page check failed");
    }

    @Test
    public void testContactLink() throws InterruptedException {
        NavigationPage nav = new NavigationPage(driver);
        nav.clickContact();
        Thread.sleep(2000);
        Assert.assertTrue(nav.verifyTextPresent("Contact") || nav.getPageTitle().contains("Contact"), "Contact page check failed");
    }
}
