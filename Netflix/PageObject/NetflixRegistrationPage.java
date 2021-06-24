package Practico16.Netflix.PageObject;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NetflixRegistrationPage extends NetflixBasePage {

    public NetflixRegistrationPage(WebDriver remoteDriver){

        driver = remoteDriver;
    }

    public void typingWrongCrendentials(String username, String pass){

        driver.findElement(By.name("userLoginId")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(pass);

        driver.findElement(By.className("hybrid-login-form-help")).click();
        clickingIntoTheSubmit();
    }
    public String errorEmailAddress(){

        return driver.findElement(By.className("inputError")).getText();
    }
    public String errorEmailPass(){

        return driver.findElement(By.className("ui-message-contents")).getText();
    }
    public void fakeEmailAddress(){

        Faker faker = new Faker();

        driver.findElement(By.name("userLoginId")).sendKeys(faker.internet().emailAddress());
        clickingIntoTheSubmit();
    }
    public void dataProviderNetflixMail(String email){

        driver.findElement(By.name("userLoginId")).sendKeys(email);
        clickingIntoTheSubmit();
    }
    public String facebookTestValidation() {

        WebElement FacebookText = driver.findElement(By.xpath("//*[contains(text(),'Iniciar sesión con Facebook')]"));

        return FacebookText.getText();
    }

}