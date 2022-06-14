package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("квадратный корень: ");
        int san = scanner.nextInt();
        UnryOperator unryOperator = num -> Math.sqrt(san);
        System.out.println(unryOperator.sqrt(san));
    }
}

@FunctionalInterface
interface UnryOperator {
    double sqrt(double num);
}


