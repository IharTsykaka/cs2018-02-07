package Tsykala.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList();
        String s1 = "1 string";
        String s2 = "2 string";
        String s3 = "3 string";
        String s4 = "4 string";
        String s5 = "5 string";
        list.add(0, s1);
        list.add(1, s2);
        list.add(2, s3);
        list.add(3, s4);
        list.add(4, s5);
        int n = list.size();
        System.out.println(n);
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));
        }
    }
}
