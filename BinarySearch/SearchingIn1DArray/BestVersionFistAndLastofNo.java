package BinarySearch.SearchingIn1DArray;

import java.util.Arrays;

public class BestVersionFistAndLastofNo {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 8, 8, 10};
        int target = 8;

        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = findBound(nums, target, true);   // first occurrence
        ans[1] = findBound(nums, target, false);  // last occurrence

        return ans;
    }

    static int findBound(int[] nums, int target, boolean isFirst) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) {//to find fist index
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right to find last index
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
