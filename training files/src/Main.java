import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age>=40)
        {
            System.out.println("Your are a senior citizen");
        }
        else if(age<40 && age>=18){
            System.out.println("You are an adult");
        }
        else if(age>=0 && age<18){
            System.out.println("Your a child");
        }
        else{
            System.out.println("Enter a valid age");
        }
    }
}