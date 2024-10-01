package spc.edu.moi;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can tinh giai thua: ");
        int i = 1, sonhap, giaithua = 1;
        sonhap = sc.nextInt();
        while (i <= sonhap){
            giaithua *= i;
            i++;
        }
        System.out.printf("Giai thua cua %d la %d",sonhap,giaithua);
    }
}