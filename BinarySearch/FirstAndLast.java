package BinarySearch;

public class FirstAndLast {
  public static void main(String[] args) {
    int[] nums = {5,7,7,8,8,8,10};
    int target = 8; 
    int[] ans = find(nums, target);
    System.out.println(ans[0]);
    System.out.println(ans[1]);
  }
  static int[] find(int[] nums, int target){
    int[] ans = {-1,-1}; 

    int start = 0;
    int end = nums.length-1;
    while (start<=end) { 
        int mid = start+(end-start)/2;
        if (nums[mid]==target) {
          ans[0] = left(nums,target);
          ans[1] = right(nums,target);
          break;
        }else if (target<nums[mid]) {
          end = mid-1;
        }else{
          start = mid+1;
        }
    }
    return ans;
  }

  static int left(int[] nums, int target){ 
    int start = 0, end = nums.length - 1;
    int ans = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            ans = mid;       
            end = mid - 1;   
        } else if (target < nums[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return ans;
  }


static int right(int[] arr, int target){ 
    int start = 0;
    int end = arr.length-1;
    int ans = -1;
    while (start<=end) { 
        int mid = start+(end-start)/2;
        if (arr[mid]==target) {
            ans = mid;
            start = mid+1;
        }else if (target<arr[mid]) {
          end = mid-1;
        }else{
          start = mid+1;
        }
    }
    
    return ans;
  }
}
