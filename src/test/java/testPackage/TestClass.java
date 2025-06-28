package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class TestClass {
@Test
    public void test(){

    WebDriver driver= new ChromeDriver();
    //driver.navigate().to("https://duckduckgo.com/");
    //URL url=new URL("https://duckduckgo.com/"); // url deprecated
    //driver.navigate().to(url);
    driver.get("https://duckduckgo.com/");
    Assert.assertEquals(driver.getTitle(), "Google", "Page title mismatch");

    String expectedTitle = "Google";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");

    Assert.assertEquals(driver.getTitle(), "DuckDuckGo — Privacy, simplified.");
    Assert.assertNotEquals(driver.getTitle(), "Google", "Title should not be 'Google'");
    System.out.println("Test 1: Page title assertion executed.");
    //driver.quit(); // Close the browser and terminate the WebDriver session
}



}
