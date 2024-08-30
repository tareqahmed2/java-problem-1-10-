// Write a program to enter radius of a circle and find its diameter,
// circumference and area.
import java.util.Scanner;
public class javaproblem5{
    public static void main(String[] args) throws Exception{
        Scanner circleInput=new Scanner(System.in);
        double pi=Math.PI;
        double radius,diameter,circumference,area;
        System.out.println("enter the radius:");

        radius=circleInput.nextDouble();
        System.out.printf("you entered radius =%.2f%n",radius);
        diameter=2*radius;
        System.out.printf("circle diameter =  =%.2f%n",diameter);

        circumference=2*pi*radius;
        
        System.out.printf("circle circumference =  =%.2f%n",circumference);

        area=pi*(radius*radius);
        System.out.printf("circle area =  =%.2f%n",area);

    }
}

