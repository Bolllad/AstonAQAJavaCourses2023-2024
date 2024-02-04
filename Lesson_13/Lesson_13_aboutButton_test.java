import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Lesson_13_aboutButton_test {
    static WebDriver driver;

    @BeforeSuite
    public void BeforeSuit() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement cookieAgreeButton = driver.findElement(By.id("cookie-agree"));
        cookieAgreeButton.click();
    }

    @Test
    @Description("Checking about button redirect")
    public static void moreAboutServiceTest() {
        WebElement moreAboutButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        moreAboutButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @AfterSuite
    public void AfterSuit() {
        driver.quit();
    }
}
