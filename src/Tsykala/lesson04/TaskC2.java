package Tsykala.lesson04;

import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int m = sc.nextInt();
    int day = 0;
        switch (m) {
            case 1:
                day = d;
                System.out.println(day);
                break;
            case 2:
                day = 31 + d;
                System.out.println(day);
                break;
            case 3:
                day = 31 + 28 + d;
                System.out.println(day);
                break;
            case 4:
                day = 31 + 28 + 31 + d;
                System.out.println(day);
                break;
            case 5:
                day = 31 + 28 + 31 + 30 + d;
                System.out.println(day);
                break;
            case 6:
                day = 31 + 28 + 31 + 30 + 31 + d;
                System.out.println(day);
                break;
            case 7:
                day = 31 + 28 + 31 + 30 + 31 + 30 + d;
                System.out.println(day);
                break;
            case 8:
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
                System.out.println(day);
                break;
            case 9:
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
                System.out.println(day);
                break;
            case 10:
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
                System.out.println(day);
                break;
            case 11:
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
                System.out.println(day);
                break;
            case 12:
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
                System.out.println(day);
                break;
        }
    }
}
