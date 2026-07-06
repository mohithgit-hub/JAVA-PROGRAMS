import java.util.Scanner;
public class minmax {
    public static void main(String[] args){
        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 1;

        for(int i=0;i<5;i++){
            n[i]=sc.nextInt();
        }
        for(int num:n){
            if(num>=max){
                max=num;
            }
        }
        for(int num:n){
            if(num<=min){
                min=num;
            }
        }

        System.out.println("the min:"+min);
        System.out.println("the max:"+max);
    }
}
