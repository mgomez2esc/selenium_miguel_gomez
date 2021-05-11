package Practico2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {

    private WebDriver getDriverFacebook() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgomez\\Documents\\SeleniumTest\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        return driver;
    }
    private void setBirthdate (WebDriver driver, String day, String month, String year) {

        WebElement dias = driver.findElement(By.name("birthday_day"));
        Select comboxDias = new Select(dias);
        comboxDias.selectByVisibleText(day);

        WebElement meses = driver.findElement(By.name("birthday_month"));
        Select comboxMeses = new Select(meses);
        comboxMeses.selectByVisibleText(month);

        WebElement annos = driver.findElement(By.name("birthday_year"));
        Select comboxAnnos = new Select(annos);
        comboxAnnos.selectByVisibleText(year);
    }

    private void setPersonaldate(WebDriver driver, String information, String data){

        driver. findElement(By.name(information)).sendKeys(data);

    }
    @Test
    void fullRegistrationTest() throws InterruptedException {

        WebDriver driver = getDriverFacebook();

        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("nueva")).click();

        Thread.sleep(2000);

        Assert.assertEquals(driver.getTitle(), "Facebook - Entrar o registrarse");

        setPersonaldate(driver, "firstname", "John");
        setPersonaldate(driver, "lastname", "Smith");
        setPersonaldate(driver, "reg_email__", "test@test.com");
        setPersonaldate(driver, "reg_email_confirmation__", "test@test.com");
        setPersonaldate(driver, "reg_passwd__", "12345");

        setBirthdate(driver, "26", "jun","1980");

        List<WebElement> listSexos = driver.findElements(By.name("sex"));
        WebElement sexoMascElement = listSexos.get(1);
        sexoMascElement.click();

    }
}
