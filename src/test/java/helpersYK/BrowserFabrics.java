package helpersYK;

import enumsYK.BrowserToChoose;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
    }

    private static WebDriver getFirefoxDriver (){
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        return new FirefoxDriver();
    }

    private static WebDriver getEdgeDriver (){
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        return new EdgeDriver();
    }
}
