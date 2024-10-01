/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class De2_Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int N = sc.nextInt();
        
        int[] fibonacciArray = new int[N];

        if (N > 0) fibonacciArray[0] = 1;
        if (N > 1) fibonacciArray[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }

        int sum = 0;
        System.out.print("Day so Fibonacci: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacciArray[i] + " ");
            sum += fibonacciArray[i];
        }
        System.out.println("\nTong cua day so: " + sum);
    }
}