package automationtest.pkg;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Testlogintest {

    WebDriver driver;

    @Test
    public void verifyLoginwithvalidcred() throws Exception {

        Loginpagedetails p1 = new Loginpagedetails(driver);

        String x1 = "C:\\Users\\de11\\Downloads\\Untitled spreadsheet.xlsx";

        String sheet = "sheet1";

        System.out.println("Excel File Path: " + x1);

        System.out.println("Sheet Name: " + sheet);

    }
}
