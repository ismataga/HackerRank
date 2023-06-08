package leetCodeSolution;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {

        int k = removeElement(3);
        System.out.println(k);
    }


    public static int removeElement(int val) {
        int[] nums = {3, 2, 2, 3};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;

    }
}
