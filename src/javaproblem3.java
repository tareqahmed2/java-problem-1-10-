// 3. Write a program to enter length and breadth of a rectangle and find its
// perimeter.

import java.util.Scanner;
public class javaproblem3 {
    public static void main(String[] args) throws Exception{
        Scanner perimeterInput = new Scanner(System.in);

        System.out.println("enter the length:");
        int length;

        length=perimeterInput.nextInt();
        System.out.println("enter the length:");
        int breadth;

        breadth=perimeterInput.nextInt();
        int perimeter;
        if(length>0 && breadth>0)
        {
            perimeter=2*(length+breadth);
            System.out.println("the perimeter of the rectangle is :"+perimeter);

        }
    }
}
