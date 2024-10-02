package spc.edu.moi;
import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.print("Nhap c: ");
        c = sc.nextDouble();
        
        if (a == 0)
            if (b == 0)
                if(c != 0) {
                    System.out.println("PTVSN");
                } else {
                    System.out.println("PTVN");
                }
            else {
                System.out.println("PT co nghiem x1 = x2 = " + (-c / b));
            }
        else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("PTVN");
            }
            else if (delta == 0) {
                System.out.println("PT có nghiem kep x1 = x2 = " + (-b / (2 * a)));
            }
            else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("PT co nghiem " + "\nx1 = " + x1 + "\nx2 = " + x2);
            }
        }
    }
}