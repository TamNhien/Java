package spc.edu;
import  java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai12_TinhCanChi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam can tinh can chi: ");
        int nam = sc.nextInt();
        String can = TinhCan(nam);
        String chi = TinhChi(nam);
        //System.out.println("Nam " + nam + " la: " + can + " " + chi);
        System.out.printf("Nam %d la: %s %s\n", nam, can, chi);
    }
        
    static String TinhCan(int nam) {
        String[] canArray = { "Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky" };
        return canArray[nam % 10];
    }
    static String TinhChi(int nam) {
        String[] chiArray = { "Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Mao", "Thin", "Ty", "Ngo", "Mui" };
        return chiArray[nam % 12];
    }
}