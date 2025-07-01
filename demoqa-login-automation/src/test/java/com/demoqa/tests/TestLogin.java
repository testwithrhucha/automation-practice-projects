package com.demoqa.tests;

	
	
	
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

	public class TestLogin extends Basetest {
	
	    @Test
	    public void testValidCredentials() {
	    	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("raj11");
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/input")).sendKeys("Raj@1104");
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[1]/button")).click();
               
	       
	    }

	    @Test
	    public void testInvalidCredentials() {
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("admin");
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/input")).sendKeys("wrongpass");
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[1]/button")).click();

	        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"name\"]"));
	        System.out.println("Invalid Login:"+errorMsg.isDisplayed());
	    }

	    @Test
	    public void testEmptyFields() {driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[1]/button")).click();

	        WebElement validationMsg = driver.findElement(By.id("validation"));
	   
	        System.out.println("Invalid Login:"+validationMsg.isDisplayed());
	    }
	}



