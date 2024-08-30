// Write a program to enter temperature in Fahrenheit(°F) and convert it
// into Celsius(°C)
import java.util.Scanner;
public class javaproblem8 {

    public static void main(String[] args) throws Exception{
        Scanner tempInput=new Scanner(System.in);
        System.out.println("enter the fahrenheit degree:");

        double fahreneheit=tempInput.nextDouble();
        System.out.printf("you entered =%.4f degfahrenheit %n ",fahreneheit);
        double celcius=(5*(fahreneheit-32))/9;
                 
        System.out.printf("the celcius degree is:%.4f degcelsius %n",celcius);

    }
}