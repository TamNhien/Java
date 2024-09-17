/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import  java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai14_Thue {
    public static void main(String[] args) {
        System.out.println("Tinh Thue");
        Scanner sc = new Scanner(System.in);
        double luong, thuong, thunhap, thue;
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble();
        System.out.print("Nhap thuong: ");
        thuong = sc.nextDouble();
        System.out.print("Thue thu nhap: ");
        thunhap = luong + thuong;
        if (thunhap < 9){
            System.out.println("Khong dong thue");
        }
        else if (9 < thunhap && thunhap < 15){
            thue = thunhap*0.1;
            System.out.printf("Thue la: %.2f trieudong\n",thue);
        }
        else if (15 < thunhap && thunhap < 30){
            thue = thunhap*0.15;
            System.out.printf("Thue la: %.2f trieudong\n",thue);
        }
        else {
            thue = thunhap*0.2;
            System.out.printf("Thue la: %.2f trieudong\n",thue);
        }
    }
}