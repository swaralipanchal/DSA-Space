import java.util.Arrays;
class Main{  
    public static boolean IsPrime(int num){
        if(num==0 || num == 1){
            return false;
        }else{
            for(int i = 2;i <= Math.sqrt(num) ;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void Prime_Num_In_Array(int[] arr){
        int count =0;
       for(int i =0;i<arr.length-1;i++){
           if(IsPrime(arr[i])){
              count++; 
           }
       }
       int[] new_array = new int[count];
       int index=0;
       for(int i=0;i<arr.length-1;i++){
           if(IsPrime(arr[i])){
               new_array[index++] = arr[i];
           }
       }
       System.out.println("new array:  " + Arrays.toString(new_array));
    }
    public static void main(String args[]){  
        int[] arr = {2 , 3 , 12 , 4 , 7 , 11 , 23, 5, 29 , 44, 98} ;
           Prime_Num_In_Array(arr); 
    }  
   }  
