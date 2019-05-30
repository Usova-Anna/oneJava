
package Lesson1;

import java.util.Scanner;

public class Calculator {

    static Scanner scan = new Scanner(System.in);

    public static int getInt() {// считывает с консоли целое число и возвращает его
        System.out.print("Введите число: ");
        int number;
        if (scan.hasNextInt())
            number = scan.nextInt();
        else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();// рекурсия, НЕ ПОНЯТНО
            number = getInt();
        }

        return number;
    }

    static char getOperation() {// должен считывать с консоли какое-то значение и возвращать символ с операцией
            //(+, -, * или /)
        System.out.print("\n" +
                "Введите операцию:");
        char operation;
        if (scan.hasNext())
            operation = scan.next().charAt(0); // дурацкая проверка, позволяет вводить цифры вместо операций. НЕ  ПОНЯТНО

        else {
            System.out.println("\n" +
                    "Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scan.next();//рекурсия, НЕ ПОНЯТНО
            operation = getOperation();
        }
        return operation;
    }

    public static long schet(int x1, int x2, char oper) {
        long result;
        if (oper == '+') {
            result = x1 + x2;
            return (int) result;

        }
        if (oper == '-') {
            result = x1 - x2;
            return (int) result;

        }
        if (oper == '/') {
            result = x1 / x2;
            return (int) result;

        }
        if (oper == '*') {
            result = x1 * x2;
            return (int) result;

        }
        if (oper == '%') {
            result = x1 % x2;
            return (int) result;

        }
        if (oper == '^') { //не работает из-за типа данных НЕ ПОНЯТНО.
            result = x1 ^ x2;
            return result;

        } else
            return 0; //      НЕ ПОНЯТНО КАК БЕЗ ELSE
    }

    public static void main(String[] arg) {
        System.out.print("\n" +"Первое число:  ");
        int num1 = getInt();
        System.out.print("Второе число: ");
        int num2 = getInt();
        System.out.print("Вы ввели операцию: ");
        char operation = getOperation();
        long result = schet(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

}