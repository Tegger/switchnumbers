import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int user_input;


        System.out.println("Please select a number 1 through 10!");
        Scanner scanner = new Scanner(System.in);
        user_input = scanner.nextInt();

        switch (user_input){

            case 1: user_input = 1;
                System.out.println("You have selected 1!");
                break;
            case 2: user_input = 2;
                System.out.println("You have selected 2!");
                break;
            case 3: user_input = 3;
                System.out.println("You have selected 3!");
                break;
            case 4: user_input = 4;
                System.out.println("You have selected 4!");
                break;
            case 5: user_input = 5;
                System.out.println("You have selected 5!");
                break;
            case 6: user_input = 6;
                System.out.println("You have selected 6!");
                break;
            case 7: user_input = 7;
                System.out.println("You have selected 7!");
                break;
            case 8: user_input = 8;
                System.out.println("You have selected 8!");
                break;
            case 9: user_input = 9;
                System.out.println("You have selected 9!");
                break;
            case 10: user_input = 10;
                System.out.println("You have selected 10!");
                break;
            default: System.out.println("You have selected an incorrect number!");
                break;


        }

    }
}
