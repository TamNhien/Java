package spc.edu.moi;
import java.util.Scanner;

public class Fibonacci_TinhTongDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        int[] fibonacciArray = new int[n];
        if (n > 0) fibonacciArray[0] = 1;
        if (n > 1) fibonacciArray[0] = 1;
        
        for (int i = 2; i < n; i++) {
           fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];  
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
            sum += fibonacciArray[i];
        }
        System.out.println("\nTong cua day so la: " + sum);
    }
}