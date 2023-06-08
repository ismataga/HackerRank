package leetCodeSolution;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
      boolean is =   isPalindrome(x);
        System.out.println(is);
    }



    public static boolean isPalindrome(int x) {
        int z =x;
        int  y = 0;
        int palindrome = 0;
        boolean a= false;

        while(z>0){
            y=z%10;
            z=z/10;
            palindrome = palindrome*10 + y;
        }
        if(x==palindrome){
            return true;
        }
        return a;
    }
}
