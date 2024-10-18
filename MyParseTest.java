import java.time.Period;
import java.util.Scanner;

public class MyParseTest {
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter the years: ");
    String years = userInput.nextLine();
    System.out.println("Enter the months: ");
    String months = userInput.nextLine();
    System.out.println("Enter the days: ");
    String days = userInput.nextLine();
    
    String time = "P"+ years +"Y"+ months +"M"+ days +"D";

    Period p = Period.parse(time);
    System.out.println(p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days"); 
    System.err.println("Names");
    }
}
