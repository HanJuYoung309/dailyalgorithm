package org.example.programmers;

import java.util.Scanner;

//문자열 돌리기
public class StrExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String [] list= a.split("");

        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }

    }

}
