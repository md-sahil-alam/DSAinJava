package BinarySearch;

public class BSearchInInfinitArr {
  public static void main(String[] args) {
  int[] oldArr = {2,5,6,7,8,9,11,44,55,77,99,111,333,444,666,777};

  int[] arr = new int[1000];
  for(int i = 0; i < oldArr.length; i++) {
    arr[i] = oldArr[i];
  }

  // fill remaining indexes
  int value = oldArr[oldArr.length - 1] + 1; // start from 778
  for (int i = oldArr.length; i < 1000; i++) {
    arr[i] = value++;
  }

    int target =1000;
    int start = 0;
    int end = 333;
    while(target>=arr[end]){
      start = end+1;
      end=end*2;
      System.out.println("start = "+start);
      System.out.println("end = "+end);
    }
    
    System.out.println("ans = "+find(arr, target, start, end));
  }
  static int find(int[] arr,int target,int start,int end){
    int ans = -1;

    while(start<=end){
      int mid = start+(end-start)/2;
      if (arr[mid]==target) {
        return mid;
      }else if (target<arr[mid]) {
          end = mid-1;
      }else{
         start = mid+1;
      }
    } 
    
    return ans;
  }
}
