package spc.edu;
import java.util.Scanner;

public class Bai20_TachSoNguyenThanhThuaSoNguyenTo {
    public static void phanTich(int n) {
        System.out.print(n + " = ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) System.out.print(" * ");
            }
        }
        System.out.println();
    }
    public static int nhap() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Nhap so nguyen n: ");
            try {
                n = sc.nextInt();
                if (n > 1) break;
                else System.out.println("Vui long nhap so nguyen lon hon 1.");
            } catch (Exception e) {
                System.out.println("Ban phai nhap so nguyen! Hay thu lai...");
                sc.nextLine();
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n = nhap();
        phanTich(n);
    }
}