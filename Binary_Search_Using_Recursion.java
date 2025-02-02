import java.util.Arrays;

class Main {
    public static int Binary_Search_Using_Recursion(int[] arr ,int start , int end,int key){
        if(start > end){
            return -1 ;
        }
        int mid = (start + end ) / 2;
        if(key == arr[mid]){
            return mid;
        } else if (key < arr[mid]){
           return Binary_Search_Using_Recursion(arr , start , mid -1 , key);
        } else {
          return  Binary_Search_Using_Recursion(arr , mid + 1 , end , key);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,4,78,43,21,13,2,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start =0;
        int end = arr.length - 1;
        int key = 43;
      int index =   Binary_Search_Using_Recursion(arr, start, end , key);
      if(index >=0){
        System.out.println("Element found at index: "+ index);
      }else{
        System.out.println("Element not found in array");
      }
      
        
    }
}
