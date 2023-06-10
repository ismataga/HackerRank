package hackerRank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A="madam";
        String a = "";
        for(int i = A.length()-1;i>=0;i--){
            a=a+A.charAt(i);
        }

        if(A.equals(a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
