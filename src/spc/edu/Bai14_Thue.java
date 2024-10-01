package spc.edu;
import java.util.Scanner;

public class Bai14_Thue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        double luong = sc.nextDouble();
        System.out.print("Nhap thuong: ");
        double thuong = sc.nextDouble();
        double thunhap = luong + thuong;
        double thue = tinhThue(thunhap);
        
        if (thue == 0) {
            System.out.println("Khong dong thue");
        } else {
            System.out.printf("Thue la: %.2f trieudong\n", thue);
        }
    }
    private static double tinhThue(double thunhap) {
        if (thunhap < 9) return 0;
        if (thunhap < 15) return thunhap * 0.1;
        if (thunhap < 30) return thunhap * 0.15;
        return thunhap * 0.2;
    }
}