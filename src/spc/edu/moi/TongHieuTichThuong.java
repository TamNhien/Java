package spc.edu.moi;
import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        int tong = tong(a, b);
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = hieu(a , b);
        System.out.println(a + " - " + b + " = " + hieu);
        int tich = tich(a , b);
        System.out.println(a + " * " + b + " = " + tich);
        String thuong = thuong(a , b);
        System.out.println(a + " / " + b + " = " + thuong);
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