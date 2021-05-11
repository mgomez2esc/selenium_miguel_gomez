package Practico12Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngSalesforce {

    public static final String SALESFORCE_URL = "https://login.salesforce.com/";
    WebDriver driver;

    @BeforeMethod
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgomez\\Documents\\SeleniumTest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test (priority = 1)
    public void validateSalesforceLogoTest() throws InterruptedException {

        driver.get(SALESFORCE_URL);

        Thread.sleep(2000);

        WebElement logosName = driver.findElement(By.id("logo"));
        System.out.println("El nombre del logs es: " + logosName.getTagName());
        System.out.println("El alt es: " + logosName.getAttribute("alt"));
    }

    @Test (priority = 4)
    public void RememberMeIsSelected() throws InterruptedException {

        driver.get(SALESFORCE_URL);

        WebElement remember = driver.findElement(By.xpath("//*[@for='rememberUn']"));

        Thread.sleep(1000);

        remember.click();
        Assert.assertFalse(remember.isSelected());
    }

    @Test (priority = 2)
    public void FooterIsValid() throws InterruptedException {

        driver.get(SALESFORCE_URL);

        Thread.sleep(2000);

        WebElement footer = driver.findElement(By.id("footer"));
        Assert.assertTrue(footer.getText().contains("© 2021 salesforce.com, inc. Reservados todos los derechos. | "));

    }
    @Test (priority = 3)
    @Parameters({"username", "password"})
    public void LoginFailureTest(@Optional("testing@selenium.com") String email, @Optional("1234567890") String pass) throws InterruptedException {

        driver.get(SALESFORCE_URL);

        WebElement logoFound = driver.findElement(By.id("logo"));
        Assert.assertTrue(logoFound.isDisplayed());

        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(pass);

        driver.findElement(By.id("Login")).click();

        Thread.sleep(2000);

        WebElement errorLogin = driver.findElement(By.xpath("//*[contains(text(), 'El administrador del sistema ha desactivado su acceso a salesforce.com. Póngase en contacto con su administrador si desea obtener más información.')]"));
        Assert.assertEquals(errorLogin.getText(), "El administrador del sistema ha desactivado su acceso a salesforce.com. Póngase en contacto con su administrador si desea obtener más información.");
        System.out.println("El error mostrado por pantalla es: " + errorLogin.getText());

    }

}
