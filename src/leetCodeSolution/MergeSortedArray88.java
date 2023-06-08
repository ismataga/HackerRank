package leetCodeSolution;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = { 0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m + n];

        for (int i = 0; i < m; i++) {
            merge[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            merge[m + j] = nums2[j];
        }
        Arrays.sort(merge);
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
