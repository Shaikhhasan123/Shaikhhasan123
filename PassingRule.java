import java.util.Scanner;

public class PassingRule {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your percentage in class: ");
        double percentage = scan.nextDouble();

        if(percentage >= 90){
            System.out.println("Grade in class is A");
        }else if(percentage < 90 && percentage >= 80){
            System.out.println("Grade in class is B");
        }else if(percentage < 80 && percentage >= 70){
            System.out.println("Grade in class is C");
        }else if(percentage < 70 && percentage >= 60){
            System.out.println("Grade in class is D");
        }else if(percentage < 60 && percentage >= 60){
            System.out.println("Just Passed: Grade F");
        }else {
            System.out.println("You failed the class!");
        }
    }
}
