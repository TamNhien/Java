/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu.moi;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NhapNamSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namsinh = sc.nextInt();
        int tuoi = 2024 - namsinh;
        System.out.println("Tuoi cua ban la " + tuoi);
    }
}