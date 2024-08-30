//Write a program to enter length and breadth of a rectangle and find its
// area.
  import java.util.Scanner;
 public class javaproblem4 {
 
    public static void main(String[] args) throws Exception{
        Scanner areaInput=new Scanner(System.in);
        System.out.println("enter the length:");
     
        int length=areaInput.nextInt();
        int breadth=areaInput.nextInt();
        int area;
        area=length*breadth;
        System.out.println("the area of this rectangle is ="+area);
        
       }
 }
