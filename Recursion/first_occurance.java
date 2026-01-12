package Recursion;

public class first_occurance {
    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length) {  
            return -1;
        }
        if(arr[i] == key) {  // check arr of i key ke = h ki nhi
            return i;
        }

        return firstOccurance(arr, key, i+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {8, 8, 7,  6, 9, 5, 10, 5, 3, 2, 1};
        System.out.println(firstOccurance(arr, 5, 0));
    }
}
