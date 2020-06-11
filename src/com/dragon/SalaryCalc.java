package src.com.fedasov.salaryCalculation;
/*
 *
 * Программа для расчета заработной платы с учетом налога 13%.
 * Для расчета просто введите значение заработной платы.
 *
 */

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        System.out.println("Введите значение заработной платы: ");
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        System.out.println("Заработная плата с учетом налога составляет: "
                + salary * 0.87 + " рублей.");
    }
}
