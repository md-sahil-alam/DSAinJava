package BinarySearch;


public class findInMountainArray {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,3,1};
    int target = 3;
    System.out.println(find(arr,target)); 
  }

  static int find(int [] arr, int target){
    int ans = -1;
    int start = 0;
    int end = arr.length-1;
    while (start<end) { 
        int mid = start+(end-start)/2;
        if (arr[mid]==target) {
          if (mid<ans) {
            ans =  mid;
            
          } 
        }else{
            ans = asearch(arr,target,mid);
            System.out.println(ans);
            break;
        }
      }
    return ans;
  }

  static int asearch(int[] arr , int target, int end){
    int ans = -1;
    int start = 0;
    while (start<end) { 
        int mid = start+(end-start)/2;
        if (arr[mid]==target) {
          if (mid<ans) {
            System.out.println(mid);
            return mid;
          } 
    }else if (arr[mid]>target) {
      end = mid-1;
    }else{
      start = mid + 1;
    }
  }
  return -1;
}
}
