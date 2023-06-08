package hackerRank;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length()+B.length();
        System.out.println(a);
        char x = A.charAt(0);
        char y = B.charAt(0);
        if(x>y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        A = A.substring(0, 1).toUpperCase()+
                A.substring(1, (A.length())).toLowerCase();
        B = B.substring(0, 1).toUpperCase()+
                B.substring(1, (B.length())).toLowerCase();
        System.out.println(A+" "+B);



    }
}
