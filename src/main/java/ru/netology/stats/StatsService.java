package ru.netology.stats;

public class StatsService {
    public int getSumOfAllSales(int[] arrOfSales) {
        int tempSum = 0; // сумма всех продаж

        if (arrOfSales.length == 0) {
            return -1;
        }

        for (int arrTemp : arrOfSales) {
            if (arrTemp < 0) {
                return -1;
            }
            tempSum += arrTemp;
        }

        return tempSum;
    }

    public double getAverageSumOfAllSales(int[] arrOfSales) {

        double averageSum = 0.0;
        double tempSum = (double) getSumOfAllSales(arrOfSales);
        double scale = Math.pow(10, 2);

        if (tempSum == -1) {
            return -1;
        }

        averageSum = Math.round((tempSum / arrOfSales.length) * scale) / scale;

        return averageSum;
    }

    public int getMonthNumberWithMaxSales(int[] arrOfSales) {
        int monthNumber = 0;

        if (arrOfSales.length == 0) {
            return -1;
        }

        for (int i = 0; i < arrOfSales.length; i++) {
            if (arrOfSales[i] < 0) {
                return -1;
            }
            if (arrOfSales[i] >= arrOfSales[monthNumber]) {
                monthNumber = i;
            }
        }

        return monthNumber;
    }

    public int getMonthNumberWithMinSales(int[] arrOfSales) {
        int monthNumber = 0;

        if (arrOfSales.length == 0) {
            return -1;
        }

        for (int i = 0; i < arrOfSales.length; i++) {
            if (arrOfSales[i] < 0) {
                return -1;
            }
            if (arrOfSales[i] <= arrOfSales[monthNumber]) {
                monthNumber = i;
            }
        }

        return monthNumber;
    }

    public int getMonthNumbersWithSalesBelowAverage(int[] arrOfSales) {
        int monthNumbers = 0;
        double averageSum = getAverageSumOfAllSales(arrOfSales);

        if (arrOfSales.length == 0 || averageSum == -1) {
            return -1;
        }

        for (int arrTemp : arrOfSales) {
            if (arrTemp < averageSum) {
                monthNumbers++;
            }
        }

        return monthNumbers;
    }

    public int getMonthNumbersWithSalesAboveAverage(int[] arrOfSales) {
        int monthNumbers = 0;
        double averageSum = getAverageSumOfAllSales(arrOfSales);

        if (arrOfSales.length == 0 || averageSum == -1) {
            return -1;
        }

        for (int arrTemp : arrOfSales) {
            if (arrTemp > averageSum) {
                monthNumbers++;
            }
        }

        return monthNumbers;
    }
}
