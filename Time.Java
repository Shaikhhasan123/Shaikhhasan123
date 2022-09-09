/**
 * Class: Time
 * @author: Shaikh Hasan
 * @version: 1.0
 * @course: ITEC 2140 Fall 2022
 * date: September 8, 2022
 * description: This program will calculate and display the number of seconds remaining and passed in a pay and the percentage of the day that has passed.  
 */
public class Time {
    public static void main(String [] args){
       // 5 is 17 hours in 24-hour clock/
        double hour = 17;

        double minute = 15;

        double second = 30;

        double pastSeconds = ( hour * 60 * 60 ) + ( minute * 60 ) + second;
        double totalSeconds = 24 * 60 * 60;
        double remainingSeconds = totalSeconds - pastSeconds;

        System.out.print(" The number of seconds since midnight: " );
        System.out.println(pastSeconds);

        System.out.print(" The number of seconds remaining in the day is: ");
        System.out.println(remainingSeconds);

        System.out.print(" The percentage of the day that has passed is: ");
        System.out.println(pastSeconds * 100/ totalSeconds);

    }

}
