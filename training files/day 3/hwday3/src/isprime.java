import java.util.Scanner;
public class isprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer value:");
        int n = sc.nextInt();

        if(n<=1){
            System.out.println("the given is not a prime number");
        }
        else{
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("the given is not a prime number:");
                    break;
                }
                else{
                    System.out.println("the given is a prime number");
                }
            }
        }
    }
}
