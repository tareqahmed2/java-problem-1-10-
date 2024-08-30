// Write a program to enter length in centimeter and convert it into meter
// and kilometer.
import java.util.Scanner;
public class javaproblem6{
    public static void main (String[] args) throws Exception{
        Scanner lengthInput=new Scanner(System.in); 
        int length;
        double meter,kilometer;
        System.out.println("enter the length in centimeter:");


        length=lengthInput.nextInt();
        System.out.printf("you enterd length= %d cm %n",length);
        

 meter=length/100;
 System.out.printf("you meter length is:%.4f m %n",meter);
 kilometer=meter/1000;
 System.out.printf("your kilometer length is= %.4f km %n ",kilometer);
    }
}