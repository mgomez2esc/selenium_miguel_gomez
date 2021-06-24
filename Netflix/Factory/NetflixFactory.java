package Practico16.Netflix.Factory;

import Practico16.Netflix.Test.NetflixLandingPageTest;
import org.testng.annotations.Factory;

public class NetflixFactory {

    @Factory
    public Object[] NetflixFactory(){
        return new Object[]{
            new NetflixLandingPageTest(),
        };
    }
}
