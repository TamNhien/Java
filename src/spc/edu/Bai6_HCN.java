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
public class Bai6_HCN {
    public static void main(String[] args) {
        System.out.println("Tinh hinh chu nhat");
        double a,b,S,P;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        a = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        b = sc.nextDouble();
        P = (a + b) * 2;
        System.out.println("Chu vi hcn la: " + P);
        S = a * b;
        System.out.println("Dien tich hcn la: " + S);
    }
}