package org.example.bbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LoginInTest extends AbstractTest {

    @Test
    void loginIn(){
        new BBCMainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(webDriver.getTitle().equals("BBC – Sign in"), "страница входа недоступна");
        new LoginPage(getWebDriver()).setLogin("kravmaxim@gmail.com").setPassword("vbPNKsk5GUFStb@").loginIn();
        Assertions.assertTrue(webDriver.findElement(By.id("idcta-username")).getText().equals("Your account"));
    }

    @Test
    void loginInSecond(){
        new BBCMainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(webDriver.getTitle().equals("BBC – Sign in"), "страница входа недоступна");
        new LoginPage(getWebDriver()).loginIn("kravmaxim@gmail.com","vbPNKsk5GUFStb@");
        Assertions.assertTrue(webDriver.findElement(By.id("idcta-username")).getText().equals("Your account"));
    }

    @AfterEach
    void logout(){
        new BBCMainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(webDriver.getTitle().equals("BBC – account overview"), "страница аккаунта не доступна");
        new AccountPage(webDriver).logOut();
        new WebDriverWait(webDriver,Duration.ofSeconds(5));
        Assertions.assertTrue(webDriver.findElement(By.id("idcta-username")).getText().equals("Sign in"));
    }



}
