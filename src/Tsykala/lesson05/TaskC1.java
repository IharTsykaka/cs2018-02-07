package Tsykala.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            ArrayList<Integer> list3 = new ArrayList<Integer>();
            ArrayList<Integer> list4 = new ArrayList<Integer>();
            for (int i = 0; i < 20; i++) {
                int n = sc.nextInt();
                list.add(n);
            }
            for (int i = 0; i < 20; i++) {
                if ( list.get(i) % 3 == 0 && list.get(i) % 2 == 0 ) {
                    list2.add(list.get(i));
                    list3.add(list.get(i));
                }
                else if (list.get(i) % 3 == 0) {
                    list2.add(list.get(i));
                }
                else if (list.get(i) % 2 == 0) {
                    list3.add(list.get(i));
                }
                else {
                    list4.add(list.get(i));
                }
            }
            printList(list2);
            printList(list3);
            printList(list4);
        }
        public static void printList(List<Integer> list) {

            for (int num : list) System.out.println(num);
            }

    }
  /*  public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int s = sc.nextInt();
            list.add(s);
            if (s % 3 == 0 && s % 2 == 0) {
                list1.add(s);
                list2.add(s);
            }
            else if (s % 3 == 0) {
                list1.add(s);
            }
            else if (s % 2 == 0) {
                list2.add(s);
            }
            else {
                list3.add(s);
            }
        }

    }
    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }

*/

