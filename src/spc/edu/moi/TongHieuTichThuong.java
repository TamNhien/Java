package spc.edu.moi;
import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + tong(a, b));
        System.out.println(a + " - " + b + " = " + hieu(a, b));
        System.out.println(a + " * " + b + " = " + tich(a, b));
        System.out.println(a + " / " + b + " = " + thuong(a, b));
    }
    private static int tong(int a, int b){
        return a + b;
    }
    private static int hieu(int a, int b){
        return a - b;
    }
    private static int tich(int a, int b){
        return a * b;
    }
    private static String thuong(int a, int b){
        return b == 0 ? "Khong the chia cho 0" : Double.toString((double) a / b);
    }
}