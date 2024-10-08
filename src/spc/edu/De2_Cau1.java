package spc.edu;
import java.util.Scanner;

public class De2_Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = sc.nextInt();
        
        int[] fibonacciArray = new int[n];

        if (n > 0) fibonacciArray[0] = 1;
        if (n > 1) fibonacciArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }

        int sum = 0;
        System.out.print("Day so Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
            sum += fibonacciArray[i];
        }
        System.out.println("\nTong cua day so: " + sum);
    }
}