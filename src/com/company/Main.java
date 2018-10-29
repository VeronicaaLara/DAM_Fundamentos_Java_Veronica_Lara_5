package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pedir dos números y decir si son iguales o no


        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Introduce primer número");
        numero1 = sc.nextInt();
        System.out.println("Introduce segundo número");
        numero2 = sc.nextInt();

        if (numero1 == numero2){
            System.out.println("Son iguales");

        } else{
            System.out.println("No son iguales");
        }

        sc.close();
    }
}
