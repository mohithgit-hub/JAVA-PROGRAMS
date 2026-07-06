import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        int n = sc.nextInt();

        int rev=0;
        while(n!=0){
            
            int a = n%10;
            n = n/10;
            rev = (rev*10)+a;

        }
        System.out.println("the reversed number is:"+rev);
    }
}
