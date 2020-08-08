package L9HWPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginP extends Basic {

    public LoginP(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmail ()  {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return this.driver.findElement(By.cssSelector("[type='email']"));
    }

    public WebElement getPassword (){
        return this.driver.findElement(By.cssSelector("[type='password']"));
    }

    public WebElement getButton (){
        return this.driver.findElement(By.cssSelector("[type='submit']"));
    }

    public MainPage login (String login, String password) {
        getEmail().sendKeys(login);
        getPassword().sendKeys(password);
        getButton().click();

        return new MainPage(driver);
    }
    public void openLoginPage (){
        this.driver.get("https://koelapp.testpro.io");
    }

    public WebElement getRedPhrame (){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='error']")));
        return this.driver.findElement(By.cssSelector("[class='error']"));
    }

    public boolean redPhramePresents (){
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='error']")));
            driver.findElement(By.cssSelector("[class='error']"));
            return true;
        }
        catch (TimeoutException err){
            return false;
        }
    }

}
