package helpers;

import enums.BrowserType;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

// this class should return a webdriver using the only one static method
public class BrowserFabric {

    public static WebDriver getDriver(BrowserType browserType) throws NoSuchFieldException {

        switch(browserType){
          case FIREFOX:
              return getFireFoxDriver();
          case CHROME:
              return getChromeDriver();
          case EDGE:
              return getEdgeDriver();
          default:
              throw new NoSuchFieldException("Browser not defined");
        }
        /*if(browserType == BrowserType.FIREFOX){
            return getFireFoxDriver();
        }
        return getChromeDriver();*/
    }

    private static WebDriver getChromeDriver(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("window-size=1400,1000");
//        chromeOptions.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver","chromedriver");
//        return new ChromeDriver(chromeOptions);
        return new ChromeDriver();
    }

    private static WebDriver getFireFoxDriver(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        /*
        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--width=1400");
        firefoxOptions.addArguments("--height=1000");
        */
        System.setProperty("webdriver.gecko.driver","geckodriver");
        return new FirefoxDriver(firefoxOptions);
    }

    private static WebDriver getEdgeDriver(){
//        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("window-size=1400,1000");
//        edgeOptions.addArguments("--headless");
        System.setProperty("webdriver.edge.driver","msedgedriver");
        return new EdgeDriver();
    }


}
