package spc.edu;

public class Bai13_BangCc {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %-4d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}