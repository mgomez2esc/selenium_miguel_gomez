package Practico16.Netflix.Test;

import Practico16.Netflix.DataProvider.DataProviderEmailAddress;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NetflixRegistrationPageTest extends NetflixBaseTest {

    @Test(priority = 2)
    public void NetflixLoginPage(){

        Assert.assertEquals(netflixRegistrationPage.getPageTitleValidation(),"Netflix", "There should have shown up another name");
        Assert.assertFalse(netflixRegistrationPage.findH1Strings().equals("Iniciar sesión"));
        Assert.assertEquals(netflixRegistrationPage.facebookTestValidation(), "Iniciar sesión con Facebook", "Another test should be expeted");
    }

    @Test(priority = 3)
    public void loginToNetflixErrorEMail(){

        netflixRegistrationPage.typingWrongCrendentials("XXX", "holamundo");
        Assert.assertEquals(netflixRegistrationPage.errorEmailAddress(), "Escribe un correo válido.", "Other error was expected");
    }
    @Test(priority = 4)
    public void loginToNetflixErrorPass(){

        netflixRegistrationPage.typingWrongCrendentials("test@test.com","holamundo");
        Assert.assertEquals(netflixRegistrationPage.errorEmailPass(),"Contraseña incorrecta. Vuelve a intentarlo o restablece tu contraseña.", "Other error was expected to be turned up");
    }
    @Test(priority = 5)
    public void fakeEmailTest(){

        netflixRegistrationPage.fakeEmailAddress();

        Assert.assertFalse(netflixLandingPage.getCurrentURLNetflix().contains("signup"));
    }
    @Test(priority = 6, dataProvider = "emailaddresses", dataProviderClass = DataProviderEmailAddress.class)
    public void dataProviderEmailTest(String aEmail){

        netflixRegistrationPage.dataProviderNetflixMail(aEmail);

    }
}