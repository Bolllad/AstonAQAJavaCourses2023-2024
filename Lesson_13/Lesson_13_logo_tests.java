import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Lesson_13_logo_tests {
    static WebDriver driver;

    @BeforeSuite
    public void BeforeSuit() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement cookieAgreeButton = driver.findElement(By.id("cookie-agree"));
        cookieAgreeButton.click();
    }

    @Test
    @Description("Checking visa logo")
    public static void visaLogoTest() {
        WebElement visaButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        String picURL = visaButton.getAttribute("src");
        Assert.assertEquals(picURL, "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg");
    }

    @Test
    @Description("Checking verified by visa logo")
    public static void verifiedByVisaLogoTest() {
        WebElement verifiedByVisaButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
        String picURL = verifiedByVisaButton.getAttribute("src");
        Assert.assertEquals(picURL, "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg");
    }

    @Test
    @Description("Checking mastercard logo")
    public static void mastercardLogoTest() {
        WebElement mastercardButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        String picURL = mastercardButton.getAttribute("src");
        Assert.assertEquals(picURL, "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg");
    }

    @Test
    @Description("Checking mastercard secure code logo")
    public static void mastercardSecureCodeLogoTest() {
        WebElement mastercardSecureCodeButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
        String picURL = mastercardSecureCodeButton.getAttribute("src");
        Assert.assertEquals(picURL, "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg");
    }

    @Test
    @Description("Checking belcard logo")
    public static void belcardLogoTest() {
        WebElement belcardButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
        String picURL = belcardButton.getAttribute("src");
        Assert.assertEquals(picURL, "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg");
    }

    @Test
    @Description("Checking mir logo")
    public static void mirLogoTest() {
        WebElement mirButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[6]/img"));
        String picURL = mirButton.getAttribute("src");
        Assert.assertEquals(picURL, "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mir.svg");
    }

    @AfterSuite
    public void AfterSuit() {
        driver.quit();
    }
}
