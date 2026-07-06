public class linearsearchusingfunction {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 10;
        int a = found(arr,key);
        if(a==1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }

    static int found(int[] arr, int n){

        for(int m:arr){
            if(n==m){
                return 1;
            }
        }
        return -1;
    }
}
