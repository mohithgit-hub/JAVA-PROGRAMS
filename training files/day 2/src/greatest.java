import java.util.Scanner;
public class greatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int a = sc.nextInt();
        System.out.println("Enter the second integer");
        int b = sc.nextInt();
        System.out.println("Enter the second integer");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is the greatest value");
        }
        else if(b>c)
        {
            System.out.println(b+"is the greatest");
        }
        else{
            System.out.println(c+"is the greates");
        }
    }

}
