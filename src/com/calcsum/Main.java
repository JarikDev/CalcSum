package com.calcsum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert A");
        a = scanner.nextInt();
        System.out.println("Insert B");
        b = scanner.nextInt();

        CalcSum calc = new CalcSum(a, b);
        System.out.println("A = " + calc.getA());
        System.out.println("B = " + calc.getB());
        res = calc.calcSum(calc.getA(), calc.getB());
        System.out.println("Result equals to: " + res);

    }
}
