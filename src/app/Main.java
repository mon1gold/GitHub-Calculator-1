package app;

public class Main {
    static int a = 8;
    static int b = 2;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        System.out.println(subtraction(a, b));
        System.out.println(division(a, b));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static double division(int a, int b) {
        return (double) a / b;
    }
}
//1) Клонировать проект GitHub-Calculator-1 в папку проектов.
//
//        https://github.com/emyca/GitHub-Calculator-1
//
//        2) Добавить функционал вычитания и деления, вывод их результатов (ветка develop).
//
//        3) Вынести декларацию переменных за пределы main (ветка develop).
//
//        4) Смержить ветку develop в ветку master. Ветку develop не удалять.
//
//        5) Изменения должны отражаться на GitHub.