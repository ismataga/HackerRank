package javaSolution;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double B = sc.nextDouble();
        double H = sc.nextDouble();

        double area = 0;

        if (B > 0 && H > 0) {
            area = B * H;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
