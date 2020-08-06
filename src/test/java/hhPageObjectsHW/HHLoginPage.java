package hhPageObjectsHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HHLoginPage extends HHBasePage {

    public HHLoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return this.driver.findElement(By.cssSelector("[type='email']"));
    }

    private WebElement getPassword() {
        return this.driver.findElement(By.cssSelector("[type='password']"));
    }

    private WebElement getLoginButton() {
        return this.driver.findElement(By.cssSelector("[type='submit']"));
    }

    public HHMainPage loginToKoel(String username, String password) {
        getEmail().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();

        return new HHMainPage(driver);
    }
    public void openPage(){
        this.driver.get("https://koelapp.testpro.io");
    }
}

