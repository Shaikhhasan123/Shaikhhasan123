/**
 * Class: Insurance
 * @author: Shaikh Hasan
 * @version: 1.0
 * Course: ITEC 2140
 * Date: September 15, 2022
 * Description: This program will calculate the cost of car insurance based on the drivcer age and number of accidents. 
 */
import java.util.*;
public class Insurance
{
    public static void main(String[] args) {
        int age;
        int accidents;
        int surcharge;
        int base_insurance_cost=300; //Base insurance cost is 300
        int total_ins;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of the driver:");
        age=sc.nextInt();
        if(age<27){ //if driver age is less than 27 it executes inside code
            System.out.println("Enter number of accidents:");
            accidents=sc.nextInt(); //taking surcharge as user input
            if(accidents==1){
                surcharge=100;
                total_ins= base_insurance_cost+surcharge;
                System.out.println("Total Insurance is:"+total_ins); //printing total insurance
            }
            if(accidents==2){
                surcharge=150;
                total_ins= base_insurance_cost+surcharge;
                System.out.println("Total Insurance is:"+total_ins);
            }
            if(accidents==3){
                surcharge=250;
                total_ins= base_insurance_cost+surcharge;
                System.out.println("Total Insurance is:"+total_ins);
            }
            if(accidents>=4){
                surcharge=1000;
                total_ins= base_insurance_cost+surcharge;
                System.out.println("Total Insurance is:"+total_ins);
            }

        }
        else{ //If driver age is greater than 27 it executes inside code
            System.out.println("Age has to be less than 27");
        }
    }
}
