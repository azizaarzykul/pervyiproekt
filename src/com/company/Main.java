package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;
        for ( ;a >0; a--) {
            b = b * a;

        }
        System.out.println(b);


        }

}

