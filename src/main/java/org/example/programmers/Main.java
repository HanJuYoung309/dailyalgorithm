package org.example.programmers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) (Math.sqrt(c)-Math.sqrt(a));

        System.out.println(b_square);
    }
}
