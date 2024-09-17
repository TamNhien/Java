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
public class Bai9_LuyThua {
    public static void main(String[] args) {
        System.out.println("Luy thua");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap co so: ");
        int cs = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int sm = sc.nextInt();
        System.out.println(cs + " ^ " + sm + " = " + Math.pow(cs, sm));
    }
}