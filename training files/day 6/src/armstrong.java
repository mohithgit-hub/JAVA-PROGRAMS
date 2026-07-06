import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        int n = sc.nextInt();
        int original = n;
        int original2=n;
        int am = 0;
        int digits = 0;

        while(n!=0){
            int a = n%10;
            n = n/10;
            digits++;
        }
        while(original!=0){
            int a =original%10;
            original = original/10;
            am += Math.pow(a, digits);
        }
        if(original2==am){
            System.out.println("is armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
