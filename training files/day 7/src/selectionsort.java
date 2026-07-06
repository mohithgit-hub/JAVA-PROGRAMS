public class selectionsort {
    public static void main(String[] args){
        int[] arr = {64,25,12,22,11};
        selectionSort(arr);
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
    static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
