package sortingAlgorithm;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int ArrayNumber[] = {0,12,34,11,55,90,-1};
        BubbleSortPractice bubbleSortPractice = new BubbleSortPractice();
        bubbleSortPractice.bubbleSort(ArrayNumber);

        System.out.println("Sorted Array");
        for(int a=0; a<ArrayNumber.length; a++){
            System.out.print(ArrayNumber[a]+" ");
        }
    }

    public void  bubbleSort(int array[]){

        int n = array.length;

        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(array[j]>array[j+1]){
                    //swap array[j+1] with array [j]
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            //System.out.println(array[i]);
        }
    }
}
