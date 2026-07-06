import java.util.Scanner;
public class searchinrange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of the array");
        int range = sc.nextInt();
        System.out.println("enter the key value:");
        int key = sc.nextInt();
        int[] arr = new int[range];
        for(int i=0;i<range;i++){
            arr[i] = i;
        }
        System.out.println(rangesearch(arr,key));
    }
    static int rangesearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println(arr[i]);
                return i;
            }
        }
        return -1;
    }
}
