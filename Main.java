package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = in.nextInt();
        System.out.println("Input array: ");
        int m[] = new int[n];
        for(int i = 0; i < n; i++)
            m[i] = in.nextInt();
        System.out.print(m[n-1]);
        for(int i = 0; i < n - 1; i++)
            System.out.print(" " + m[i]);
    }
}