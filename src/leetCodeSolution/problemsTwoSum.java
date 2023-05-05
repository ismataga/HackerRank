package leetCodeSolution;

import java.util.Scanner;

public class problemsTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[]  nums = {2,5,5,11};
        int target = sc.nextInt();

        int [] s = (int[]) sums(nums, target);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }


    }

    private static Object sums(Integer[] nums, int target) {

        for(int i = 0; i< nums.length; i++){
            for(int j = 1; j< nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    if(i!= j) {
                        int[] arrs = new int[]{i, j};
                        return arrs;
                    }
                }
            }
        }
        return null;
    }
}
