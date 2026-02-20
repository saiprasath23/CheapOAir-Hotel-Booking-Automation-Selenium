package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.HotelBookingPage;

public class HotelBookingTest extends BaseTest {

    @Test
    public void verifyHotelBooking() throws InterruptedException {

        HotelBookingPage page = new HotelBookingPage(driver);
        page.searchHotel();
    }
}