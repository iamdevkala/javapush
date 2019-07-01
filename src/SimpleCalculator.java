import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int numOne;
        int numTwo;
        int command;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        numOne = input.nextInt();
        numTwo = input.nextInt();

        System.out.println("Please enter your command from 1 to 4");
        System.out.println(" 1 for addition \n 2 for substraction \n 3 for multiplication \n 4 for division");
        command = input.nextInt();

        if(command == 1){
            System.out.println("The total is  " +(numOne+numTwo));
        }

        else if(command == 2){
            System.out.println("The sub is " +(numOne-numTwo));
        }

        else if(command == 3){
            System.out.println("Multplication of two numbers is " +(numOne*numTwo));
        }

        else if(command == 4){
            System.out.println("divivson ot two numbers is " +(numOne/numTwo));
        }

        else {
            System.out.println("Wrong input");
        }
    }
}
