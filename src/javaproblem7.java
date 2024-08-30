// Write a program to enter temperature in °Celsius and convert it into
// °Fahrenheit.
import java.util.Scanner;
public class javaproblem7{
    public static void main(String[] args) throws Exception{
        
        Scanner tempInput=new Scanner(System.in);
        System.out.println("give the celcius temperature:");

        double celcius=tempInput.nextDouble();
        System.out.printf("you entered celcius temp:%.4f  %n °Celsius",celcius);

         double fahreneheit=((9*celcius)+160)/5;

         System.out.printf("you fahrenheit temp:%.4f  %n  °Fahrenheit",fahreneheit);

    }
}