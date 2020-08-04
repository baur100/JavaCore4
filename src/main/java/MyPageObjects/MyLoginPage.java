package MyPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyLoginPage extends myBasePage{

    public MyLoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebElement getEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return this.driver.findElement(By.cssSelector("[type='email']"));
    }

    public WebElement getPassword() {
        return this.driver.findElement(By.cssSelector("[type='password']"));
    }

    public WebElement getLoginButton() {
        return this.driver.findElement(By.cssSelector("[type='submit']"));
    }
    public myMainPage loginToKoel(String username, String password){
        getEmail().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();

        return new myMainPage(driver);
    }

    public WebElement invalidLogin() {
        return this.driver.findElement(By.cssSelector("[class='error']"));
    }

    public void openPage(){
        this.driver.get("https://koelapp.testpro.io");
    }
}
