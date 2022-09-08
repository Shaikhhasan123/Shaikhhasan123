/**
 * Class:ConvertToCelsius
 * @author: Shaikh Hasan
 * @version: 1.2
 * @course: ITEC 2140 Fall 2022
 * date: September 8, 2022
 * description: This program will convert 100 degrees Fahrenheit to Celsius.
 */
public class ConvertToCelsius {
    public static void main (String [] args)
    {
      int Fahrenheit = 100;
      double Celsius = (Fahrenheit - 32 ) * 5/9;

      System.out.print(" 100 degrees Fahrenheit = " + Celsius + " degrees Celsius ");

    }

}
