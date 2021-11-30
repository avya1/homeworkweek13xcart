package com.xcart.mobile.homepage;

import com.xcart.mobile.Testbase.TestBase;
import com.xcart.mobile.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        String expectedResult="Shipping";
        verifyPage(expectedResult, By.xpath("//h1[@id='page-title']"));
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLink();
        String expectedResult="New arrivals";
        verifyPage(expectedResult,By.xpath("//h1[@id=\"page-title\"]"));
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        String expectedResult="Coming soon";
        verifyPage(expectedResult,By.xpath("//h1[@id=\"page-title\"]"));
    }
    @Test
    public void  verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsPage();
        String expectedResult="Contact us";
        verifyPage(expectedResult,By.xpath("//h1[@id=\"page-title\"]"));
    }
}
