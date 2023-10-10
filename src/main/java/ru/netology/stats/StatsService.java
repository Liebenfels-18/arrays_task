package ru.netology.stats;

public class StatsService {

    public int getSumSale(int[] sales) { // сумма всех продаж
        int sumSale = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSale = sumSale + sales[i];
        }
        return sumSale;
    }

    public int getAverageSumSale(int[] sales) { // средняя сумма продаж
        int averageSumSale = getSumSale(sales) / sales.length;

        return averageSumSale;
    }

    public int getMonthMaxSales(int[] sales) { // месяц, в котором был пик продаж
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) {
                monthMaxSales = i;
            }
        }
        return monthMaxSales;
    }

    public int getMonthMinSales(int[] sales) { // месяц в котором был минимум продаж
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales;
    }

    public int getCountMonthLessAverage(int[] sales) { // кол-во месяцев с продажами ниже среднего
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSumSale(sales)) {
                count++;
            }
        }
        return count;
    }

    public int getCountMonthMoreAverage(int[] sales) { // кол-во месяцев с продажами выше среднего
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSumSale(sales)) {
                count++;
            }
        }
        return count;
    }

}
