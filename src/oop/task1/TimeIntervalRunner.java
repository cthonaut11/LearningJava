package oop.task1;

/**
 * 1. Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя способами:
 * секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте.
 * Создать два конструктора: первый принимает общее количество
 * секунд, второй часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Создать метод для сложения двух интервалов.
 */

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 0);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(3750);
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval sumTimeIntervals = timeInterval.sum(timeInterval2);
        sumTimeIntervals.print();
    }
}
