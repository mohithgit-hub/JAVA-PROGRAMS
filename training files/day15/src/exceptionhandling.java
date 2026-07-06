import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptionhandling {
    public static void  main(String[] args){
        String name = "";
        int n = 0;
        Scanner sc = new Scanner(System.in);
        try{
            name = sc.nextLine();
            n = sc.nextInt();

        }catch(InputMismatchException e){
            System.out.println(e);
        }
        System.out.println(n);
        System.out.println(name);
    }
}
