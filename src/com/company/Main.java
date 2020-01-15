package com.company;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in); // объявим объект для ввода
        System.out.println ("Введите ваши данные: ");
        System.out.println ("Фамилия: ");
        String str;
        str = in.next();
        System.out.println("");
        //System.out.printf ("%s \n",str );

        System.out.println ("Имя: ");
        str = in.next();
        System.out.printf ("\n");

        System.out.println ("Отчество: ");
        str = in.next();
        System.out.printf ("\n");

        System.out.println ("Возраст: ");
        int old;
        old = in.nextInt();
        System.out.printf ("\n");

        System.out.println ("Стаж на первой работе : ");
        int work1;
        work1 = in.nextInt();
        System.out.printf ("\n");

        System.out.println ("Стаж на второй работе : ");
        int work2;
        work2 = in.nextInt();
        System.out.printf ("\n");

        System.out.println ("Общий стаж : ");
        work1  = work1 + work2;
    System.out.printf ("%d \n",work1 );

        System.out.println ("Результат собеседования: ");
        if (work1>= 3)  System.out.print("Yes");
            else System.out.print("No");
            //
    }
}
