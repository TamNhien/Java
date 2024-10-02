package spc.edu;
import java.util.Scanner;

public class Bai19_TongCacChuSoCuaSoNguyen {
    public static void main(String[] args) {
        int n = nhap();
        System.out.printf("Tong cua so %d = %d\n", n, tinhTong(n));
    }
    public static int nhap() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            System.out.print("Nhap n: ");
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
    public static int tinhTong(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;  // Cộng chữ số cuối vào tổng
            n /= 10;        // Bỏ chữ số cuối cùng
        }
        return sum;
    }
}