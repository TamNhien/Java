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
public class Bai16_ChuyenHeCoSo10 {
    public static void doiCoSo(int n, int base){
        if (n >= base) doiCoSo (n / base, base);
        if (n % base > 9) System.out.printf("%c", n % base + 55);
        else
            System.out.print((n % base));
    }
    
    public static int nhap(){
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check){
            System.out.print(" ");
            try {
                n = sc.nextInt();
                check = true;
            } catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                sc.nextLine();
            }
        }
        return(n);
    }
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = nhap();
        System.out.print("Nhap vao co so can chuyen sang b: ");
        int b = nhap();
        System.out.printf("So %d chuyen sang co so %d thanh: ",n,b);
        doiCoSo(n,b);
    }
}