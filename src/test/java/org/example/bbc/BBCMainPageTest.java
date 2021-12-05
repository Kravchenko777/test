package org.example.bbc;


import org.junit.jupiter.api.*;


public class BBCMainPageTest extends AbstractTest {

    @Test
    void clickToSport(){
        new BBCMainPage(getWebDriver()).navigateToSport();
    }

    @Test
    void clickToTravel(){
        new BBCMainPage(getWebDriver()).navigateToTravel();
    }

    @Test
    void clickToWork(){
        new BBCMainPage(getWebDriver()).navigateToWorklife();
    }

    @Test
    void clickToReal(){
        new BBCMainPage(getWebDriver()).navigateToWorklife();
    }

}
