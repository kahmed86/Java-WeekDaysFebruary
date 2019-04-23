package sortingAlgorithm;

public class SelectionSortPractice {

    public void selectionSort(int[] array){

        //{0,12,34,11,55,90,-1}
        for(int i=0; i<array.length-1; i++){

            int min_idx = i;
            for(int j=i+1; j<array.length; j++){

                if(array[j]<array[min_idx]){
                    min_idx=j;
                }
                int temp = array[min_idx];
                array[min_idx]=array[i];
                array[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int ArrayNumber[] = {0,12,34,11,55,90,-1};
        SelectionSortPractice selectionSortPractice = new SelectionSortPractice();
        selectionSortPractice.selectionSort(ArrayNumber);

        System.out.println("Sorted Array");
        for(int a=0; a<ArrayNumber.length; a++){
            System.out.print(ArrayNumber[a]+" ");
        }
    }
}
