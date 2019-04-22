public class SelectionSort {
    public static void main(String args[]){

        int num[]={5,1,7,2,3};

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
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