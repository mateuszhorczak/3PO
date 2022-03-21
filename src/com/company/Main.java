package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stos stos1 = new Stos();
        Stos stos2 = new Stos();

        stos1.init(20);
        stos2.init(20);

        Scanner scanner = new Scanner(System.in);

        int value;
        for (int i = 0; i < 10; i++) {
            System.out.println("Wpisz liczbe: ");
            value = scanner.nextInt();
            stos1.push(value);
        }
        scanner.close();

        while (!stos1.empty()) {
            value = stos1.pop();
            stos2.push(value);
            System.out.println(value);
        }

        while (!stos2.empty()) {
            stos1.push(stos2.pop());
        }

        stos1.destroy();
        stos2.destroy();

    }
}
