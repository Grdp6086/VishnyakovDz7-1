package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {

    @Test
    public void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxIfZeroIndexLess() {
        StatisticService service = new StatisticService();

        long[] incomesInBillion = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};

        long expected = 13;

        long actual = service.findMax(incomesInBillion);

        Assertions.assertEquals(expected, actual);

    }
}
