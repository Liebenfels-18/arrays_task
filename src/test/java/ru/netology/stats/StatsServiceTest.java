package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSumSale() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.getSumSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSumSale() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.getAverageSumSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();

        int expected = 7;
        int actual = service.getMonthMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.getMonthMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCountMonthLessAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.getCountMonthLessAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCountMonthMoreAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.getCountMonthMoreAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
