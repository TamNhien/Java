package spc.edu;

public class Bai27_String01 {
    public static void main(String[] args) {
        System.out.println("Xuat thong tin");
        String fullname = "Le Thanh Loc";
        System.out.println(fullname);
        System.out.println("Ho: " + fullname.substring(0, 2));
        System.out.println("Chu lot: " + fullname.substring(3, 8));
        System.out.println("Ten: " + fullname.substring(9, 12));
        System.out.println("Viet hoa: " + fullname.toUpperCase());
    }
}