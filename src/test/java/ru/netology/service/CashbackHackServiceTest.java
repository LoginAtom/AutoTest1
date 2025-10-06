package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenAmountExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual); 
    }

    @Test
    public void testRemainWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }
}