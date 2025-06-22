package BasicSorting;

 import java.util.Arrays;
 

public class Inbuilt_Sort {
      public static void InbuiltSort(Integer arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            // finding out the correct pos to insert
            while(prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] = curr;
        }

    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }
   
    // Counting Sort

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }

        int count[] = new  int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7, 8, 9, 10};
        countingSort(arr);
        //Arrays.sort(arr, 0, 2, Collections.reverseOrder());
        printArr(arr);
    }
}
