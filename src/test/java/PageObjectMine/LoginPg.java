package PageObjectMine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPg {
    private WebDriver driver;
    private WebDriverWait wait;

    /*
    private WebElement email;
    private WebElement pwd;
    private WebElement loginBtn;
    */

    public LoginPg(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
    }

    /*

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPwd() {
        return pwd;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
    */

    public WebElement getEmail() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return this.driver.findElement(By.cssSelector("[type='email']"));
    }

    public WebElement getPwd() {
        return this.driver.findElement(By.cssSelector("[type='password']"));
    }

    public WebElement getLoginBtn() {
        return this.driver.findElement(By.cssSelector("[type='submit']"));
    }

    public MainPage loginToKoel(String userName, String password) throws InterruptedException {
        getEmail().sendKeys(userName);
        getPwd().sendKeys(password);
        getLoginBtn().click();

        return new MainPage(driver);

    }

    public void openPage() {
        this.driver.get("https://koelapp.io")
    }
}
