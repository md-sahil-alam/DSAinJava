package BinarySearch;


public class findInMountainArray {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,3,1};
    int target = 3;
    System.out.println(find(arr,target)); 
  }
  static int find(int [] arr, int target){
    int start = 0;
    int end = arr.length-1;
    while (start<end) { 
        int mid = start+(end-start)/2;
        if (arr[mid]==target) {
            return mid;
        }else if (arr[mid]>target) {
            end = mid-1;
        }else{
          start = mid+1;
        }
    }
    return -1;
  }

  
}
