package spc.edu.moi;
import java.util.Scanner;

public class TinhTienVonVaLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double T;
        System.out.print("Nhap so tien gui ban dau (trieu dong): ");
        T = sc.nextDouble();
        
        for (int year = 1; year <= 15; year++){
            double tien_von = T * Math.pow(1 + 0.08, year);
            double tien_lai = T * 0.08 * year;
            
            System.out.printf("Nam: %d\tTien von: %.2f trieu dong\tTien lai: %.2f trieu dong%n",year, tien_von, tien_lai);
        }
    }
}
