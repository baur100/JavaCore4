package selenium1L19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");

        WebElement searchField = chromeDriver.findElement(By.cssSelector("[name='q']"));

        searchField.sendKeys("JAVA");
        searchField.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement javaLink = chromeDriver.findElement(By.cssSelector("[name='www.java.com']"));
        javaLink.click();
        Thread.sleep(5000);

        chromeDriver.close();
    }
}
