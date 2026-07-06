import java.util.Scanner;
public class khr {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int n = sc.nextInt();
        int i=0;
        while(i<n){
            i++;
            System.out.println(i+"*7="+i*7);
        }
    }
}
