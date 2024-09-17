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
public class Bai7_HT {
    public static void main(String[] args) {
        System.out.println("Tinh Hinh Tron");
        double r,S,P;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap r: ");
        r = sc.nextDouble();
        P = 2 * Math.PI * r;
        System.out.println("Chu vi HT la: " + P);
        S = Math.PI * r * r;
        System.out.println("Dien tich HT la: " + S);
    }
}