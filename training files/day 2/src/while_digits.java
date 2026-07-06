import java.util.Scanner;
public class while_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int pop = n%10;
            sum+=pop;
            n=n/10;
        }
        System.out.println(sum);
    }
}
