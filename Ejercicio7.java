package Practico3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ejercicio7 {

    private WebDriver getDriverSpotifySignup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgomez\\Documents\\SeleniumTest\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/signup/");

        return driver;
    }
    @Test
    public void spotifyByPlaceHolderTest() throws InterruptedException {

        WebDriver driver = getDriverSpotifySignup();

        Thread.sleep(5000);

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("Manuel@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("Manuel@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("Manuel@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("Manuel@test.com");
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("01");

        Select mes = new Select(driver.findElement(By.name("month")));
        mes.selectByVisibleText("Marzo");

        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1982");


        driver.findElement(By.cssSelector("label[for='gender_option_female']")).click();
        driver.findElement(By.cssSelector("label[for='marketing-opt-checkbox']")).click();
        driver.findElement(By.cssSelector("label[for='third-party-checkbox']")).click();

    }
}
