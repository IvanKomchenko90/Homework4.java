package by.cycles;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args){
        // Задача 1 вывести все числа кратные 7 или 3 в диапазоне от 1 до 100.
        System.out.println("Задача 1");
        for (int x=1; x<=100; x++){
            if(x%7==0 && x%3==0){
                System.out.println(x);
            }
        }

        // Задача 2 ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму чисел от одного числа до другого.
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите a");
        int a = scanner.nextInt();
        System.out.println("введите b");
        int b = scanner.nextInt();
        int sum = 0;
        if (a<b) {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println("сумма чисел =" + sum);
        }
        else {
            for (int i = b; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println("сумма чисел =" + sum);
        }

        // Задача 3 ввести число с консоли, которое не заканчивается на 0. Вывести число в обратном порядке. Использовать оператор %.
        System.out.println("Задача 3");
        System.out.println("введите z");
        int z = scanner.nextInt();
        int n = 0, m = 0;
        while(z>0){
            m=z%10;
            n=n*10+m;
            z=z/10;
        }
        System.out.println("число в записанное в обратном порядке "+n);

        // Задача 4 ввести число с консоли, которое не заканчивается на 0. Вывести чётные и нечётные числа через while and if.
        System.out.println("Задача 4");
        System.out.println("введите z1");
        int z1 = scanner.nextInt();
        int n1 = 0, m1 = 0, a1 = 0;
        while(z1>0){
            m1=z1%10;
            if (m1%2==0){
                n1=n1*10+m1;
            }
            else {
                a1=a1*10+m1;
            }
            z1=z1/10;
        }
        System.out.println(" четные числа  " +n1);
        System.out.println(" нечетные числа  " +a1);
        }
    }

