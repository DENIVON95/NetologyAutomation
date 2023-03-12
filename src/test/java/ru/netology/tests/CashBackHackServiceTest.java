package ru.netology.tests;

import org.junit.Assert;
import ru.netology.service.CashBackHackService;

public class CashBackHackServiceTest {

    private CashBackHackService cashBackHackService = new CashBackHackService();

    @org.junit.Test
    public void checkWithinBoundaryAmount() {
        int testAmount = 900;
        int expectedAmount = 100;
        int remainCashback = cashBackHackService.remain(testAmount);
        Assert.assertEquals(expectedAmount, remainCashback);
    }

    @org.junit.Test
    public void checkCashBackBoundaryAmount() {
        int testAmount = 1000;
        int expectedAmount = 0;
        int remainCashback = cashBackHackService.remain(testAmount);
        Assert.assertEquals(expectedAmount, remainCashback);
    }

    @org.junit.Test
    public void checkCashBackWithZeroAmount() {
        int testAmount = 0;
        int expectedAmount = 1000;
        int remainCashback = cashBackHackService.remain(testAmount);
        Assert.assertEquals(expectedAmount, remainCashback);
    }
}
