import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        output ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any numbers");
         num1  = input.nextInt();
         num2 = input.nextInt();
         output  = input.nextInt();
         if( output  == '+') {
             System.out.println("The result is " +num1+num2);
        }
    }
}
