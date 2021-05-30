package com.company;

import java.util.Scanner;

import static  java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Здравствуйте, как ва зовут? ");

        String name = in.next();

        out.printf("Рад!, %s \n", name);
    }
}