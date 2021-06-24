package Practico16.Netflix.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NetflixLandingPage extends NetflixBasePage {

    public NetflixLandingPage(WebDriver remoteDriver){

        driver = remoteDriver;
    }
    public void acceptingCookiesPolicy(){

        driver.findElement(By.xpath("//*[@class='btn-red btn-accept']")).click();
    }
    public NetflixRegistrationPage logIn(){

        driver.findElement(By.xpath("//*[@class='authLinks redButton']")).click();

        NetflixRegistrationPage NextPage = new NetflixRegistrationPage(driver);

        return NextPage;
    }
    public void printingAllLabes(String labels){

        List<WebElement> listElements = driver.findElements(By.tagName(labels));

        for (WebElement e : listElements){
            System.out.println("- " +e.getText());
        }
    }
}