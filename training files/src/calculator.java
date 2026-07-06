import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter +.for addition\n-.for subtration\n *.for multiplication\n /.for division:");
        String choice = sc.nextLine();
        System.out.println("Enter the value of A:");
        int a = sc.nextInt();
        System.out.println("Enter the value of B:");
        int b = sc.nextInt();
        switch(choice)
        {
            case "+":
                int add=a+b;
                System.out.println("Result of addition:"+add);
                break;

            case "-":
                int sub=a-b;
                System.out.println("Result of subtraction:"+sub);
                break;

            case "*":
                int mul=a*b;
                System.out.println("Result of multiplication:"+mul);
                break;

            case "/":
                int div=a/b;
                System.out.println("Result of division:"+div);
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

    }
}
