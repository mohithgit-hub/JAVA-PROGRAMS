import java.util.Scanner;
public class count {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a key:");
        int keys=sc.nextInt();
        int count=0;
        while(n!=0){
            int pop=n%10;
            if(pop==keys){
                count++;
            }
            n=n/10;
        }
        System.out.println();
    }

}
