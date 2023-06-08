package leetCodeSolution;

import java.util.Scanner;

public class PowerOfTwo231 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = isPowerOfTwo(n);
        System.out.println(a);
    }
    public static boolean isPowerOfTwo(int n) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        

        if(n==Math.pow(2,x))
            return true;
        else
            return false;

    }
}
