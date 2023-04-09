package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // 1. Tests for method -getSumOfAllSales-
    // 1.1 Метод расчета суммы всех продаж
    @Test
    public void calculateSumOfAllSales() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 1.2 Метод расчета суммы всех продаж,
    // если массив состоит из одной ячейки
    @Test
    public void calculateSumOfAllSalesIfArrayHasOnlyOneCell() {
        StatsService service = new StatsService();

        int[] arrOfData = {8};
        int expected = 8;
        int actual = service.getSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 1.3 Метод расчета суммы всех продаж,
    // если массив пустой
    @Test
    public void calculateSumOfAllSalesIfArrayIsEmpty() {
        StatsService service = new StatsService();

        int[] arrOfData = new int[0];
        int expected = -1;
        int actual = service.getSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 1.4 Метод расчета суммы всех продаж,
    // если хотя бы одна из ячеек массива имеет отрицательное значение
    @Test
    public void calculateSumOfAllSalesIfArrayHasNegativeNumber() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, -20, 19, 20, 7, 14, 14, 18};
        int expected = -1;
        int actual = service.getSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 2. Tests for method -getAverageSumOfAllSales-
    // 2.1 Метод расчета средней суммы продаж в месяц,
    // при делении без остатка
    @Test
    public void calculateAverageSumOfAllSalesIfSumDividedWithoutRemainder() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15.0;
        double actual = service.getAverageSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 2.2 Метод расчета средней суммы продаж в месяц,
    // при делении с остатком
    @Test
    public void calculateAverageSumOfAllSalesIfSumDividedWithRemainder() {
        StatsService service = new StatsService();

        int[] arrOfData = {10, 7, 6};
        double expected = 7.67;
        double actual = service.getAverageSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 2.3 Метод расчета средней суммы продаж в месяц,
    // если массив состоит из одной ячейки
    @Test
    public void calculateAverageSumOfAllSalesIfArrayHasOnlyOneCell() {
        StatsService service = new StatsService();

        int[] arrOfData = {8};
        double expected = 8.0;
        double actual = service.getAverageSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 2.4 Метод расчета средней суммы продаж в месяц,
    // если массив пустой
    @Test
    public void calculateAverageSumOfAllSalesIfArrayIsEmpty() {
        StatsService service = new StatsService();

        int[] arrOfData = {};
        double expected = -1;
        double actual = service.getAverageSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 2.5 Метод расчета средней суммы продаж в месяц,
    // если хотя бы одна из ячеек массива имеет отрицательное значение
    @Test
    public void calculateAverageSumOfAllSalesIfArrayHasNegativeNumber() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, -20, 19, 20, 7, 14, 14, 18};
        double expected = -1;
        double actual = service.getAverageSumOfAllSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 3. Tests for method -getMonthNumberWithMaxSales-
    // 3.1 Метод расчета номера месяца, в котором был пик продаж,
    // если такиех месяцев несколько
    @Test
    public void calculateMonthNumberWithMaxSalesIfSeveralMonthsWithMaxSales() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.getMonthNumberWithMaxSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 3.2 Метод расчета номера месяца, в котором был пик продаж,
    // если такой месяц в ячейке с индексом 0
    @Test
    public void calculateMonthNumberWithMaxSalesIfMonthIsFirst() {
        StatsService service = new StatsService();

        int[] arrOfData = {25, 5, 5};
        int expected = 0;
        int actual = service.getMonthNumberWithMaxSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 3.3 Метод расчета номера месяца, в котором был пик продаж,
    // если такой месяц в последней ячейке
    @Test
    public void calculateMonthNumberWithMaxSalesIfMonthIsLast() {
        StatsService service = new StatsService();

        int[] arrOfData = {5, 5, 10, 25};
        int expected = arrOfData.length - 1;
        int actual = service.getMonthNumberWithMaxSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 3.4 Метод расчета номера месяца, в котором был пик продаж,
    // если массив состоит из одной ячейки
    @Test
    public void calculateMonthNumberWithMaxSalesIfArrayHasOnlyOneCell() {
        StatsService service = new StatsService();

        int[] arrOfData = {8};
        int expected = 0;
        int actual = service.getMonthNumberWithMaxSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 3.5 Метод расчета номера месяца, в котором был пик продаж,
    // если массив пустой
    @Test
    public void calculateMonthNumberWithMaxSalesIfArrayIsEmpty() {
        StatsService service = new StatsService();

        int[] arrOfData = {};
        int expected = -1;
        int actual = service.getMonthNumberWithMaxSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 3.6 Метод расчета номера месяца, в котором был пик продаж,
    // если хотя бы одна из ячеек массива имеет отрицательное значение
    @Test
    public void calculateMonthNumberWithMaxSalesIfArrayHasNegativeNumber() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, -20, 19, 20, 7, 14, 14, 18};
        int expected = -1;
        int actual = service.getMonthNumberWithMaxSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 4. Tests for method -getMonthNumberWithMinSales-
    // 4.1 Метод расчета номера месяца, в котором был минимум продаж
    @Test
    public void calculateMonthNumberWithMinSales() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMonthNumberWithMinSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 4.2 Метод расчета номера месяца, в котором был минимум продаж,
    // если такиех месяцев несколько
    @Test
    public void calculateMonthNumberWithMinSalesIfSeveralMonthsWithMinSales() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 7, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMonthNumberWithMinSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 4.3 Метод расчета номера месяца, в котором был минимум продаж,
    // если такой месяц в ячейке с индексом 0
    @Test
    public void calculateMonthNumberWithMinSalesIfMonthIsFirst() {
        StatsService service = new StatsService();

        int[] arrOfData = {2, 5, 5};
        int expected = 0;
        int actual = service.getMonthNumberWithMinSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 4.4 Метод расчета номера месяца, в котором был минимум продаж,
    // если такой месяц в последней ячейке
    @Test
    public void calculateMonthNumberWithMinSalesIfMonthIsLast() {
        StatsService service = new StatsService();

        int[] arrOfData = {5, 5, 10, 2};
        int expected = arrOfData.length - 1;
        int actual = service.getMonthNumberWithMinSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 4.5 Метод расчета номера месяца, в котором был минимум продаж,
    // если массив состоит из одной ячейки
    @Test
    public void calculateMonthNumberWithMinSalesIfArrayHasOnlyOneCell() {
        StatsService service = new StatsService();

        int[] arrOfData = {8};
        int expected = 0;
        int actual = service.getMonthNumberWithMinSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 4.6 Метод расчета номера месяца, в котором был минимум продаж,
    // если массив пустой
    @Test
    public void calculateMonthNumberWithMinSalesIfArrayIsEmpty() {
        StatsService service = new StatsService();

        int[] arrOfData = {};
        int expected = -1;
        int actual = service.getMonthNumberWithMinSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 4.7 Метод расчета номера месяца, в котором был минимум продаж,
    // если хотя бы одна из ячеек массива имеет отрицательное значение
    @Test
    public void calculateMonthNumberWithMinSalesIfArrayHasNegativeNumber() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, -20, 19, 20, 7, 14, 14, 18};
        int expected = -1;
        int actual = service.getMonthNumberWithMinSales(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 5. Tests for method -getMonthNumbersWithSalesBelowAverage-
    // 5.1 Метод расчета количества месяцев, в которых продажи были ниже среднего
    // (при делении без остатка)
    @Test
    public void calculateMonthNumbersWithSalesBelowAverageIfSumDividedWithoutRemainder() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthNumbersWithSalesBelowAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 5.2 Метод расчета количества месяцев, в которых продажи были ниже среднего
    // (при делении с остатком)
    @Test
    public void calculateMonthNumbersWithSalesBelowAverageIfSumDividedWithRemainder() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 7, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.getMonthNumbersWithSalesBelowAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 5.3 Метод расчета количества месяцев, в которых продажи были ниже среднего,
    // если в массиве значения ячеек одинаковые
    @Test
    public void calculateMonthNumbersWithSalesBelowAverageIfArrayHasEqualCells() {
        StatsService service = new StatsService();

        int[] arrOfData = {10, 10, 10, 10};
        int expected = 0;
        int actual = service.getMonthNumbersWithSalesBelowAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 5.4 Метод расчета количества месяцев, в которых продажи были ниже среднего,
    // если массив состоит из одной ячейки
    @Test
    public void calculateMonthNumbersWithSalesBelowAverageIfArrayHasOnlyOneCell() {
        StatsService service = new StatsService();

        int[] arrOfData = {8};
        int expected = 0;
        int actual = service.getMonthNumbersWithSalesBelowAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 5.5 Метод расчета количества месяцев, в которых продажи были ниже среднего,
    // если массив пустой
    @Test
    public void calculateMonthNumbersWithSalesBelowAverageIfArrayIsEmpty() {
        StatsService service = new StatsService();

        int[] arrOfData = {};
        int expected = -1;
        int actual = service.getMonthNumbersWithSalesBelowAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 5.6 Метод расчета количества месяцев, в которых продажи были ниже среднего,
    // если хотя бы одна из ячеек массива имеет отрицательное значение
    @Test
    public void calculateMonthNumbersWithSalesBelowAverageIfArrayHasNegativeNumber() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, -20, 19, 20, 7, 14, 14, 18};
        int expected = -1;
        int actual = service.getMonthNumbersWithSalesBelowAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 6. Tests for method -getMonthNumbersWithSalesAboveAverage-
    // 6.1 Метод расчета количества месяцев, в которых продажи были выше среднего
    // (при делении без остатка)
    @Test
    public void calculateMonthNumbersWithSalesAboveAverageIfSumDividedWithoutRemainder() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthNumbersWithSalesAboveAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 6.2 Метод расчета количества месяцев, в которых продажи были выше среднего
    // (при делении с остатком)
    @Test
    public void calculateMonthNumbersWithSalesAboveAverageIfSumDividedWithRemainder() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 7, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.getMonthNumbersWithSalesAboveAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 6.3 Метод расчета количества месяцев, в которых продажи были выше среднего,
    // если в массиве значения ячеек одинаковые
    @Test
    public void calculateMonthNumbersWithSalesAboveAverageIfArrayHasEqualCells() {
        StatsService service = new StatsService();

        int[] arrOfData = {10, 10, 10, 10};
        int expected = 0;
        int actual = service.getMonthNumbersWithSalesAboveAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 6.4 Метод расчета количества месяцев, в которых продажи были выше среднего,
    // если массив состоит из одной ячейки
    @Test
    public void calculateMonthNumbersWithSalesAboveAverageIfArrayHasOnlyOneCell() {
        StatsService service = new StatsService();

        int[] arrOfData = {8};
        int expected = 0;
        int actual = service.getMonthNumbersWithSalesAboveAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 6.5 Метод расчета количества месяцев, в которых продажи были выше среднего,
    // если массив пустой
    @Test
    public void calculateMonthNumbersWithSalesAboveAverageIfArrayIsEmpty() {
        StatsService service = new StatsService();

        int[] arrOfData = {};
        int expected = -1;
        int actual = service.getMonthNumbersWithSalesAboveAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }

    // 6.6 Метод расчета количества месяцев, в которых продажи были выше среднего,
    // если хотя бы одна из ячеек массива имеет отрицательное значение
    @Test
    public void calculateMonthNumbersWithSalesAboveAverageIfArrayHasNegativeNumber() {
        StatsService service = new StatsService();

        int[] arrOfData = {8, 15, 13, 15, 17, -20, 19, 20, 7, 14, 14, 18};
        int expected = -1;
        int actual = service.getMonthNumbersWithSalesAboveAverage(arrOfData);

        Assertions.assertEquals(expected, actual);
    }
}
