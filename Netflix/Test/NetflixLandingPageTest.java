package Practico16.Netflix.Test;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NetflixLandingPageTest extends NetflixBaseTest{

    @Test(priority = 0)
    public void NetflixLandingPageTesting(){

        Assert.assertEquals(netflixLandingPage.getPageTitleValidation(), "Netflix", "It is expected another page title");

    }
    @Test (priority = 1)
    @Parameters({"tagName"})
    public void printTagsTest(@Optional("h1") String tagNameParemeter){

        netflixLandingPage.printingAllLabes(tagNameParemeter);

    }

}