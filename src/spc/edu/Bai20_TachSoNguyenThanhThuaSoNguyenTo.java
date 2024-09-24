/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai20_TachSoNguyenThanhThuaSoNguyenTo {
    public static void phanTich(int n){
        int i = 2;
        System.out.print(n + " = ");
        while (n > 1){
            if (checkSNT(i)){
                while (n % i == 0){
                    System.out.print(i);
                    n /= i;
                    if (n > 1)System.out.print(" * ");
                }
            }
            i++;
        }
        System.out.println();
    }
    
    public static boolean checkSNT(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static int nhap(){
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check){
            System.out.print("Nhap so nguyen n: ");
            try{
                n = sc.nextInt();
                check = true;
            }catch (Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                sc.nextLine();
            }
        }
        return (n);
    }
    
    public static void main(String[] args) {
        int n = nhap();
        phanTich(n);
    }
}