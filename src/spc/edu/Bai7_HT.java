package spc.edu;
import java.util.Scanner;

public class Bai7_HT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap r: ");
        double r = sc.nextDouble();

        System.out.printf("Chu vi HT la: %.2f\n", 2 * Math.PI * r);
        System.out.printf("Dien tich HT la: %.2f\n", Math.PI * r * r);
    }
}