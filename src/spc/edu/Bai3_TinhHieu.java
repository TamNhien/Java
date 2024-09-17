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
public class Bai3_TinhHieu {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh hieu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
    }
}