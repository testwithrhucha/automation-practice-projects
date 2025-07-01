package com.form.tests;


import com.form.tests.BaseTest;
import org.testng.annotations.Test;
import com.form.tests.FormPage;
import org.testng.Assert;

public class FormTest extends BaseTest {

    @Test
    public void testValidFormSubmission() throws InterruptedException {
        FormPage formPage = new FormPage(driver);

        formPage.fillFirstName("Rhucha");
        formPage.fillLastName("Chougale");
        formPage.fillEmail("rhucha@gmail.com");
        formPage.fillPhone("9876543210");
        formPage.fillAddress1("Main Road");
        formPage.fillAddress2("Flat 3");
        formPage.fillState("MH");
        formPage.fillPostal("416003");
        formPage.fillDOB("01-01-2000");
        formPage.selectMale();
        formPage.acceptTerms();

        // Validations
        Assert.assertTrue(formPage.isNameValid("Rhucha"), "First Name validation failed");
        Assert.assertTrue(formPage.isNameValid("Chougale"), "Last Name validation failed");
        Assert.assertTrue(formPage.isEmailValid("rhucha@gmail.com"), "Email validation failed");
        Assert.assertTrue(formPage.isPhoneValid("9876543210"), "Phone validation failed");
        Assert.assertTrue(formPage.isPostalValid("416003"), "Postal code validation failed");
        Assert.assertTrue(formPage.isDOBValid("01-01-2000"), "DOB validation failed");

        
    }

    @Test
    public void validateFormWithInvalidEmail() {
        FormPage formPage = new FormPage(driver);

        formPage.fillEmail("invalid_email");
        Assert.assertFalse(formPage.isEmailValid("invalid_email"), "Email validation should fail");
    }

    @Test
    public void validateFormWithInvalidPhone() {
        FormPage formPage = new FormPage(driver);

        formPage.fillPhone("1234");
        Assert.assertFalse(formPage.isPhoneValid("1234"), "Phone validation should fail");
    }

    @Test
    public void validateFormWithInvalidPostal() {
        FormPage formPage = new FormPage(driver);

        formPage.fillPostal("abcde");
        Assert.assertFalse(formPage.isPostalValid("abcde"), "Postal code validation should fail");
    }

    @Test
    public void validateFormWithInvalidDOB() {
       FormPage formPage = new FormPage(driver);

        formPage.fillDOB("2020/01/01");
        Assert.assertFalse(formPage.isDOBValid("2020/01/01"), "DOB validation should fail");
    }
}