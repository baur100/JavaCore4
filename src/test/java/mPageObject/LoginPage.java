package mPageObject;

import mHardCodedObjects.HtmlPathSelectors;
import mHardCodedObjects.mTestStringInputs;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage implements HtmlPathSelectors, mTestStringInputs {

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        private WebElement getEmail() {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(loginEmailBoxCssPath)));
            return this.driver.findElement(By.cssSelector(loginEmailBoxCssPath));
        }

        private WebElement getPassword() {
            return this.driver.findElement(By.cssSelector(loginPasswordCssPath));
        }

        private WebElement getLoginButton() {
            return this.driver.findElement(By.cssSelector(loginButtonCssPath));
        }

        public MainPage loginToKoel(String username, String password) {
            getEmail().sendKeys(username);
            getPassword().sendKeys(password);
            getLoginButton().click();
            return new MainPage(driver);
        }

        public void openPage(){
            this.driver.get(pageUrl);
        }

        public boolean isWrongLogin(){
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".error")));
                driver.findElement(By.className("error"));
                return true;
            }catch (TimeoutException err){
                return false;
            }
        }

        public void action_loginAndAssert(String assert_Check_Type, String userName, String password){
            this.driver.get(pageUrl);
            var mainPage = loginToKoel(userName,password);

            switch(assert_Check_Type){
                case isMain:
                    Assert.assertTrue(mainPage.isMain());
                    break;
                case isPlaylistExist:
                    String playlistId = mainPage.createNewPlaylist(newPlaylistName1);
                    Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
                    break;
                case playlist7003exist:
                    mainPage.isMain();
                    Assert.assertTrue(mainPage.isPlaylistExist(playlistID7003));
                    break;
                case wrongLogin:
                    Assert.assertTrue(isWrongLogin());
                    break;
                default:
                    System.out.println("Login test not executed and Assert not checked");
                    break;
            }
        }

    }



