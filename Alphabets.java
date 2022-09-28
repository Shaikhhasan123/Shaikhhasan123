import java.util.Random;
public class Alphabets {

    public static void main(String[] args) {

        Random rand = new Random(); 

        char alphabet = (char) (rand.nextInt(128));

        if((alphabet >='A' && alphabet<='Z') || (alphabet >='a' && alphabet<='z')) {

            switch(alphabet)
            {
                case 'A':
                case 'a':
                    System.out.println("The alphabet '" + alphabet + "' is in the first four letters");
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("The alphabet '" + alphabet + "' is a vowel");
                    break;
                case 'B':
                case 'b':
                case 'C':
                case 'c':
                case 'D':
                case 'd':
                    System.out.println("The alphabet '" + alphabet + "' is in the first four letters");
                default:
                    System.out.println("The alphabet '" + alphabet + "' is a consonant");
            }
        }else {
            //if it's not an alphabet
            System.out.println("The alphabet '" + alphabet + "' is not an alphabet character");
        }
    }

}
