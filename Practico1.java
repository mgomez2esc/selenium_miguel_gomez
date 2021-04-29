package Practico1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Practico1 {

    private WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgomez\\Documents\\SeleniumTest\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/uy/");

        return driver;
    }


    @Test
    void practico1() throws InterruptedException {

        WebDriver link = getDriver();

        Thread.sleep(5000);

        List<WebElement> listH1 = link.findElements(By.tagName("h1"));

        System.out.println("Los elementos H1 que se encuentran en esta pagina son:");
        for (WebElement h1Element : listH1) {
            if (!h1Element.getText().isEmpty()) {
                System.out.println("- " + h1Element.getText());
            }
        }

        List<WebElement> listH2 = link.findElements(By.tagName("h2"));

        System.out.println("Los elementos H2 que se encuentran en esta pagina son:");
        for (WebElement h2Element : listH2) {
            if (!h2Element.getText().isEmpty()) {
                System.out.println("- " + h2Element.getText());
            }
        }

        List<WebElement> listButton = link.findElements(By.tagName("button"));

        System.out.println("Los botones que se encuentran en esta pagina son:");
        for (WebElement buttons : listButton) {
            if (!buttons.getText().isEmpty()) {
                System.out.println("- " + buttons.getText());
            }
        }

        List<WebElement> listDiv = link.findElements(By.tagName("div"));

        System.out.println("La cantidad de elementos div que se encuentran en la paginan son: " + listDiv.size());

        System.out.println("El titulo de la pagina es: " + link.getTitle());

        List<WebElement> listLink = link.findElements(By.tagName("link"));

        System.out.println("La cantidad de elementos link que se encuentran en la paginan son: " + listLink.size());
    }
}


