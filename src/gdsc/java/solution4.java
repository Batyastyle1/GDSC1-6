package gdsc.java;

import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String W = "Weird";
        String NW = "Not Weird";

        if (N % 2 == 1){
            System.out.println(W);
        } else if (N >= 2 && N<=5 ){
            System.out.println(NW);

        } else if (N >= 6 && N <= 20) {
            System.out.println(W);
        } else {
            System.out.println(NW);
        }
        scanner.close();
    }
}
