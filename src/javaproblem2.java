// Write a program to enter two numbers and perform all arithmetic
// operations.

import java.util.Scanner;
public class javaproblem2 {
    public static void main(String[] args) throws Exception{
        Scanner algorithmInput=new Scanner(System.in);
        System.out.println("enter the value of a:");

        float a=algorithmInput.nextFloat();
        System.out.println("enter the value of b:");

        float b=algorithmInput.nextFloat();
        float sum=0,sub,multi,mod;
         float div;
        sum=a+b;
        System.out.println("sum of your number is =" + sum);
        sub=a-b;
        System.out.println("sub of your number is =" + sub);
        div=a/b;

        System.out.println("division of your number is =" + div);
        multi=a*b;
        System.out.println("multiplication of your number is =" + multi);
        mod=a%b;
        System.out.println("moduls of your number is =" + mod);
    }
}