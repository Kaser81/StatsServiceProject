package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAvg(int[] sales) {
        int num = 0;
        for (int sale : sales) {
            if (sale < calculateAvg(sales)){
                num++;
            }
        }
            return num;
        }

    public int overAvg(int[] sales) {
        int num = 0;
        for (int sale : sales) {
            if (sale > calculateAvg(sales)){
                num++;
            }
        }
        return num;
    }
    }
















//if (sale < calculateAvg(sales))
//        int minMonth = 0;
//        int month = 0;
//        for (int sale : sales) {
//            if (sale <= sales[minMonth]) {
//                minMonth = month;
//            }
//            month = month + 1;
//        }
//        return minMonth + 1;
