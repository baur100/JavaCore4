package helpersYK;

import enumsYK.BrowserToChoose;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFabrics {
    public static WebDriver getDriver (BrowserToChoose browserToChoose) throws NoSuchFieldException {
        switch (browserToChoose){
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            case EDGE:
                return getEdgeDriver();
            default:
                throw new NoSuchFieldException("Browser Not Exist");
        }
    }


    private static WebDriver getChromeDriver (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("window-size=1400,1000");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
    }

    private static WebDriver getFirefoxDriver (){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        return new FirefoxDriver();
    }

    private static WebDriver getEdgeDriver (){
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        return new EdgeDriver();
    }
}
