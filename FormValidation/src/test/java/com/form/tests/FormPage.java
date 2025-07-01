package com.form.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    private WebDriver driver;

    By firstName = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[1]/div[1]/div/div/input");
    By lastName = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[1]/div[2]/div/div/input");
    By email = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[2]/div[1]/div/div/input");
    By phone = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[3]/div[1]/div/div/input");
    By address1 = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[3]/div[2]/div/div/input");
    By address2 = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[4]/div[1]/div/div/input");
    By state = By.xpath("//*[@id=\"state\"]");
    By postalCode = By.xpath("//*[@id=\"postalcode\"]");
    By dob = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[6]/div[1]/div/div/input");
    By maleRadio = By.xpath("//*[@id=\"male\"]");
    By termsCheck = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[7]/div/label/input");
    By submitBtn = By.xpath("/html/body/app-root/app-forms/section/div/div/div[1]/div/div/form/div[8]/div/input"); 

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFirstName(String fname) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fname);
    }

    public void fillLastName(String lname) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lname);
    }

    public void fillEmail(String mail) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(mail);
    }

    public void fillPhone(String ph) {
        driver.findElement(phone).clear();
        driver.findElement(phone).sendKeys(ph);
    }

    public void fillAddress1(String addr) {
        driver.findElement(address1).clear();
        driver.findElement(address1).sendKeys(addr);
    }

    public void fillAddress2(String addr) {
        driver.findElement(address2).clear();
        driver.findElement(address2).sendKeys(addr);
    }

    public void fillState(String st) {
        driver.findElement(state).clear();
        driver.findElement(state).sendKeys(st);
    }

    public void fillPostal(String code) {
        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(code);
    }

    public void fillDOB(String date) {
        driver.findElement(dob).clear();
        driver.findElement(dob).sendKeys(date);
    }

    public void selectMale() {
        driver.findElement(maleRadio).click();
    }

    public void acceptTerms() {
        driver.findElement(termsCheck).click();
    }

    public void submitForm() {
        driver.findElement(submitBtn).click();
    }

    // Validation methods
    public boolean isEmailValid(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public boolean isPhoneValid(String phone) {
        return phone.matches("^\\d{10}$");
    }

    public boolean isPostalValid(String postal) {
        return postal.matches("^\\d{6}$");
    }

    public boolean isDOBValid(String dob) {
        return dob.matches("^\\d{2}-\\d{2}-\\d{4}$");
    }

    public boolean isNameValid(String name) {
        return name.matches("^[A-Za-z]+$");
    }
}