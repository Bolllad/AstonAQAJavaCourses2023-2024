import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Lesson_13_header_test {
    static WebDriver driver;

    @BeforeSuite
    public void BeforeSuit() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement cookieAgreeButton = driver.findElement(By.id("cookie-agree"));
        cookieAgreeButton.click();
    }

    @Test
    @Description("Checking header")
    public static void headerTest() {
        WebElement header = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        String headerText = header.getText().replaceAll("\n", " ");
        Assert.assertEquals(headerText, "Онлайн пополнение без комиссии");
    }

    @AfterSuite
    public void AfterSuit() {
        driver.quit();
    }
}
