import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner input = new Scanner(System.in);

        System.out.println("give me first number :");

          int a=input.nextInt();
          System.out.println("you entered :"+a);
        System.out.println("give me second number :");

          int b=input.nextInt();
          System.out.println("you entered :"+b);

        System.out.println("give me third number :");

          int c=input.nextInt();
          System.out.println("you entered :"+c);

        System.out.println("give me fourth number :");

          int d=input.nextInt();
          System.out.println("you entered :"+d);
          int sum=a+b+c+d;
          System.out.println("sum of all numbers is ="+sum);

        
    }
}
