import java.util.Arrays;
public class Duplicates_in_an_Array{
public class DuplicateBruteForce {    
    public static void findDuplicates(int[] array) {    
        for (int i = 0; i < array.length; i++) {    
            for (int j = i + 1; j < array.length; j++) {    
                if (array[i] == array[j]) {    
                    System.out.println("Duplicate element found: " + array[i]);    
                    break;    
                }    
            }    
        }    
    }    
    public static void main(String[] args) {    
        int[] array = {4, 5, 6, 7, 5, 6};    
        findDuplicates(array);    
    }   
} 
//here each element is getting compared with the rest in the forward direction 
// 4 with 5 , 6, 7, 5 , 6 
//then 5 with 6 , 7 , 5 then break here! -- duplicate found 5
//then 6 with 7 , 5 , 6 then break here! -- duplicate found 6

//This approach has a time complexity of O(n^2), which is not efficient for large arrays.
// -------------------------------------------------------------------------------------
//2nd approach -- using sorting , first sort the array then check only ajacents in each pass



public class DuplicateSort {    
    public static void findDuplicates(int[] array) {    
        Arrays.sort(array);    
        for (int i = 0; i < array.length - 1; i++) {    
            if (array[i] == array[i + 1]) {    
                System.out.println("Duplicate element found: " + array[i]);    
            }    
        }    
    }    
    public static void main(String[] args) {    
        int[] array = {4, 5, 6, 7, 5, 6};    
        findDuplicates(array);    
    }    
}
}