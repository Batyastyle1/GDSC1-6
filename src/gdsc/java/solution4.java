package gdsc.java;

import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String W = "Weird";
        String NW = "Not Weird";

        if ( N <= 5 && N >=2){
            System.out.println(W);
        } else if(N <= 20 && N >= 6 ) {
            System.out.println(W);
        }else if(N > 20){
            System.out.println(NW);
        }

        scanner.close();
    }
}
