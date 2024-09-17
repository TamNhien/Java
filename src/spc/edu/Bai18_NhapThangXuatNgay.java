/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import  java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai18_NhapThangXuatNgay {
    public static void main(String[] args) {
        System.out.println("Nhap thang xuat so ngay");
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap so thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        int days = DaysInMonth(month, year);
        System.out.printf("Thang %d nam %d co %d ngay.\n", month, year, days);
    }
    
    static int DaysInMonth(int month, int year)
    {
        if (month == 2){
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28;
        }
            return month == 4 || month == 6 || month == 9 || month == 11 ? 30 : 31;
    }
}