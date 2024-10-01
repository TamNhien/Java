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
public class D2_Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,S,V;
        System.out.println("Nhap r: ");
        r = sc.nextDouble();
        S = 4 * Math.PI * r * r;
        System.out.println("Dien tich: " + S);
        V = (4 * Math.PI * r * r * r) / 3;
        System.out.println("The tich: " + V);
    }
}
