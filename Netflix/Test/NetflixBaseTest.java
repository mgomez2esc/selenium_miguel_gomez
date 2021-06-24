package Practico16.Netflix.Test;

import Practico16.Netflix.PageObject.NetflixLandingPage;
import Practico16.Netflix.PageObject.NetflixRegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class NetflixBaseTest {

    WebDriver driver;
    protected NetflixLandingPage netflixLandingPage;
    protected NetflixRegistrationPage netflixRegistrationPage;
    public static final String NETFLIX_URL = "https://www.netflix.com/es/";

    @BeforeMethod
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgomez\\Documents\\SeleniumTest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(NETFLIX_URL);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        netflixLandingPage = new NetflixLandingPage(driver);
        netflixLandingPage.acceptingCookiesPolicy();

        netflixRegistrationPage = netflixLandingPage.logIn();

    }
    @AfterMethod
    public void closeTest() throws InterruptedException {

        Thread.sleep(10);
        driver.close();
    }


}
