package Practico16.Netflix.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NetflixBasePage {

    WebDriver driver;

    public void clickingIntoTheSubmit(){

        driver.findElement(By.xpath("//*[@type='submit']")).click();

    }
    public String getPageTitleValidation(){

        return driver.getTitle();
    }
    public String getCurrentURLNetflix(){

        return driver.getCurrentUrl();
    }
    public List<WebElement> findH1Strings() {

        List<WebElement> listOfH1 = driver.findElements(By.tagName("h1"));

        return listOfH1;
    }
}
