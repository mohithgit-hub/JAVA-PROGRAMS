import java.util.Scanner;
public class firstlastdigitsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer value:");
        int n = sc.nextInt();
        int lastdigit = n%10;
        int firstdigit = 0;


        while(n!=0){
            firstdigit = n%10;
            n = n/10;
        }
        int result = lastdigit+firstdigit;
        System.out.println("the sum of the first and last digit:"+result);
    }
}
