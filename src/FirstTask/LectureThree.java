package FirstTask;// package ua.com.prologistic.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectureThree {

    private static void doSomething(Object obj){

    }

    public static void main(String[] args) {

        /*
        Boolean boolean1 = new Boolean(true);
        Boolean boolean2 = new Boolean("Some String");

        System.out.println(boolean2);

        Integer integer1 = Integer.valueOf("6");
        Integer integer2 = Integer.valueOf(6);
        // преобразовывает 101011 к 43
        Integer integer3 = Integer.valueOf("101011", 2);

        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);

        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");
        long long3 = Long.parseLong("101010", 2);

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
        System.out.println("long3 = " + long3);

        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в  8-ой системе = " + string2);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в  2-ой системе = " + string3);

        Integer iOb = new Integer(1000);
        System.out.println(iOb.byteValue());
        System.out.println(iOb.shortValue());
        System.out.println(iOb.intValue());
        System.out.println(iOb.longValue());
        System.out.println(iOb.floatValue());
        System.out.println(iOb.doubleValue());

        int a = 7;
        double b = 0.0;
        double c = -0.0;
        double g = Double.NEGATIVE_INFINITY;
        System.out.println("7 / 0.0 = " + a / b);
        System.out.println("7 / -0.0 = " + a / c);
        System.out.println("0.0 == -0.0 = " + (b == c));
        System.out.println("-Infinity * 0 = " + g * 0);

        int i = 10;
        char c = 'a';

        //примитивы просты в использовании
        int j = i+3;

        //полиморфизм достигается с помощью классов-оболочек, мы не можем использовать примитивы здесь
        doSomething(new Character(c));

        List<Integer> list = new ArrayList<Integer>();
        //классы-оболочки могут быть использованы в коллекциях
        Integer in = new Integer(i);
        list.add(in);

        //Автоупаковка заботится о преобразовании примитива в соответственный класс-оболочку
        list.add(j);

        //классы-оболочки могут быть null
        in = null;

         */

        /*

        // Выводим текст "hello" на экран
        System.out.println("hello");

        // Создаем объект класса Scanner для чтения ввода от пользователя
        Scanner scanner = new Scanner(System.in);

        // Выводим текст "Введите ваше имя:" для запроса имени у пользователя
        System.out.println("Введите ваше имя:");

        // Считываем введенное имя с помощью метода nextLine() объекта Scanner
        String name = scanner.nextLine();

        // Выводим введенное имя на отдельной строке
        System.out.println("Ваше имя: " + name);

         */

        /*

        Scanner scanner = new Scanner(System.in); // создаем объект Scanner для ввода данных
        int firstNumber, secondNumber, sum; // объявляем переменные для двух чисел и суммы

        System.out.print("Введите первое число: "); // выводим подсказку для ввода первого числа
        firstNumber = scanner.nextInt(); // считываем первое число

        System.out.print("Введите второе число: "); // выводим подсказку для ввода второго числа
        secondNumber = scanner.nextInt(); // считываем второе число

        sum = firstNumber + secondNumber; // вычисляем сумму двух чисел

        System.out.println("Сумма чисел: " + sum); // выводим результат

         */

        /*

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int n = scanner.nextInt();

        // Инициализируем переменную, в которой будет храниться сумма цифр числа n
        int sum = 0;

        // Разбираем число по цифрам и добавляем каждую цифру к сумме
        while (n > 0) {
            // Получаем остаток от деления числа n на 10, чтобы получить последнюю цифру
            int digit = n % 10;

            // Добавляем полученную цифру к сумме
            sum += digit;

            // Делим число n на 10, чтобы "удалить" последнюю цифру
            n /= 10;
        }

        // Выводим результат на экран
        System.out.println("Сумма цифр числа: " + sum);

         */

        Scanner scanner = new Scanner(System.in);

        // Выводим сообщение с просьбой ввести первое число
        System.out.println("Введите первое натуральное число:");
        // Считываем введенное пользователем значение и сохраняем его в переменную q
        int q = scanner.nextInt();

        // Выводим сообщение с просьбой ввести второе число
        System.out.println("Введите второе натуральное число:");
        // Считываем введенное пользователем значение и сохраняем его в переменную w
        int w = scanner.nextInt();

        // Вычисляем результат деления q на w
        int result = q / w;
        // Вычисляем остаток от деления q на w
        int remainder = q % w;

        // Выводим результат на экран
        System.out.println("Результат деления " + q + " на " + w + " с остатком равен " + result + " (остаток: " + remainder + ")");

        // Закрываем объект класса Scanner
        scanner.close();
    }
}
