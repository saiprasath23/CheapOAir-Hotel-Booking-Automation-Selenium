package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HotelBookingPage {

    WebDriver driver;
    WebDriverWait wait;

    public HotelBookingPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By hotelsTab = By.id("hotels");
    By guestPanel = By.xpath("//div[@class='room-length-holder']");
    By addChild = By.id("addCHILD");
    By closeDialog = By.id("closeVacationDialog");

    By destination = By.id("hs_originCity_0");
    By chennai = By.xpath("//span[contains(text(),'Chennai')]");

    By calendar = By.xpath("//div[contains(@class,'calendarDepart')]");
    By checkin = By.xpath("//span[@aria-label='26 February 2026']");
    By checkout = By.xpath("//span[@aria-label='28 February 2026']");

    By search = By.id("searchNow");

    public void searchHotel() {

        driver.findElement(hotelsTab).click();

        driver.findElement(guestPanel).click();
        driver.findElement(addChild).click();
        driver.findElement(closeDialog).click();

        // Typing Chennai individually
        driver.findElement(destination).sendKeys("c");
        driver.findElement(destination).sendKeys("h");
        driver.findElement(destination).sendKeys("e");
        driver.findElement(destination).sendKeys("n");
        driver.findElement(destination).sendKeys("n");
        driver.findElement(destination).sendKeys("a");
        driver.findElement(destination).sendKeys("i");

        // Wait and select Chennai
        wait.until(ExpectedConditions
        .elementToBeClickable(chennai)).click();

        driver.findElement(calendar).click();

        wait.until(ExpectedConditions
        .elementToBeClickable(checkin)).click();

        wait.until(ExpectedConditions
        .elementToBeClickable(checkout)).click();

        driver.findElement(search).click();
    }
}