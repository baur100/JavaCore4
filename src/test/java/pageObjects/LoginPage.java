package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
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






    public MainPage loginToKoel(String username, String password) {
        getEmail().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();

        return new MainPage(driver);
    }

    public void openPage() {
        this.driver.get("https://koelapp.testpro.io");
    }

    public boolean iserror() {
        try {
            WebElement errorElement = driver.findElement(By.xpath("//*[@class='error"));
            wait.until(ExpectedConditions.visibilityOf(errorElement));
            driver.findElement(By.xpath("//*[@class='error"));

            return errorElement.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }
}
