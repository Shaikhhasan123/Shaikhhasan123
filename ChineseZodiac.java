public class ChineseZodiac {
//rat    ox   tiger   rabbit   dragon   snake   horse   sheep   monkey   rooster   dog    pig
//1996   1997  1998   1999     2000      2001  2002     2003    2004     2005     2006    2007
//2008   2009  2010   2011     2012      2013  2014     2015    2016    2017      2018    2019
//% 12
//  4     5     6      7        8        9     10        11      0      1          2       3

        public static void main(String[] args) {

            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            if (year % 12 == 4) {
                System.out.println("Animal of the year is Rat.");

            }else if (year % 12 == 5) {
                System.out.println("Animal of the year is Ox.");

            }else if (year % 12 == 6) {
                System.out.println("Animal of the year is Tiger.");

            }else if (year % 12 == 7) {
                System.out.println("Animal of the year is Rabbit.");

            }else if (year % 12 == 8) {
                System.out.println("Animal of the  year is Dragon.");

            }else if (year % 12 == 9){
                System.out.println("Animal of the year is Snake.");

            }else if (year % 12 == 10){
                System.out.println("Animal of the year is Horse.");

            }else if (year % 12 == 11){
                System.out.println("Animal of the year is Sheep.");

            }else if (year % 12 == 0){
                System.out.println("Animal of the year is Monkey.");

            }else if (year % 12 == 1){
                System.out.println("Animal of the year is Rooster.");

            }else if (year % 12 == 2){
                System.out.println("Animal of the year is Dog.");

            }else if (year % 12 == 3){
                System.out.println("Animal of the year is Pig.");
            }
        }

}
