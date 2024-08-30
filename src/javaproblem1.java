
//Write a program to enter two numbers and find their sum.

import java.util.Scanner;
public class javaproblem1{
    public static void main(String[] args) throws Exception{
        Scanner sumInput=new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a=sumInput.nextInt();

        System.out.println("enter the value of b :");
        int b=sumInput.nextInt();
        int sum=0;
         sum=a+b;
        System.out.println("sum of number is="+ sum);

    }
}