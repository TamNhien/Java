/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai4_TongHieuTichThuong {
    public static void main(String[] args) {
        System.out.println("Tinh Tong Hieu Tich Thuong");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        int tong = tong(a , b);
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
        if(b == 0){
            return "Khong the chia cho 0";
        }
        else
        {
            return Double.toString((double)a/b);
        }
    }
}