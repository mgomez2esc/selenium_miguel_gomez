package Practico16.Netflix.DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderEmailAddress {

    @DataProvider (name = "emailaddresses")
    public Object[][] peopleDataPeople(){
        return new Object[][]{
                {"quental@quental.com"},
                {"reply@reply.com"},
                {"vodafone@vodafone.com"},
        };
    }
}
