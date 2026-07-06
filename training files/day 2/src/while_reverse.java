import java.util.Scanner;
public class while_reverse {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        while(n!=0){
            int rev = 1;
            int pop = n%10;
            int cut = n/10;
            rev = rev*10+pop;
        }
    }
}
