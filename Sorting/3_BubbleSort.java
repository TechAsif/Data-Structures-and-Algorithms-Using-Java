import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){

        int arr[] = {5,2,3,1,10,7,4};
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        //Print the sorted value

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}

/*
* time complexity of this algorithm is O(n^2)
* */