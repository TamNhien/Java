package spc.edu;
import  java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai10_GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, sonhap, giaithua = 1;
        System.out.print("Nhap so can tinh giai thua: ");
        sonhap = sc.nextInt();
        while (i <= sonhap) {
            giaithua *= i;
            i++;
        }
        System.out.printf("Giai thua cua %d la %d",sonhap,giaithua);
    }
}