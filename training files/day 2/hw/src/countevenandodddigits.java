import java.util.Scanner;
public class countevenandodddigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();
        int even = 0;
        int o = 0;
        while(n!=0){
            int a = n%10;
            if(a%2==0){
                even++;
            }
            else if((a+1)%2==0){
                o++;
            }
            n = n/10;
        }
        System.out.println("Total number of even numbers:"+even+"total number of odd numbers:"+o);

    }
}
