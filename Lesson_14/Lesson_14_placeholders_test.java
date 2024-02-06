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

public class Lesson_14_placeholders_test {
    static WebDriver driver;

    @BeforeAll
    public static void BeforeAll() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        driver.findElement(By.id("cookie-agree")).click();
    }

    @ParameterizedTest
    @DisplayName("Connection services placeholders")
    @CsvSource({"connection-phone, Номер телефона", "connection-sum, Сумма", "connection-email, E-mail для отправки чека"})
    public void servicesPlaceholdersTest(String id, String expected) {
        WebElement field = driver.findElement(By.id(id));
        String fieldHintText = field.getAttribute("placeholder");
        Assert.assertEquals(fieldHintText, expected);
    }

    @ParameterizedTest
    @DisplayName("Home internet placeholders")
    @CsvSource({"internet-phone, Номер абонента", "internet-sum, Сумма", "internet-email, E-mail для отправки чека"})
    public void homePlaceholdersTest(String id, String expected) {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p"))
                .click();

        WebElement field = driver.findElement(By.id(id));
        String fieldHintText = field.getAttribute("placeholder");
        Assert.assertEquals(fieldHintText, expected);
    }

    @ParameterizedTest
    @DisplayName("Installment plan placeholders")
    @CsvSource({"score-instalment, Номер счета на 44", "instalment-sum, Сумма", "instalment-email, E-mail для отправки чека"})
    public void installmentPlanPlaceholdersTest(String id, String expected) {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p"))
                .click();

        WebElement field = driver.findElement(By.id(id));
        String fieldHintText = field.getAttribute("placeholder");
        Assert.assertEquals(fieldHintText, expected);
    }

    @ParameterizedTest
    @DisplayName("Arrears placeholders")
    @CsvSource({"score-arrears, Номер счета на 2073", "arrears-sum, Сумма", "arrears-email, E-mail для отправки чека"})
    public void arrearsPlaceholdersTest(String id, String expected) {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p"))
                .click();

        WebElement field = driver.findElement(By.id(id));
        String fieldHintText = field.getAttribute("placeholder");
        Assert.assertEquals(fieldHintText, expected);
    }

    @AfterAll
    public static void AfterAll() {
        driver.quit();
    }
}
