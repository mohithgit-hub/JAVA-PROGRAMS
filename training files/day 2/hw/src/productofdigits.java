import java.util.Scanner;
public class productofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();
        int product = 1;

        while(n!=0){
            int a = n%10;
            product *= a;
            n=n/10;
        }
        System.out.println("the product of the digits of the given integer:"+product);
    }

}
