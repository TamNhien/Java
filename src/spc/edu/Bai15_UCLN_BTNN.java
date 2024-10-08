package spc.edu;
import java.util.Scanner;

public class Bai15_UCLN_BTNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        
        int ucln = UCLN(a, b);
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + ucln);
        System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + (a * b / ucln));
    }
    private static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}