public class InsertionSort {
    public static void main(String args[]){

        int num[]={5,1,7,2,3};

        for(int i=1;i<5;i++){
            int x =num[i];
            int j = i - 1;

            while (j>=0 && num[j]>x){
                num[j + 1] = num[j];
                j--;
            }
           num[j+1] = x;
        }

        //Print the sorted array
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}

/*
* time complexity of this algorithm is O(n^2)
* */