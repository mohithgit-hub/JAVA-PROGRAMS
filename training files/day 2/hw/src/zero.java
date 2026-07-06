import java.util.Scanner;
public class zero {
    public static void main(String[] args){
        System.out.println("enter the integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            int a = n%10;
            if(a==0){
                count++;
            }
            n = n/10;
        }
        System.out.println("number of zeroes:"+count);
    }
}
