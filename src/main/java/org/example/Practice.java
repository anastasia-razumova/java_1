package org.example;

public class Practice {

    public static void main(String[] args) {
        //Maтeматические операторы
        int exampleOne = 10;
        int exampleTwo = 2;


        System.out.println(exampleOne+exampleTwo);
        System.out.println(exampleOne-exampleTwo);
        System.out.println(exampleOne/exampleTwo);
        System.out.println(exampleOne*exampleTwo);
        System.out.println(exampleOne%exampleTwo);

        //Условные операторы
        if (exampleOne > exampleTwo) {
            System.out.println("Первая переменная больше второй");
        } else if(exampleOne < exampleTwo) {
            System.out.println("Первая переменная меньше второй");
        } else {
            System.out.println("Переменные равны");
        }

        //Логические операторы
        if(exampleOne >exampleTwo && exampleOne>0) {
            System.out.println("Первая переменная больше второй и является положительным числом");
        } else if (exampleOne<0 || exampleOne<exampleTwo) {
            System.out.println("Первая переменная меньше второй или является отрицательным числом");
        }

        //Переполнение при вычеслениях
        int exampleThree = 2000000000;
        int exampleFour = exampleThree * exampleOne;
        System.out.println(exampleFour);

        //Комбинаций типов данных (int и double)
        double exampleFive = 10.5;
        System.out.println(exampleTwo+exampleFive);
    }
}
