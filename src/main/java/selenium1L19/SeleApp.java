package selenium1L19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleApp {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","package/Users/sindhorithulasiram/IdeaProjects/JavaCore4/chromedriver");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        Thread.sleep(5);

        WebElement searchField = driver.findElement(By.cssSelector("[name='q]"));
        searchField.sendKeys("JAVA");
        searchField.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}
