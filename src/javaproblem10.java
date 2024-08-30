// 10. Write a program to find power of any number x ^ y.
import java.util.Scanner;
public class javaproblem10 {

    public static void main (String[] args) throws Exception{
        Scanner exponentInput=new Scanner(System.in);
        System.out.println("enter the base :");
        double base=exponentInput.nextDouble();
        System.out.println("enter the power :");

        double power=exponentInput.nextDouble();
        double exponent=Math.pow(base, power);
        System.out.printf("the resslt of base^power %.4f %n :",exponent);

    }
}