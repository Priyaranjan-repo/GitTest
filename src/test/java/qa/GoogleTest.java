package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleTest {

    WebDriver driver;
    String url = "https://www.google.com";

    @Test
    void verifyGoogleTitleTest() {
        //  driver = new EdgeDriver();
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get(url);
            System.out.println("Print titile:  " + driver.getTitle());
            System.out.println("--------------");
            String actualTitle = driver.getTitle();
            String expectedTitle = "Google";
            Assert.assertEquals(actualTitle, expectedTitle);
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        } finally {
            driver.quit();
        }
    }
}
