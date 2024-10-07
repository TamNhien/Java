package spc.edu.moi;
import java.util.Scanner;

public class LuyThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cs: ");
        int cs = sc.nextInt();
        System.out.print("Nhap sm: ");
        int sm = sc.nextInt();
        System.out.println(cs + " ^ " + sm + " = " + (int)Math.pow(cs, sm));
    }
}