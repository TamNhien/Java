package spc.edu.moi;
import java.util.Scanner;

public class HT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap r: ");
        double r = sc.nextDouble();
        
        System.out.printf("Chi vi ht la: %.2f\n", 2 * Math.PI * r);
        System.out.printf("Dien tich ht la: %.2f\n", Math.PI * r * r);
    }
}