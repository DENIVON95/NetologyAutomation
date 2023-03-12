package ru.netology.tests;


import org.testng.Assert;
import ru.netology.service.CashBackHackService;

public class CashBackHackServiceTest {

    private CashBackHackService cashBackHackService = new CashBackHackService();

    @org.testng.annotations.Test
    public void checkWithinBoundaryAmount() {
        int testAmount = 900;
        int expectedAmount = 100;
        int remainCashback = cashBackHackService.remain(testAmount);
        Assert.assertEquals(remainCashback, expectedAmount);
    }

    @org.testng.annotations.Test
    public void checkCashBackBoundaryAmount() {
        int testAmount = 1000;
        int expectedAmount = 0;
        int remainCashback = cashBackHackService.remain(testAmount);
        Assert.assertEquals(remainCashback, expectedAmount);
    }

    @org.testng.annotations.Test
    public void checkCashBackWithZeroAmount() {
        int testAmount = 0;
        int expectedAmount = 1000;
        int remainCashback = cashBackHackService.remain(testAmount);
        Assert.assertEquals(remainCashback, expectedAmount);
    }
}
