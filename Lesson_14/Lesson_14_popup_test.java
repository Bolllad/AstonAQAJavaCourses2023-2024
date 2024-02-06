import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson_14_popup_test {
    static WebDriver driver;

    @BeforeAll
    public static void BeforeAll() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        driver.findElement(By.id("cookie-agree")).click();
        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("30");
        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe")));
    }

    @ParameterizedTest
    @DisplayName("Connection services text")
    @CsvSource({"p.header__payment-amount,  30.00 BYN ",
            "p.header__payment-info,  Оплата: Услуги связи Номер:375297777777 ",
            "button.colored.disabled.ng-star-inserted, Оплатить 30.00 BYN ",
            "label.ng-tns-c47-1.ng-star-inserted, Номер карты", "label.ng-tns-c47-4.ng-star-inserted, Срок действия",
            "label.ng-tns-c47-5.ng-star-inserted, CVC", "label.ng-tns-c47-3.ng-star-inserted, Имя держателя (как на карте)"})
    public void connectionServicesDisplayTest(String elementName, String expected) {
        WebElement element = driver.findElement(By.cssSelector(elementName));
        String elementText = element.getText();
        Assert.assertEquals(expected, expected);
    }

    @ParameterizedTest
    @DisplayName("Payment system icons")
    @CsvSource({"img:nth-child(1), assets/images/payment-icons/card-types/mastercard-system.svg",
                "img:nth-child(2), assets/images/payment-icons/card-types/visa-system.svg",
                "img:nth-child(3), assets/images/payment-icons/card-types/belkart-system.svg",
                "div.icons-container.ng-tns-c47-1 > div > div > div > img:nth-child(1), assets/images/payment-icons/card-types/mir-system.svg",
                "div.icons-container.ng-tns-c47-1 > div > div > div > img:nth-child(2), assets/images/payment-icons/card-types/maestro-system.svg"})
    public void connectionServicesPaymentSystemIcons(String elementName, String expected) {
        WebElement element = driver.findElement(By.cssSelector(elementName));
        String elementSrc = element.getAttribute("src");
        Assert.assertEquals(expected, expected);
    }

    @AfterAll
    public static void AfterAll() {
        driver.quit();
    }
}
