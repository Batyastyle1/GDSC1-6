package gdsc.java;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("================================");
//        for (int i=0; i <3; i++){
//            String s1 = scanner.nextLine();
//            int num = scanner.nextInt();
//
//            if(num >= 100) {
//                System.out.printf("%-15s%d\n",s1, num);
//            } else if( num >= 10){
//                System.out.printf("%-15s0%d\n" , s1 , num);
//            } else if ( num >= 0){
//                System.out.printf("%-15s00%d\n", s1 ,num);
//            }
//
//        }
//        System.out.println("================================");

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s",s1);
            System.out.printf("%03d\n",x);
        }
        System.out.println("================================");
        sc.close();
    }
    }

