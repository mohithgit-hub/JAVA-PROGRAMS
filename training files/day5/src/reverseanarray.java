import java.util.Scanner;
public class reverseanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        int left = 0;
        int right = 4;


        System.out.println("enter the array elements:");
        for (int i =0; i <5; i++) {
            n[i] = sc.nextInt();
        }
        while(left<right){
            int temp = n[right];
            n[right] = n[left];
            n[left] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(n[i]);
        }
    }
}
