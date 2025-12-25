package BinarySearch;

public class PeakIndexInMountainArray {
  public static void main(String[] args) {
    int [ ] arr = {0,1,0};
    System.out.println(peak(arr));
  }
  static int peak(int[] arr){
    int start = 0;
    int end = arr.length-1;
    
    while (start<end) { 
      int mid = start+(end-start)/2;
        if (arr[mid]<arr[mid+1]) {
          start = mid+1;
        }else{
          end = mid;
        }
    }
    return start;
  }
}
