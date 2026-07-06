import java.util.Scanner;
public class farm {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of ducks:");
         int d = sc.nextInt();
         System.out.println("Enter the time:");
         int t = sc.nextInt();
         int eggs = (t/5)*d;
         System.out.println("total number of eggs:"+eggs);
     }
}
