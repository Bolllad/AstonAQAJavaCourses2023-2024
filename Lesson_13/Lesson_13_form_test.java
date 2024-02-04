import jdk.jfr.Description;
import jdk.jfr.Event;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Lesson_13_form_test {
    static WebDriver driver;

    @BeforeSuite
    public void BeforeSuit() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement cookieAgreeButton = driver.findElement(By.id("cookie-agree"));
        cookieAgreeButton.click();
    }

    @Test
    @Description("Checking form")
    public static void formTest() {
        WebElement proceedButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        WebElement connectionPhoneField = driver.findElement(By.id("connection-phone"));
        WebElement connectionSumField = driver.findElement(By.id("connection-sum"));


        connectionPhoneField.sendKeys("297777777");
        connectionSumField.sendKeys("30");
        proceedButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Assert.assertEquals(driver.findElement(By.className("bepaid-iframe")).isDisplayed(), true);
    }

    @AfterSuite
    public void AfterSuit() {
        driver.quit();
    }
}
