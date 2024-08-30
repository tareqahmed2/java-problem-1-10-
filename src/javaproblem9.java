// 9. Write a program to convert days into years, weeks and days.
import java.util.Scanner;
public class javaproblem9 {

    public static void main(String[] args) throws Exception{

        Scanner daysInput=new Scanner(System.in);
        System.out.println("enter days:");

        int days=daysInput.nextInt();
        int years,month,weeks;
        years=days/365;
        System.out.printf(" years:%d years %n ",years);

        month=(days % 365)/30;
        System.out.printf(" month:%d month %n ",month);

        weeks=(days % 365 % 30)/7; 
       System.out.printf(" weeks:%d weeks %n ",weeks);
        days=(days % 365 % 30 % 7);
        System.out.printf(" days:%d days %n ",days);
    }
}