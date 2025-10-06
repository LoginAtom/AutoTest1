package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }
}