package spc.edu;
import java.util.Scanner;

public class Bai16_ChuyenHeCoSo10 {
    public static void doiCoSo(int n, int base) {
        if (n >= base) doiCoSo(n / base, base);
        System.out.print((n % base > 9) ? (char)(n % base + 55) : n % base);
    }
    public static int nhap(String prompt) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            System.out.print(prompt);
            try {
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! Hay nhap lai...");
                sc.nextLine();
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n = nhap("Nhap n: ");
        int b = nhap("Nhap vao co so can chuyen sang b: ");
        System.out.printf("So %d chuyen sang co so %d thanh: ", n, b);
        doiCoSo(n, b);
    }
}