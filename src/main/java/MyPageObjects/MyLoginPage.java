package MyPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyLoginPage extends myBasePage{

    public MyLoginPage(WebDriver driver) {
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

    public myMainPage loginToKoel(String username, String password){
        getEmail().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();

        return new myMainPage(driver);
    }

//    public WebElement invalidLogin() {
//        return this.driver.findElement(By.cssSelector("[class='error']"));
//    }

    public void openPage(){
        this.driver.get("https://koelapp.testpro.io");
    }
    public boolean isWrongLogin(){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".error")));
            driver.findElement(By.className("error"));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }
}
