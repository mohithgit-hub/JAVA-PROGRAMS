import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();
        int sum = 0;

        while(n!=0){
            int a = n%10;
            n = n/10;
            sum+=a;

        }
        System.out.println("sum of the digits of the given integer:"+sum);

    }
}
