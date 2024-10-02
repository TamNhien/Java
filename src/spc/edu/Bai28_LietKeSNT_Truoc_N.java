package spc.edu;
import java.util.Scanner;

public class Bai28_LietKeSNT_Truoc_N {
    public static void lietKe(int n) {
        for(int i=3;i<n;i+=2){
            if(checkSNT(i))System.out.print(" " + i);
        }
    }
    public static boolean checkSNT(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int nhap(){
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check){
            System.out.print("");
            try{
                n = sc.nextInt();
                check = true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! Hay nhap lai...");
                sc.nextLine();
            }
        }
        return (n);
    }
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = nhap();
        System.out.println("Cac SNT nho hon n: " + n + " ");
        lietKe(n);
    }
}
