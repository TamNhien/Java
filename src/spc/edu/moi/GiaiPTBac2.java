package spc.edu.moi;
import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        
        if (a == 0) {
            System.out.println(b == 0 ? (c != 0 ? "PTVSN" : "PTVN") : "PT co nghiem x1 = x2 = " + (-c / b));
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("PTVN");
            } else if (delta == 0) {
                System.out.println("PT co nghiem kep x1 = x2 = " + (-b / (2 * a)));
            } else {
                double sqrtDelta = Math.sqrt(delta);
                System.out.println("PT co nghiem\nx1 = " + ((-b + sqrtDelta) / (2 * a)) + "\nx2 = " + ((-b - sqrtDelta) / (2 * a)));
            }
        }
    }
}