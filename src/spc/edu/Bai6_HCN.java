package spc.edu;
import java.util.Scanner;

public class Bai6_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double a = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double b = sc.nextDouble();
        
        System.out.printf("Chu vi hcn la: %.2f\n", (a + b) * 2);
        System.out.printf("Dien tich hcn la: %.2f\n", a * b);
    }
}