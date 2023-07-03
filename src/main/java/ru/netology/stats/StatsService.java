package ru.netology.stats;

public class StatsService {

    //номер месяца минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // сумма всех продаж

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long element : sales)
            sum += element;
        return sum;
    }

    // средняя сумма продаж в месяц
    public int averageSumSales(long[] sales) {
        int sum = 0;
        int average = 0;
        for (long element : sales)
            sum += element;
        average = sum / sales.length;
        return average;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int countMonthLessThanAverage(long[] sales) {
        int average = averageSumSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;

    }

    // количество месяцев, в которых продажи были выше среднего
    public int countMonthHigherThanAverage(long[] sales) {
        int average = averageSumSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}
