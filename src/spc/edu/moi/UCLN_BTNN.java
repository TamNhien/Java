package spc.edu.moi;
import java.util.Scanner;

public class UCLN_BTNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a, b));
        System.out.printf("Boi chung nho nhat cua %d va %d la: %d\n", a, b, (a * b / UCLN(a, b)));
    }
    private static int UCLN(int a, int b) {
        return b == 0 ? a : UCLN(b, a % b);  // Sử dụng đệ quy để tính UCLN
    }
}