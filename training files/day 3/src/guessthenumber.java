import java.util.Random;
import java.util.Scanner;
public class guessthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int i = rand.nextInt(100);
        int n;

        do {
            {
                System.out.println("enter the number:");
                n = sc.nextInt();
                if(n<i){
                    System.out.println("the number is higher");
                }
                else if(n>i){
                    System.out.println("the number is lower");
                }
                else if(n==i){
                    System.out.println("the number is "+i+" you got it");
                }
            }
        }while(n!=i);
    }
}
